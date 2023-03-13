package com.traplord.Abstraction.interfeice;

public class Main {
    public static void main(String[] args) {
        Shape shape =new Circle(10,10,8);
        Shape shape2=new Rectangle(5.7,7.2);
        Shape shape3=new Triangle(14,4,4,7,8);
        System.out.println("The area of the Circle: " + shape.CalculateArea());
        System.out.println("The perimeter of the Circle: " + shape.CalculatePerimeter());
        System.out.println("The area of the Rectangle: " + shape2.CalculateArea());
        System.out.println("The perimeter of the Rectangle: " + shape2.CalculatePerimeter());
        System.out.println("The area of triangle :" + shape3.CalculateArea());
    }
}
