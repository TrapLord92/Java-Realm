package com.traplord.Abstraction.composition.composition_vs_inheritance;

public class Engine {
    int productionYear;
    String manufactureCompany;

    public Engine(int productionYear, String manufactureCompany) {
        this.productionYear = productionYear;
        this.manufactureCompany = manufactureCompany;
    }
    public int setmaxRotationSpeed(){
        return 20000;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "productionYear=" + productionYear +
                ", manufactureCompany='" + manufactureCompany + '\'' +
                '}';
    }
}
