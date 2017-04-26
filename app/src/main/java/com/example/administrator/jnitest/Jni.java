package com.example.administrator.jnitest;

/**
 * Created by Administrator
 *
 * @Author Dome
 * @Time 2017/4/26
 */
public class Jni {

    static {
        System.loadLibrary("jni");
    }

    public native String getString();
}
