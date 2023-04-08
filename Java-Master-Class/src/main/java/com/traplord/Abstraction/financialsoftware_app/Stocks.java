package com.traplord.Abstraction.financialsoftware_app;

public  class Stocks extends SharedAsset{
    private int totalShare;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShare = 0;
    }



    @Override
    public double getMarketValue() {
        return totalShare*getCurrentPrice();
    }

    public int getTotalShare() {
        return totalShare;
    }

    //Record a purchase of the given number of shares of the stock at given price per share
    public void purchaseShare(int numShares, double pricePerShare){

    addCost(numShares*pricePerShare);
    }
}
