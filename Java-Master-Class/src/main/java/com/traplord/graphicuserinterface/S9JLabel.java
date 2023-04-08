package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S9JLabel {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

        //Jlabel

        JLabel jLabel=new JLabel("Hello There Friends");
//        changing jlabel text

        JButton b1 =new JButton("Change Text");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //code to be executed when the user click the button
                jLabel.setText("Text Changed !URRRRRRRRRA");

            }
        });





        jFrame.add(jLabel);
        jFrame.add(b1);

    }
}
