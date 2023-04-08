package com.traplord.Abstraction.composition;

public class Circle {
    private Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    //Area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
