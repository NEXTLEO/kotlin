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

package org.jetbrains.kotlin.load.java.descriptors

import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor
import org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl
import org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope
import org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny
import org.jetbrains.kotlin.resolve.descriptorUtil.module
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor
import org.jetbrains.kotlin.types.KotlinType

fun copyValueParameters(
        newValueParametersTypes: Collection<KotlinType>,
        oldValueParameters: Collection<ValueParameterDescriptor>,
        newOwner: CallableDescriptor
): List<ValueParameterDescriptor> {
    assert(newValueParametersTypes.size == oldValueParameters.size) {
        "Different value parameters sizes: Enhanced = ${newValueParametersTypes.size}, Old = ${oldValueParameters.size}"
    }

    return newValueParametersTypes.zip(oldValueParameters).map {
        pair ->
        val (newType, oldParameter) = pair
        ValueParameterDescriptorImpl(
                newOwner,
                oldParameter,
                oldParameter.index,
                oldParameter.annotations,
                oldParameter.name,
                newType,
                oldParameter.declaresDefaultValue(),
                oldParameter.isCrossinline,
                oldParameter.isNoinline,
                if (oldParameter.varargElementType != null) newOwner.module.builtIns.getArrayElementType(newType) else null,
                oldParameter.source
        )
    }
}

fun ClassDescriptor.getParentJavaStaticClassScope(): LazyJavaStaticClassScope? {
    val superClassDescriptor = getSuperClassNotAny() ?: return null

    val staticScope = superClassDescriptor.staticScope

    if (staticScope !is LazyJavaStaticClassScope) return superClassDescriptor.getParentJavaStaticClassScope()

    return staticScope
}

fun DeserializedCallableMemberDescriptor.getImplClassNameForDeserialized(): Name? {
    return (packagePartSource as? JvmPackagePartSource)?.simpleName
}
