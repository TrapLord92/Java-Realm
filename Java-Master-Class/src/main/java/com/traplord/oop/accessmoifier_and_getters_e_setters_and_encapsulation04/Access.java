package com.traplord.oop.accessmoifier_and_getters_e_setters_and_encapsulation04;

public class Access {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        student.setSex('M');

        Student student1=new Student(null,32,'M');

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Sex: " + student.getSex());
        System.out.println(student1);
        System.out.println(student1.getName());

        student.getEating();
    }
}
