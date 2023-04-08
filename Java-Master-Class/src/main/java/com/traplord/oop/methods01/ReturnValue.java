package com.traplord.oop.methods01;

public class ReturnValue {
    public static void main(String[] args){
        int result = addNumbers(5, 10);
        System.out.println("The result sum is: " + result);
    }

    private static int addNumbers(int i, int i1) {
   int total=i+i1;
   return total;
    }
}
