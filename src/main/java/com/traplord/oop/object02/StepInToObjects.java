package com.traplord.oop.object02;

public class StepInToObjects {
   public static void main(String[] args){
       Student student =new Student();

       //seting  the values of the student object trough states=variables
       student.name="John";
       student.age=20;
       student.sex='M';

       //calling the behaviours=methods
       student.eating();
   }

}
