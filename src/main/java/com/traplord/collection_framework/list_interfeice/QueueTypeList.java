package com.traplord.collection_framework.list_interfeice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTypeList {
 public  static void main(String[] args){

    String [] data ={"to","be","or","not","to","be"};

    Queue<String> queue =new LinkedList<>();

    //adding data to stack

    for(String str:data){
        queue.add(str);}


    //stack behaviours

     System.out.println("Queue : " + queue);
     System.out.println("Queue Size : " + queue.size());
     System.out.println("Queue peek : " + queue.peek()); //return the value at the front of the queue witout removing it

     //removing elements from stack

     while (!queue.isEmpty()){
         System.out.print(" " + queue.remove());//removes and return the value at front of the queue

     }

     System.out.println();

}
}
