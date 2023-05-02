package com.mycompany.finalproject;

public class FinalProject {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter_face().setVisible(true);
            }
        });
        //test
        student s1=new student("",1,"",1,1,"","","","","","","","");
        s1.printdata();
    }
}