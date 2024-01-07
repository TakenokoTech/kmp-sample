package tech.takenoko.android.kmp.interop

import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
object KmpLog {
    fun debug(text: String) = Log_debug(text)
    fun info(text: String) = Log_info(text)
    fun warn(text: String) = Log_warn(text)
    fun error(text: String) = Log_error(text)
}
