#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_myapplication_MainActivity_getBaseUrlFromNative(JNIEnv *env, jobject thiz) {
    std::string baseURL = "https://my.backend.server";
    return env->NewStringUTF(baseURL.c_str());
}


extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_myapplication_MainActivity_getAPIKEY(JNIEnv *env, jobject thiz) {
    std::string apiKey = "m4f55bg85h5r9d5+5g";
    return env->NewStringUTF(apiKey.c_str());
}