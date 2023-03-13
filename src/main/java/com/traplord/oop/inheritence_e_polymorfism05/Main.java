package com.traplord.oop.inheritence_e_polymorfism05;

public class Main {
    public static void main(String[] args) {
        Lawyer william=new Lawyer();
        william.getLawyerGender();
        System.out.println(william.getLawyerGender());

        LegalSecretary amanda= new LegalSecretary();
        amanda.getLegalSecretaryPosition();
        amanda.getHours();
        amanda.getSalary();
        System.out.println(amanda.getLegalSecretaryPosition());
        System.out.println(amanda.getHours());
        System.out.println(amanda.getSalary());

        Secretary lucinda =new Secretary();
        lucinda.getHours();
        lucinda.getSalary();
        lucinda.getSecretaryPosition();
        System.out.println(lucinda.getSecretaryPosition());
        System.out.println(lucinda.getHours());
        System.out.println(lucinda.getSalary());
        Marketing mark = new Marketing();
        System.out.println(mark.getPosition());




    }
}
