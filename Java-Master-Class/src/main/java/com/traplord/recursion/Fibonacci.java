package com.traplord.recursion;

public class Fibonacci {
    public static void main(String[] args){
         long fibo=fibonacci(12);
        System.out.println(fibo);
    }

    private static long fibonacci(int n) {
        //stoping condiction
        if (n<=1){
            return n;
        }
        return fibonacci( n-1) + fibonacci(n-2);
    }
}
