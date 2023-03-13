package com.traplord.javainput_output.objectoutputstream;

import java.io.*;

public class L5ObjectInputStream {

//HOW TO SAVE OBJECT INTO DISK


    //steps to creat file in java
    public static void main(String[] args) {

//        Employee employee = new Employee(1000, "Bernardo");

        //Reading data from the disk
        try {
           FileInputStream file = new FileInputStream("E:\\##Java\\###THINGSDONE#\\" +
                    "JAVAMASTERCLASS\\Recap1\\MasterJava001\\Masterjava001\\" +
                    "src\\main\\java\\com\\traplord\\" +
                    "javainput_output/objectoutputstream/Employee.txt");

            ObjectInputStream  objecInputtput = new ObjectInputStream(file);
//            reading the object
            Employee employeeReader=(Employee) objecInputtput.readObject();

            System.out.println("Reading data..... ");
            System.out.println();
            System.out.println("Employee name : " + employeeReader.name);
            System.out.println("Employee salary : " + employeeReader.salary);


            //closing
            objecInputtput.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }}
