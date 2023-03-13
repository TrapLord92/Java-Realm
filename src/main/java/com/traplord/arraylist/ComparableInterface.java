package com.traplord.arraylist;
//1 importing ArrayList
import java.util.ArrayList;

public class ComparableInterface {
    public static void main(String[] args){
        //creating an ArrayList object
        ArrayList<Integer> list=new ArrayList<>();
        //adding elements to arrray
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //compareTo:
        /*
        * -negative number means the less than relationship
        * -0 means that are equal
        * -a positive number indicate a greater-than relationship
        *
        * */

        System.out.println(list.get(0).compareTo(list.get(1)));

    }
}
