package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S4JScrolPane {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);


        //JScrollPANE
        JScrollPane scrollpane=new JScrollPane();
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(100,100,500,500);


//        adding jpanel to the Frame

        jFrame.add(scrollpane);

    }
}
