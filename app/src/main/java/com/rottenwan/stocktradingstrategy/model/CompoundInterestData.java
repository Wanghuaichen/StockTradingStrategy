package com.rottenwan.stocktradingstrategy.model;

/**
 * Created by hewei on 2016-04-05  .*/
public class CompoundInterestData {
    private static CompoundInterestData sCompoundInterestData;
    private int principal = 0, year = 0;
    private float rate = 0;


    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public static CompoundInterestData getInstance() {
        if (sCompoundInterestData == null) {
            sCompoundInterestData = new CompoundInterestData();
        }
        return sCompoundInterestData;
    }
}
