package com.traplord.arraylist;

import java.util.ArrayList;

public class WrapClass {
    public static  void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();

        //Wrapper class
        // that wraps (store )primitive data as an object

        Integer y=15;
        Integer z=y.intValue();
        list.add(y);
        list.add(z);;
        System.out.println(list);
    }


}
