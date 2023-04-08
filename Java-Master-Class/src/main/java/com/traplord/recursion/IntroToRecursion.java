package com.traplord.recursion;

import javax.sound.midi.Soundbank;

public class IntroToRecursion {
    public static void main(String[] args){

        sayHello(10);

    }

    private static void sayHello(int n) {
        if(n==0){
            System.out.println("The end");
        }
        else{
            System.out.println("Hello");
            //recursive moment
            sayHello(n-1);
        }

    }
}
