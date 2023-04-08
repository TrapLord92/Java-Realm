package com.traplord.graphicuserinterface;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class S18BorderLayout {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

//Border Layout
//
//
JButton b1=new JButton("North");
JButton b2=new JButton("South");
JButton b3=new JButton("East");
JButton b4=new JButton("West");
JButton b5=new JButton("Center");

    jFrame.setLayout(new BorderLayout(20,15));
    jFrame.add(b1,BorderLayout.NORTH);
    jFrame.add(b2,BorderLayout.SOUTH);
    jFrame.add(b3,BorderLayout.EAST);
    jFrame.add(b4,BorderLayout.WEST);
    jFrame.add(b5,BorderLayout.CENTER);









    }
}
