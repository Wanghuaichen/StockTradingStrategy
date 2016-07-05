package com.rottenwan.stocktradingstrategy.controller;

import android.support.v4.app.Fragment;

import com.rottenwan.stocktradingstrategy.ManagerFragmentActivity;

/**
 * Created by hewei on 2016-04-04  .*/
public class CompoundInterestActivity extends ManagerFragmentActivity{
    @Override
    public Fragment getFragment() {
        return new CompoundInterestFragment();
    }
}
