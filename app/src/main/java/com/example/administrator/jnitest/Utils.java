package com.example.administrator.jnitest;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator
 *
 * @Author Dome
 * @Time 2017/4/26
 */
public class Utils {

    private static final String NAME = "jni";

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public static void putString(Context context,String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value).commit();
    }

    /**
     *
     * @param context
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Context context, String key, String defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }
}
