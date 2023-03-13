package com.traplord.collection_framework.mapa_interfeice;


import java.util.HashMap;
import java.util.Map;

public class MapLooping {
    public static void main(String[] args){

        Map<String,Integer> phoneNumbers=new HashMap<>();
        phoneNumbers.put("Bernardo",12348755);
        phoneNumbers.put("Chris",7895656);

    for (String name:phoneNumbers.keySet()){
        Integer number=phoneNumbers.get(name);
        System.out.println(name + " : " + number);
    };


    }
}
