package com.traplord.oop.methods01;

public class MethodOverloading {
    //same method diferent parameters dataType

    public static void main(String[] args) {
        sameMetod(10, 20);
    }

    private static int sameMetod(int x, int y) {
        return x + y;
    }

    private static double sameMetod(double x, int y) {
     return x + y;
    }
}
