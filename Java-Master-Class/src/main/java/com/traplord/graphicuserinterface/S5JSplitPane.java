package com.traplord.graphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class S5JSplitPane {
    public static void main(String [] args){

        //Top level container(Principal frame)
        JFrame jFrame=new JFrame("First Gui");
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(100,100,1000,1000);

        jFrame.setVisible(true);


        //JSplit pane
        JScrollPane scrollpane=new JScrollPane();
        Panel p1 = new Panel();
        p1.setBackground(Color.CYAN);
        p1.setBounds(100,100,200,200);

        Panel p2 =new Panel();
        p2.setBackground(Color.green);
        p2.setBounds(400,400,200,200);

        JSplitPane splitpane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);


//        adding splitpanel to the Frame

        jFrame.add(splitpane);

    }
}
