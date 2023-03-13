package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S12Jlist {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

    //Jlist

        DefaultListModel<String> listModel =new DefaultListModel<>();

        listModel.add(0,"Java");
        listModel.add(1,"C");
        listModel.add(2,"Python");

        JList<String> jList=new JList<>(listModel);
        jList.setBounds(100,100,400,400);

        //Adding Click Events to Jlist

        JButton jButton=new JButton(("Get Selected Items"));

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get single itme from jlist
//                if (jList.getSelectedIndex()==0){
//                    System.out.println(jList.getSelectedValue());
//                }

//                geting multiple selection

                for (Object item : jList.getSelectedValuesList()){
                    System.out.println(item);
                }

            }
        });










    jFrame.add(jList);
    jFrame.add(jButton);

    }
}
