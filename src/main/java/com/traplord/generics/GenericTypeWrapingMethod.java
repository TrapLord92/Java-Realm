package com.traplord.generics;

public class GenericTypeWrapingMethod {
    public static void main(String [] args){
        welcome("Hello");
        welcome(122);
        welcome(true);
    }

    public static <T> void welcome(T t) {
        System.out.println("Say " + t);
    }


}
