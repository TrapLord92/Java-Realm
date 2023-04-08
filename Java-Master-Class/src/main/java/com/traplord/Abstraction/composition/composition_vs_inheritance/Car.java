package com.traplord.Abstraction.composition.composition_vs_inheritance;

public class Car extends Vehicle {
    //car has-an engine
    Engine engine;

    //car is a vehicle


    public Car(int modelyear, String companyName, Engine engine) {
        super(modelyear, companyName);
        this.engine = engine;
    }

    public void startCar(){
        System.out.println("Car Started");
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice()+2000;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", modelyear=" + modelyear +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
