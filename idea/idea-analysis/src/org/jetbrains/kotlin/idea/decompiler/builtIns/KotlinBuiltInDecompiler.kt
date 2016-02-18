/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.decompiler.builtIns

import com.intellij.ide.highlighter.JavaClassFileType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiManager
import com.intellij.psi.compiled.ClassFileDecompilers
import org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion
import org.jetbrains.kotlin.builtins.BuiltInsSerializedResourcePaths
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider
import org.jetbrains.kotlin.idea.decompiler.KtDecompiledFile
import org.jetbrains.kotlin.idea.decompiler.classFile.CURRENT_ABI_VERSION_MARKER
import org.jetbrains.kotlin.idea.decompiler.classFile.FILE_ABI_VERSION_MARKER
import org.jetbrains.kotlin.idea.decompiler.classFile.INCOMPATIBLE_ABI_VERSION_COMMENT
import org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledText
import org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText
import org.jetbrains.kotlin.idea.decompiler.textBuilder.defaultDecompilerRendererOptions
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.renderer.DescriptorRenderer
import org.jetbrains.kotlin.serialization.builtins.BuiltInsProtoBuf
import org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl
import java.io.ByteArrayInputStream

class KotlinBuiltInDecompiler : ClassFileDecompilers.Full() {
    private val stubBuilder = KotlinBuiltInStubBuilder()

    override fun accepts(file: VirtualFile): Boolean {
        return file.fileType == KotlinBuiltInFileType
    }

    override fun getStubBuilder() = stubBuilder

    override fun createFileViewProvider(file: VirtualFile, manager: PsiManager, physical: Boolean): FileViewProvider {
        return KotlinDecompiledFileViewProvider(manager, file, physical) { provider ->
            if (isInternalBuiltInFile(BuiltInDefinitionFile.read(provider.virtualFile))) {
                null
            }
            else {
                KtDecompiledFile(provider) { file ->
                    buildDecompiledTextForBuiltIns(file)
                }
            }
        }
    }
}

private val decompilerRendererForBuiltIns = DescriptorRenderer.withOptions { defaultDecompilerRendererOptions() }

fun buildDecompiledTextForBuiltIns(builtInFile: VirtualFile): DecompiledText {
    if (builtInFile.fileType != KotlinBuiltInFileType) {
        error("Unexpected file type ${builtInFile.fileType}")
    }

    val file = BuiltInDefinitionFile.read(builtInFile)
    when (file) {
        is BuiltInDefinitionFile.Incompatible -> {
            // TODO: test
            return DecompiledText(
                    INCOMPATIBLE_ABI_VERSION_COMMENT
                            .replace(CURRENT_ABI_VERSION_MARKER, BuiltInsBinaryVersion.INSTANCE.toString())
                            .replace(FILE_ABI_VERSION_MARKER, file.version.toString()),
                    mapOf()
            )
        }
        is BuiltInDefinitionFile.Compatible -> {
            val packageFqName = file.packageFqName
            val resolver = KotlinBuiltInDeserializerForDecompiler(file.packageDirectory, packageFqName, file.proto, file.nameResolver)
            val declarations = arrayListOf<DeclarationDescriptor>()
            declarations.addAll(resolver.resolveDeclarationsInFacade(packageFqName))
            for (classProto in file.classesToDecompile) {
                val classId = file.nameResolver.getClassId(classProto.fqName)
                declarations.add(resolver.resolveTopLevelClass(classId)!!)
            }
            return buildDecompiledText(packageFqName, declarations, decompilerRendererForBuiltIns)
        }
    }
}

internal sealed class BuiltInDefinitionFile {
    class Incompatible(val version: BuiltInsBinaryVersion) : BuiltInDefinitionFile()

    class Compatible(val proto: BuiltInsProtoBuf.BuiltIns, val packageDirectory: VirtualFile) : BuiltInDefinitionFile() {
        val nameResolver = NameResolverImpl(proto.strings, proto.qualifiedNames)
        val packageFqName = nameResolver.getPackageFqName(proto.`package`.getExtension(BuiltInsProtoBuf.packageFqName))

        val classesToDecompile = proto.classList.filter { classProto ->
            shouldDecompileBuiltInClass(nameResolver.getClassId(classProto.fqName))
        }

        private fun shouldDecompileBuiltInClass(classId: ClassId): Boolean {
            if (classId.isNestedClass) return false

            val realJvmClassFileName = classId.shortClassName.asString() + "." + JavaClassFileType.INSTANCE.defaultExtension
            return packageDirectory.findChild(realJvmClassFileName) == null
        }
    }

    companion object {
        fun read(file: VirtualFile): BuiltInDefinitionFile {
            val stream = ByteArrayInputStream(file.contentsToByteArray())

            val version = BuiltInsBinaryVersion.readFrom(stream)
            if (!version.isCompatible()) {
                return BuiltInDefinitionFile.Incompatible(version)
            }

            val proto = BuiltInsProtoBuf.BuiltIns.parseFrom(stream, BuiltInsSerializedResourcePaths.extensionRegistry)
            return BuiltInDefinitionFile.Compatible(proto, file.parent)
        }
    }
}

internal fun isInternalBuiltInFile(file: BuiltInDefinitionFile): Boolean {
    when (file) {
        is BuiltInDefinitionFile.Incompatible -> return true
        is BuiltInDefinitionFile.Compatible -> {
            return file.classesToDecompile.isEmpty() &&
                   file.proto.`package`.functionCount == 0 &&
                   file.proto.`package`.propertyCount == 0
        }
    }
}
