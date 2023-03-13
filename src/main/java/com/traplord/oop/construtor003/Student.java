package com.traplord.oop.construtor003;

public class Student {
//    states=variables
    String name;
    int age;
    char sex;
    //Behaviours=Methods

    public void eating(){
        System.out.println("Eating");
    }
    public void drinking(){
        System.out.println("Drinking");
    }
    public void running(){
        System.out.println("Running");
    }

    // constructor default empty
    public Student() {
    }
// constructor with parameters and full state
    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // constructor with inicial values

    public Student(String name,int age,char sex) {
        this.name = "Bernardo";
        this.age = 22;
        this.sex = 'M';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
