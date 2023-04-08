package com.traplord.oop.accessmoifier_and_getters_e_setters_and_encapsulation04;

public class Student {
//    states=variables
    private String name;
    private int age;
    private char sex;
    //Behaviours=Methods

    private void eating(){
        System.out.println("Eating");
    }

    private void drinking(){
        System.out.println("Drinking");
    }
    private void running(){
        System.out.println("Running");
    }

    // constructor default empty
    public Student() {
    }
    public Student(String name, int age, char sex) {
        this.name = "Bernardo";
        this.age = 22;
        this.sex = 'M';
    }

    // constructor with parameters and full state
    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // constructor with inicial values


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public void getEating(){
       eating();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                '}';
    }
}
