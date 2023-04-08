package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S1joptionPanel {

    public static void main(String[] args){
        //jOption
        //dialog and message
        //getting user input
        String firstNumber= JOptionPane.showInputDialog("Enter first Integer");
        String secondNumber=JOptionPane.showInputDialog("Enter Second Integer");

        int number1=Integer.parseInt(firstNumber);
        int number2=Integer.parseInt(secondNumber);

        int sum =number1+number2;

        //display result in a joption message dialog

        JOptionPane.showMessageDialog(null,"The result is " +sum,"sum of two integers",JOptionPane.PLAIN_MESSAGE);

    }
}
