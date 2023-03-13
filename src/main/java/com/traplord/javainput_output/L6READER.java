package com.traplord.javainput_output;

import java.io.*;

public class L6READER {




    //steps to creat file in java
   public static void main(String[] args)  {

       char[] array=new char[50];

       try {
          Reader fileReader = new FileReader("E:\\##Java\\" +
                  "###THINGSDONE#\\JAVAMASTERCLASS\\Recap1\\MasterJava001" +
                  "\\Masterjava001\\src\\main\\java\\com" +
                  "\\traplord\\javainput_output\\read.tx");

//    Checking_if reader is ready

           System.out.println("The file is Ready :  " + fileReader.ready());

           //Reading Characters
           fileReader.read(array);
           System.out.println("Data in the stream :.... ");
           System.out.print(array);






       fileReader.close();
        } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


   }}
