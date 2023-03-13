package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S3JPanel {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);


        //JPANEL

        JPanel jPanel =new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.red);
        jPanel.setBounds(100,100,300,300);
        jPanel.setVisible(true);

//        adding jpanel to the Frame

        jFrame.add(jPanel);

    }
}
