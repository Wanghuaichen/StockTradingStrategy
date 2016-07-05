package com.rottenwan.stocktradingstrategy;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hewei on 2016-06-21  .*/
public class ActivityCollector {
    public static List<Activity> acitivities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        acitivities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        acitivities.remove(activity);
    }

    public static void finishAllActivity() {
        for(Activity activity : acitivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
