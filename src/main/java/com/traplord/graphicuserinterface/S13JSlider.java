package com.traplord.graphicuserinterface;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S13JSlider {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

    //JSlider
        JSlider slider =new JSlider(JSlider.HORIZONTAL,0,100,50);

        //adding eventListener

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //getting selected value from slider

                int k =  slider.getValue();
                System.out.println("Value : " + k);
            }
        });














    jFrame.add(slider);


    }
}
