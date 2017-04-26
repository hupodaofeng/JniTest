//
// Created by Administrator on 2017/4/26.
//

#include "com_example_administrator_jnitest_Jni.h"
JNIEXPORT jstring JNICALL Java_com_example_administrator_jnitest_Jni_getString
 (JNIEnv *env, jobject thiz)
 {
      return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
 }