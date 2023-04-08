package com.traplord.oop.construtor003;

public class StepIntoConstrutor {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, 'M');
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);

    Student student3=new Student(null,32,'M');
        System.out.println(student3);}

}
