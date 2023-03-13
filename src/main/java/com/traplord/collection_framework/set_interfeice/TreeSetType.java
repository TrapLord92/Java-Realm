package com.traplord.collection_framework.set_interfeice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetType {
    public static void main(String[] args){
        Set<String> s1=new TreeSet<>();
        s1.add("Apple");
        s1.add("Ganana");
        s1.add("Banana");
        s1.add("Cherry");

        //Iterrating over HashSet elements

        //using for each
//        for(String fruit:s1){
//            System.out.println(fruit);
//        }
        //Using to String
//        System.out.println(s1.toString());

        //Using Iterator

        Iterator<String> iterator=s1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
