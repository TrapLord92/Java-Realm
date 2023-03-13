package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S15JTextArea {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

    //JTextArea

    JTextArea jTextArea=new JTextArea("Welcome");

    jTextArea.setBounds(10,30,200,200);

    //getting the data from text area

        JButton jButton =new  JButton("Get text area");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String k =jTextArea.getText();
                System.out.println(k);
            }
        });



    jFrame.add(jTextArea);
    jFrame.add(jButton);









    }
}
