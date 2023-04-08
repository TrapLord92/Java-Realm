package com.traplord.javainput_output;

import java.io.*;

public class L3OutputStream {


    //steps to creat file in java
   public static void main(String[] args)  {
       String data="\n" +
               "What is Lorem Ipsum?\n" +
               "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
               "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
               " when an unknown printer took a galley of type and scrambled it to make a" +
               " type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing" +
               " software like Aldus PageMaker including versions of Lorem Ipsum.";

       OutputStream file= null;
       try {
           file = new FileOutputStream("E:\\##Java\\###THINGSDONE#\\" +
                   "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
                   "src\\main\\java\\com\\traplord\\" +
                   "javainput_output/lorem_ipsum.txt");

       //converting String into bytes
       byte[] databytes=data.getBytes();

       //writes data to the output stream


       System.out.println("The data was written to a file");

       file.close();
        } catch (IOException e) {
           throw new RuntimeException(e);
       }













}}
