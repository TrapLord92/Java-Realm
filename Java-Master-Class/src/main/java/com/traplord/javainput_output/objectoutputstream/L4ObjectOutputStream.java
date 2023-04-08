package com.traplord.javainput_output.objectoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class L4ObjectOutputStream {

//HOW TO SAVE OBJECT INTO DISK


    //steps to creat file in java
    public static void main(String[] args) {

        Employee employee = new Employee(1000, "Bernardo");

        //Saving data to the disk
        try {
            FileOutputStream file = new FileOutputStream("E:\\##Java\\###THINGSDONE#\\" +
                    "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
                    "src\\main\\java\\com\\traplord\\" +
                    "javainput_output/objectoutputstream/Employee.txt");

            //creating objectOutputstream

            ObjectOutputStream objectOutput = new ObjectOutputStream(file);
            //writing objects to the output stream

            objectOutput.writeObject(employee);
            System.out.println("The data was written to a file");
            //closing
            objectOutput.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }













}}
