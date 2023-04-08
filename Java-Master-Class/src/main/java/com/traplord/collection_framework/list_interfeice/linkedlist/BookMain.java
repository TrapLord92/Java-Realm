package com.traplord.collection_framework.list_interfeice.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookMain {
   public static void main(String [] args){
      //Creating linked list object
        List<Book> bookList=new LinkedList<>();

    //creating object instance book
    Book book1=new Book(1,"New Day new life","Bernardo","Dream Network",10000);
    Book book2=new Book(1,"Training Days","Bernardo","Dream Network",10000);

    // adding book instance to the linked list

    bookList.add(book1);
    bookList.add(book2);

    //Iteracting with the linked list wit iterator
//
//       Iterator<Book> iterator=bookList.iterator();
//       while (iterator.hasNext()){
//           System.out.println(iterator.next().toString());
//       }

       //with for each
        for(Book book:bookList){
            System.out.println(book);
        }

   }



}
