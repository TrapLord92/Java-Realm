package com.traplord.decisionmaking.exercises;

public class factorial {
    public static void main(String[] args){
        // calculate the factorial of 10 using a loop

        int result=1;
        for(int i=10;i>=1;i--){
            result *= i;
        }
        System.out.println(result);
    }
}
