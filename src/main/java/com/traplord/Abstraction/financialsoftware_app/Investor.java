package com.traplord.Abstraction.financialsoftware_app;

public class Investor {
    public static void main(String[] args){


        Asset investor1=new MutualFunds("AAPL",230.54);
        Asset investor2=new Stocks("GOOG", 1200.34);
        System.out.println(investor1);
        System.out.println(investor2);
    }
}
