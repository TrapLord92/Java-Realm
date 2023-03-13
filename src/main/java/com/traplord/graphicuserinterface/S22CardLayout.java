package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S22CardLayout {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");


        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);


        jFrame.setLayout(new CardLayout(40,30));






    }
}
