package com.traplord.arraylist;
//1 importing ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class loopingArrayList {
    public static void main(String[] args){
        //creating an ArrayList object
        ArrayList<Integer> list=new ArrayList<>();
        //adding elements to arrray
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //1Using ForLoop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //2 Using Iterator
        for(Integer element:list){
            System.out.println(element);
        }
        //3 Using Enhanced For Loop
        for(int element:list){
            System.out.println(element);
        }
        //using Iterator interface
        Iterator<Integer> iterator =list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
