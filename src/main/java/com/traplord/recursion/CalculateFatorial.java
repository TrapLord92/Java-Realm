package com.traplord.recursion;

public class CalculateFatorial {
    public static void main(String [] args){
        long result=findFactorial(5);
        System.out.println(result);
    }

    private static long findFactorial(int n) {

        if (n==0){
            return 1;
        }else{
            return n *findFactorial(n-1);
        }
    }
}
