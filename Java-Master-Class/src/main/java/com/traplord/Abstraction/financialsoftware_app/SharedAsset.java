package com.traplord.Abstraction.financialsoftware_app;

//RedunadnteCoding
public abstract class SharedAsset implements Asset {
    private String symbol;
    private double totalcost;
    private double currentPrice;

    public SharedAsset(String symbol,  double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalcost=0.0;
    }

    //adds a cost of the given amount to this asset
    public void addCost(double cost){
        totalcost += cost;
    }

    //returning the price per share of this asset

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
//return the current market value
    public abstract double getMarketValue();

    //return the profit earned on shares of this asset

    public double getProfit(){
        return getMarketValue()-totalcost;
    }

    @Override
    public String toString() {
        return "SharedAsset{" +
                "symbol='" + symbol + '\'' +
                ", totalcost=" + getTotalcost() +
                ", currentPrice=" + getCurrentPrice() +
                '}';
    }
}

