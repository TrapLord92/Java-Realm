package com.traplord.oop.inheritence_e_polymorfism05;

public class Polymorfism {
    public static void main(String[] args) {
        Employee [] employees=new Employee[5];
        employees[0]=new Lawyer();
        employees[1]=new LegalSecretary();
        employees[2]=new Secretary();
        employees[3]=new Marketing();

        Employee employee1=new Lawyer();
        Employee employee2=new Secretary();
        Employee employee3=new LegalSecretary();
        Employee employee4=new Marketing();
        System.out.println(employee3.getSalary());
//        acess casting to access the children methods and properties
        System.out.println(((Marketing)employee4).getPosition());


    }
}
