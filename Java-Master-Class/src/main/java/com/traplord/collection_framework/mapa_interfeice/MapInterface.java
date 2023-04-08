package com.traplord.collection_framework.mapa_interfeice;


import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args){

        Map<String,Integer> phoneNumbers=new HashMap<>();
        phoneNumbers.put("Bernardo",12348755);
        phoneNumbers.put("Chris",7895656);

        System.out.println(phoneNumbers.get("Bernardo"));
        System.out.println(phoneNumbers.containsKey("Bernardo"));
        System.out.println(phoneNumbers.isEmpty());
        System.out.println(phoneNumbers.size());
        System.out.println(phoneNumbers.keySet());


    }
}
