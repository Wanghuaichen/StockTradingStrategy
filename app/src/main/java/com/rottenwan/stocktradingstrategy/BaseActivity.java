package com.rottenwan.stocktradingstrategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**  Created by hewei on 2016-06-21    .*/
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
