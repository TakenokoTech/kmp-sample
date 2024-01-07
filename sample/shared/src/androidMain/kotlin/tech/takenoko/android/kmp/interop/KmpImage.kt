package tech.takenoko.android.kmp.interop

@OptIn(ExperimentalUnsignedTypes::class)
object KmpImage {
    init {
        try {
            System.loadLibrary("shared")
        } catch (_: UnsatisfiedLinkError) {
        }
    }

    fun rgbToGray(array: UByteArray, width: Int, height: Int): UByteArray {
        val byteArr = rgbToGrayJni(
            array.toByteArray(),
            width,
            height,
        )
        return byteArr.toUByteArray()
    }

    private external fun rgbToGrayJni(array: ByteArray, width: Int, height: Int): ByteArray
}
