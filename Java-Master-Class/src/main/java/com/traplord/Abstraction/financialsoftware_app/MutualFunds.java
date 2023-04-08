package com.traplord.Abstraction.financialsoftware_app;

public class MutualFunds extends SharedAsset{
    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        this.totalShares=0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }



    //records purchase of the given shares at given price

    public void purchaseShares(double numShares, double pricePerShare){
        totalShares+=numShares;
        addCost(numShares*pricePerShare);
    }
}
