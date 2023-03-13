package com.traplord.Abstraction.interfeice;

public class Triangle implements Shape{
    double height;
    double base;
    double a;
    double b;
    double c;

    public Triangle(double height, double base, double a, double b, double c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double CalculateArea() {
        return height*base/2;
    }

    @Override
    public double CalculatePerimeter() {
        return a+b+c;
    }
}
