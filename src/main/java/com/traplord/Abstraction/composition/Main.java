package com.traplord.Abstraction.composition;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Circle circle = new Circle(point, 5);

        System.out.println(circle.calculateArea());
    }
}
