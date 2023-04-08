package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S7JToolbar {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);


        //jToolbar
        JToolBar jToolbar=new JToolBar();
        jToolbar.setRollover(true);

//     adding buttton to toolbar
        JButton b1 =new JButton("File");
        JButton b2 =new JButton("Run");
        JButton b3 =new JButton("Stop");

        jToolbar.add(b1);
        jToolbar.add(b2);
        jToolbar.add(b3);
        jToolbar.addSeparator();
        jToolbar.setBounds(0,0,200,50);


//  adding jtoolbar to the Frame
        jFrame.add(jToolbar);

    }
}
