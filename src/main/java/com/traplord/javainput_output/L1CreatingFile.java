package com.traplord.javainput_output;

import java.io.File;
import java.io.IOException;

public class L1CreatingFile {


    //steps to creat file in java
   public static void main(String[] args){

    File file=new File("E:\\##Java\\###THINGSDONE#\\" +
            "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
            "src\\main\\java\\com\\traplord\\" +
            "javainput_output/hello.txt");




        try {
            if (file.createNewFile()) {
                System.out.println("File Created" + file.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   }


}
