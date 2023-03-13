package com.traplord.javainput_output;

import java.io.*;

public class L7READER {




    //steps to creat file in java
   public static void main(String[] args)  {

 String data="\n" +
               "What is Lorem Ipsum?\n" +
               "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
               "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
               " when an unknown printer took a galley of type and scrambled it to make a" +
               " type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing" +
               " software like Aldus PageMaker including versions of Lorem Ipsum.";

 try {     Writer writer =new FileWriter("E:\\##Java\\###THINGSDONE#\\" +
         "JAVAMASTERCLASS\\Recap1\\" +
         "MasterJava001\\Masterjava001\\" +
         "src\\main\\java\\com\\traplord\\javainput_output/string.tx");

     //writing the string to the file
     writer.write(data);
     System.out.println("Data saved successfully.....");

     //closing
     writer.close();

 } catch (IOException e) {
     throw new RuntimeException(e);
 }


   }}
