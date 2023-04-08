package com.traplord.graphicuserinterface;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S14JRadioButton {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

    ///Radio button
        JRadioButton radio1=new JRadioButton("Java");
        JRadioButton radio2=new JRadioButton("C++");
        JRadioButton radio3= new JRadioButton("Python");
        JRadioButton radio4= new JRadioButton("Android");


        //adding Events to the radio
        radio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Java");
            }
        });
           radio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello C++");
            }
        });

             radio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Python");
            }
        });

               radio4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Android");
            }
        });








        //Adding radio buttons to the group

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        buttonGroup.add(radio3);
        buttonGroup.add(radio4);

        //adding button to the frame

        jFrame.add(radio1);
        jFrame.add(radio2);
        jFrame.add(radio3);
        jFrame.add(radio4);










    }
}
