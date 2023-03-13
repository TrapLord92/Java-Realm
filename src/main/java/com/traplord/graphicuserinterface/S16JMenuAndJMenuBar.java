package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S16JMenuAndJMenuBar {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

  // Jmenu bar e j menu
    JMenuBar jMenuBar=new JMenuBar();
    JMenu menu = new JMenu("File");

    //items
    JMenuItem item1=new JMenuItem("Load");
    JMenuItem item2=new JMenuItem("Save");
    JMenuItem item3=new JMenuItem("New");


    //Adding Elements

    menu.add(item1);
    menu.add(item2);
    menu.add(item3);

    //   Add Event listener
    item1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Load Pressed");
        }
    });

     item2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Save Pressed");
        }
    });

      item3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("New Pressed");
        }
    });


    jMenuBar.add(menu);
    jFrame.setJMenuBar(jMenuBar);









    }
}
