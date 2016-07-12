package com.rottenwan.stocktradingstrategy.model;

import java.text.DecimalFormat;

/**
 * Created by hewei on 2016-04-21
 * 操作网格数据的model层. MVC设计模式
 * .*/
public class GridStrategyData {
    private static GridStrategyData sGridStrategyData;
    private double mBuyGrid = 0;
    private double mSellGrid = 0;
    private String mStockName = null;
    private double mInvestmentAmount = 0;
    private double mInitialPrice = 0;

    private double mBuyA = 0;
    private double mBuyB = 0;
    private double mSellA = 0;
    private double mSellB = 0;

    DecimalFormat df = new DecimalFormat("#.00");

    public Double getBuyA() {
        return Double.parseDouble(df.format(mBuyA));
    }

    public double getBuyB() {
        return Double.parseDouble(df.format(mBuyB));
    }

    public double getSellA() {
        return Double.parseDouble(df.format(mSellA));
    }

    public double getSellB() {
        return Double.parseDouble(df.format(mSellB));
    }

    public void setBuyA(double buyA) {
        mBuyA = buyA;
    }

    public void setBuyB(double buyB) {
        mBuyB = buyB;
    }

    public void setSellA(double sellA) {
        mSellA = sellA;
    }

    public void setSellB(double sellB) {
        mSellB = sellB;
    }


    public String getStockName() {
        return mStockName;
    }

    public void setStockName(String stockName) {
        mStockName = stockName;
    }

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

    public double computeBuyA() {
        return getInitialPrice() - (getBuyGrid() * getInitialPrice());
    }

    public double computeBuyB() {
        return getInitialPrice() - (2 * getBuyGrid() * getInitialPrice());
    }

    public double computeSellA() {
        return computeBuyA() + getSellGrid() * computeBuyA();
    }

    public double computeSellB() {
        return computeBuyB() + 2 * getSellGrid() * computeBuyB();
    }
}
