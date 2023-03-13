package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S11JComboBox {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

    //JComboBox
        String [] list={"Java","C","Python","Kotlin","Android"};
        JComboBox cb =new JComboBox(list);


        cb.setBounds(50,50,90,20);

        //Event handling

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the selected item
                String s = (String ) cb.getSelectedItem();

                //Dectect the case

                switch(s){
                    case "Java":
                    System.out.println("Java selected");
                    break;
                    case "C":
                        System.out.println("C selected");
                        break;
                    case "Python":
                        System.out.println("Python Selected");
                        break;
                    case "Kotlyn":
                        System.out.println("Kotlyn Selected");
                        break;
                    case "Android":
                        System.out.println("Android Selected");
                        break;
                    default:
                        System.out.println("Please choose one item from the list");



                }

            }
        });










    jFrame.add(cb);

    }
}
