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

package org.jetbrains.kotlin.cli.jvm.repl.messages

import org.jetbrains.kotlin.utils.rethrow
import java.io.PrintWriter
import java.io.StringWriter

class ReplErrorLogger(private val ideMode: Boolean, private val replWriter: ReplWriter) {
    fun logException(e: Throwable?) {
        if (ideMode) {
            val errorStringWriter = StringWriter()
            val errorPrintWriter = PrintWriter(errorStringWriter)
            e?.printStackTrace(errorPrintWriter)

            val writerString = errorStringWriter.toString()
            val internalErrorText = if (writerString.isEmpty()) "Unknown error" else writerString

            replWriter.sendInternalErrorReport(internalErrorText)
        }

        throw rethrow(e ?: Throwable("null exception", e))
    }
}