package com.traplord.collection_framework.list_interfeice;

import java.util.Stack;

public class StackTypeList {
 public  static void main(String[] args){

    String [] data ={"to","be","or","not","to","be"};

    Stack<String> stack =new Stack<>();

    //adding data to stack

    for(String str:data){
        stack.push(str);}


    //stack behaviours

     System.out.println("Stack : " + stack);
     System.out.println("Stack Size : " + stack.size());
     System.out.println("Stack peek : " + stack.peek()); //return the value at the top of the stack witout removing it

     //removing elements from stack

     while (!stack.isEmpty()){
         System.out.print(" " + stack.pop());//removes and return the value at the stack top

     }

     System.out.println();

}
}
