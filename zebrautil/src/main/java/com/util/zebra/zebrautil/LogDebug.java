package com.util.zebra.zebrautil;

import android.util.Log;

/**
 * Created by sdauria on 16/02/2018.
 */

public class LogDebug {

    private static final String TAG = "MY_FIRST_LIBRARY";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
