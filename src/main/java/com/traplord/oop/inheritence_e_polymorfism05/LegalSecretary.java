package com.traplord.oop.inheritence_e_polymorfism05;

public class LegalSecretary extends Secretary{
    public String getLegalSecretaryPosition() {
        return "Legal Secretary";
    }

    @Override
    public int getHours() {
        return 65;
    }
    @Override
    public double getSalary() {
        return 10000;
    }
}
