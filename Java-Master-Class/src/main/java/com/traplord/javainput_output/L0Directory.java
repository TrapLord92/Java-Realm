package com.traplord.javainput_output;

import java.io.File;

public class L0Directory {

    public static void main(String [] args){


        File directory=new File("E:\\##Java\\###THINGSDONE#\\" +
                "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
                "src\\main\\java\\com\\traplord\\javainput_output\\bernardo");
        directory.mkdirs();
        System.out.println("directory created");




    }

}
