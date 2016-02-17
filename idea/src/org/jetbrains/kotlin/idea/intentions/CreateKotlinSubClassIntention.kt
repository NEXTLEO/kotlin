/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.idea.intentions

import com.intellij.openapi.editor.Editor
import com.intellij.psi.util.PsiTreeUtil
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedDeclaration
import org.jetbrains.kotlin.psi.psiUtil.containingClassOrObject
import org.jetbrains.kotlin.psi.psiUtil.endOffset
import org.jetbrains.kotlin.psi.psiUtil.isAbstract

class CreateKotlinSubClassIntention : SelfTargetingIntention<KtNamedDeclaration>(KtNamedDeclaration::class.java,
                                                                                 "Create Kotlin subclass") {

    override fun isApplicableTo(element: KtNamedDeclaration, caretOffset: Int): Boolean {
        val klass = PsiTreeUtil.getParentOfType(element, KtClass::class.java) ?: return false
        if (klass.isEnum() || klass.isAnnotation() || klass.name == null) {
            return false
        }
        if (!klass.isInterface() && !klass.isSealed() && !klass.isAbstract() && !klass.hasModifier(KtTokens.OPEN_KEYWORD)) {
            return false
        }
        val privateConstructorsOnly =
                (klass.getPrimaryConstructor()?.hasModifier(KtTokens.PRIVATE_KEYWORD) ?: false) &&
                klass.getSecondaryConstructors().all { it.hasModifier(KtTokens.PRIVATE_KEYWORD) }
        if (privateConstructorsOnly) {
            return false
        }

        val endOffset = klass.node.findChildByType(KtTokens.LBRACE)?.startOffset ?: klass.endOffset
        if (element.textOffset >= endOffset) {
            return false
        }

        text = if (klass.isInterface()) {
            "Implement interface"
        }
        else if (klass.isAbstract()) {
            "Implement abstract class"
        }
        else if (klass.isSealed()) {
            "Implement sealed class"
        }
        else {
            "Create subclass"
        }
        return true
    }

    override fun applyTo(element: KtNamedDeclaration, editor: Editor?) {
        val klass = PsiTreeUtil.getParentOfType(element, KtClass::class.java) ?: return
        if (klass.isSealed() ||
            klass.hasModifier(KtTokens.PRIVATE_KEYWORD) && klass.containingClassOrObject != null) {
            createNestedSubclass(klass, editor)
        }
        else {
            createExternalSubclass(klass, editor)
        }

    }

    private fun createNestedSubclass(klass: KtClass, editor: Editor?) {
        throw UnsupportedOperationException("not implemented")
    }

    private fun createExternalSubclass(klass: KtClass, editor: Editor?) {
        throw UnsupportedOperationException("not implemented")
    }
}