package com.rottenwan.stocktradingstrategy.utils;

import android.util.Log;

/**
 * Created by hewei on 2016-05-12  .*/
public class LogUtil {
    public static final String TAG = "StockStrategyLogUtil";

    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARM = 4;
    public static final int ERROR = 5;

    public static final int LEVEL = DEBUG;

    public static void v(String msg) {
        if (LEVEL <= VERBOSE) {
            Log.v(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (LEVEL <= DEBUG) {
            Log.d(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (LEVEL <= INFO) {
            Log.i(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (LEVEL <= WARM) {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (LEVEL <= ERROR) {
            Log.e(TAG, msg);
        }
    }
}
