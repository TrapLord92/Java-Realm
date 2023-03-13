package com.traplord.graphicuserinterface;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class S17JTable {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);

//Jtable
        //1columns

        String[] columns ={"ID","Name","Salary"};

        // Data filling  is done using Multidimensional array

        String [][] data={
                {"1","Bernardo","5000"},
                {"2","Christina","10000"},
                {"3","Alfredo","3000"}


        };
        //Combining data with column names inside table
        JTable jTable=new JTable(data,columns);

        //Event Listener

        ListSelectionModel select =jTable.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data =null;

                int[] row =jTable.getSelectedRows();
                int[] col =jTable.getSelectedColumns();

                for (int i =0; i<row.length;i++){
                    for (int j=0; j< col.length;j++){
                        data=(String) jTable.getValueAt(row[i],col[j]);
                    }
                }
                System.out.println( "Table element selected is : " + data);

            }
        });
        //adding jscroolPane
        //nb: always use scroll pan with table

        JScrollPane sp=new JScrollPane(jTable);



    jFrame.add(sp);









    }
}
