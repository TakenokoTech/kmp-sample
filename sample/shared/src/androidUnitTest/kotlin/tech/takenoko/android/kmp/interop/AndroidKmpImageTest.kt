package tech.takenoko.android.kmp.interop

import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalUnsignedTypes::class)
class AndroidKmpImageTest {

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray FFFFFF`() = testCaseRgbToGray(
        RgbToGrayParam(ubyteArrayOf(255U, 255U, 255U), width = 1, height = 1),
        ubyteArrayOf(255U),
    )

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray FF0000`() = testCaseRgbToGray(
        RgbToGrayParam(ubyteArrayOf(255U, 0U, 0U), width = 1, height = 1),
        ubyteArrayOf(76U),
    )

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray 00FF00`() = testCaseRgbToGray(
        RgbToGrayParam(ubyteArrayOf(0U, 255U, 0U), width = 1, height = 1),
        ubyteArrayOf(149U),
    )

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray 0000FF`() = testCaseRgbToGray(
        RgbToGrayParam(ubyteArrayOf(0U, 0U, 255U), width = 1, height = 1),
        ubyteArrayOf(29U),
    )

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray 000000`() = testCaseRgbToGray(
        RgbToGrayParam(ubyteArrayOf(0U, 0U, 0U), width = 1, height = 1),
        ubyteArrayOf(0U),
    )

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray 3x5`() {
        val inputArr = (0 until 15).flatMap { listOf<UByte>(255U, 255U, 255U) }
        val outputArr = (0 until 15).flatMap { listOf<UByte>(255U) }
        testCaseRgbToGray(
            RgbToGrayParam(inputArr.toUByteArray(), width = 3, height = 5),
            outputArr.toUByteArray(),
        )
    }

    @Test(expected = UnsatisfiedLinkError::class)
    fun `rgbToGray 4x5`() {
        val inputArr = (0 until 15).flatMap { listOf<UByte>(255U, 255U, 255U) }
        val outputArr = (0 until 15).flatMap { listOf<UByte>(255U) }
        testCaseRgbToGray(
            RgbToGrayParam(inputArr.toUByteArray(), width = 4, height = 5),
            outputArr.toUByteArray(),
        )
    }

    private fun testCaseRgbToGray(param: RgbToGrayParam, actual: UByteArray) {
        val expected = KmpImage.rgbToGray(param.array, param.width, param.height)
        assertEquals(expected.toList(), actual.toList())
    }

    private data class RgbToGrayParam(
        val array: UByteArray,
        val width: Int,
        val height: Int,
    )
}
