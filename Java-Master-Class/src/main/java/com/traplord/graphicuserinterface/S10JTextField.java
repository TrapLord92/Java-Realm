package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S10JTextField {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

//      JTetxfiled:one single line

        JTextField textField = new JTextField();
        textField.setBounds(100,100,100,500);

        //Getting data from textField
        //JLabel
        JLabel jLabel=new JLabel();
        //Jbutton
        JButton jButton=new JButton("Get text now");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the text from the field
                  String s1=textField.getText();
                  //Display the entered text in the j label
                jLabel.setText(s1);
            }
        });








        jFrame.add(textField);
        jFrame.add(jButton);
        jFrame.add(jLabel);

    }
}
