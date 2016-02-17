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

package org.jetbrains.kotlin.diagnostics.rendering

sealed class RenderingContext {
    abstract operator fun <T> get(key: Key<T>): T

    abstract class Key<T>(val name: String) {
        abstract fun compute(objectsToRender: Collection<Any?>): T
    }

    class Impl(private val objectsToRender: Collection<Any?>) : RenderingContext() {
        private val data = linkedMapOf<Key<*>, Any?>()

        override fun <T> get(key: Key<T>): T {
            if (!data.containsKey(key)) {
                val result = key.compute(objectsToRender)
                data[key] = result
                return result
            }
            return data[key] as T
        }
    }


    object Empty : RenderingContext() {
        override fun <T> get(key: Key<T>): T {
            return key.compute(emptyList())
        }
    }

    companion object {
        @JvmStatic
        fun of(vararg objectsToRender: Any?): RenderingContext {
            return Impl(objectsToRender.toList())
        }
    }
}