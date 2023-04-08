package com.traplord.arraylist;
//1 importing ArrayList
import java.util.ArrayList;

public class ChangeAndRemove {
    public static void main(String[] args){
        //creating an ArrayList object
        ArrayList<Integer> list=new ArrayList<>();
        //adding elements to arrray
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //printing the ArrayList before removing any elements
        System.out.println(list);
        list.set(0,79);
        System.out.println(list);

        //removing
        list.remove(3);
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        //Printing the ArrayList

    }
}
