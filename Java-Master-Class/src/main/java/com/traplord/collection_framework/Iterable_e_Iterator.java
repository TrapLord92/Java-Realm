package com.traplord.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterable_e_Iterator {


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        //looping using iterators
//


        //looping using for each
        for(String fruit:list){
            System.out.println(fruit);
        }



    }


}
