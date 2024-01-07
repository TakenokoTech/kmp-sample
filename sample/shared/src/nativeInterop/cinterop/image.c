#ifndef KMP_SAMPLE_IMAGE_C
#define KMP_SAMPLE_IMAGE_C

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

unsigned char *Image_rgbToGray(const unsigned char *rgb, int width, int height) {
    unsigned char *gray = (unsigned char *) malloc(width * height * sizeof(unsigned char));
    for (int i = 0; i < width * height; i++) {
        int r = rgb[3 * i];
        int g = rgb[3 * i + 1];
        int b = rgb[3 * i + 2];
        gray[i] = (unsigned char) (0.299 * r + 0.587 * g + 0.114 * b);
    }
    return gray;
}

JNIEXPORT jbyteArray JNICALL
Java_tech_takenoko_android_kmp_interop_KmpImage_rgbToGrayJni(
        JNIEnv *env,
        jobject thiz,
        jbyteArray array,
        jint width,
        jint height
) {
    return Image_rgbToGray(array, width, height);
}

#endif //KMP_SAMPLE_IMAGE_C



