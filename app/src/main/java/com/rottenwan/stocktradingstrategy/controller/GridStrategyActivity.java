package com.rottenwan.stocktradingstrategy.controller;

import android.support.v4.app.Fragment;

import com.rottenwan.stocktradingstrategy.ManagerFragmentActivity;

/**
 * Created by hewei on 2016-04-21  .*/
public class GridStrategyActivity extends ManagerFragmentActivity{

    @Override
    public Fragment getFragment() {
        return new GridStrategyFragment();
    }
}
