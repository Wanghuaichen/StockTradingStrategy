package com.rottenwan.stocktradingstrategy.model;

/**
 * Created by hewei on 2016-04-21  .*/
public class GridStrategyData {
    private static GridStrategyData sGridStrategyData;
    private double mBuyGrid;
    private double mSellGrid;
    private double mInvestmentAmount;
    private double mInitialPrice;

    public double getInitialPrice() {
        return mInitialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        mInitialPrice = initialPrice;
    }

    public double getInvestmentAmount() {
        return mInvestmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        mInvestmentAmount = investmentAmount;
    }

    public double getBuyGrid() {
        return mBuyGrid;
    }

    public void setBuyGrid(double buyGrid) {
        mBuyGrid = buyGrid;
    }

    public double getSellGrid() {
        return mSellGrid;
    }

    public void setSellGrid(double sellGrid) {
        mSellGrid = sellGrid;
    }

    public static GridStrategyData getInstance() {
        if (sGridStrategyData == null) {
            sGridStrategyData = new GridStrategyData();
        }
        return sGridStrategyData;
    }
}
