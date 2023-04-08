package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S21BoxLayout {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

        //Creating Buttons with loop

        Button[] button =new Button[5];

        for (int i=0;i<5;i++){
            button[i]=new Button("Button" + (i+1));
            jFrame.add(button[i]);
        }

        //placing the buttons using box layout

        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(),BoxLayout.X_AXIS));






    }
}
