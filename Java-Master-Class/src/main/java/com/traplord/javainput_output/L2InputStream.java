package com.traplord.javainput_output;

import java.io.*;

public class L2InputStream {


    //steps to creat file in java
   public static void main(String[] args) throws IOException {

    InputStream file=new FileInputStream("E:\\##Java\\###THINGSDONE#\\" +
            "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
            "src\\main\\java\\com\\traplord\\" +
            "javainput_output/hello.txt");

    int data=file.read();

    while(data !=-1){
        System.out.print((char) data);
        data =file.read();
    }







}}
