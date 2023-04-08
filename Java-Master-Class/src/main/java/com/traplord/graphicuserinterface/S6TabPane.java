package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S6TabPane {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);


        //jTabbPane
        JPanel p1=new JPanel();//main tab
        JPanel p2=new JPanel();//sales tab
        JPanel p3=new JPanel();//Contact tab
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.CYAN);
        p3.setBackground(Color.ORANGE);

//      creating tab pane
        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.setBounds(50,50,200,200);

        tabbedPane.add("Main",p1);
        tabbedPane.add("Sales",p2);
        tabbedPane.add("Contact us",p3);

//  adding jtabbedPane to the Frame
        jFrame.add(tabbedPane);

    }
}
