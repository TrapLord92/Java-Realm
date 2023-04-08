package com.traplord.Abstraction.composition.composition_vs_inheritance;

public class Vehicle {
    int modelyear;
    String companyName;

    public Vehicle(int modelyear, String companyName) {
        this.modelyear = modelyear;
        this.companyName = companyName;
    }
    public int calculatePrice(){
        return 10000;
    }
}
