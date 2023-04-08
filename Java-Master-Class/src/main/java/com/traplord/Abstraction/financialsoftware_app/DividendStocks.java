package com.traplord.Abstraction.financialsoftware_app;

public class DividendStocks extends Stocks {
    private double dividend;//ammount of divedend paid


    public DividendStocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        this.dividend = 0.0;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue()+dividend;
    }
    //records a dividend of the given amount per share

    public void payDividend(double amountPerShare){
        dividend+=amountPerShare*getTotalShare();
    }

}
