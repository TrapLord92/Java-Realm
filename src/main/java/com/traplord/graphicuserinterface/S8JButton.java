package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S8JButton {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);
        //jframe inicial state beckground before event
        jFrame.getContentPane().setBackground(Color.GREEN);

        //Button
        JButton b1 =new JButton("Click me");
        b1.setBounds(50,50,100,100);

        //event handling

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.BLUE);
            }
        });





//  adding jtoolbar to the Frame
        jFrame.add(b1);

    }
}
