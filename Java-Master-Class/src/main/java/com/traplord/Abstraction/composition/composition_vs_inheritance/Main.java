package com.traplord.Abstraction.composition.composition_vs_inheritance;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(2020, "Ford");
        Car car = new Car(2021, "Toyota", engine);
        car.startCar();
        System.out.println(car.calculatePrice());
        System.out.println(car);
    }
}
