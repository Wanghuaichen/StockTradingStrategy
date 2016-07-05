package com.rottenwan.stocktradingstrategy.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by hewei on 2016-06-21  .*/
public class StockStrategyApplication extends Application {
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
