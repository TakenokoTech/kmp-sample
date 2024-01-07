package tech.takenoko.android.kmp.interop

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.get
import kotlinx.cinterop.refTo

@OptIn(ExperimentalForeignApi::class)
object KmpImage {
    fun rgbToGray(array: UByteArray, width: Int, height: Int): UByteArray {
        val pointer = Image_rgbToGray(
            array.refTo(0),
            width,
            height,
        )
        requireNotNull(pointer)
        return UByteArray(width * height, pointer::get)
    }
}
