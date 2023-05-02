package com.mycompany.finalproject;

import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter_face().setVisible(true);
            }
        });
        //test
        ArrayList list=new ArrayList();
        student s1=new student("",1,"",1,1,list,"","","","","","","");
        s1.printdata();
    }
}