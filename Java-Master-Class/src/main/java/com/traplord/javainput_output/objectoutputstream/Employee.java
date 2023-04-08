package com.traplord.javainput_output.objectoutputstream;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int salary;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
