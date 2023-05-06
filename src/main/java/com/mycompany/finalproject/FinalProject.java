package com.mycompany.finalproject;

import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter_face().setVisible(true);
            }
        });
        student one =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
        ArrayList list = new ArrayList<String>(100);
        ArrayList list2 = new ArrayList<Double>(2000);
        ArrayList list3= new ArrayList<>(500);
        ArrayList lista= new ArrayList<>(500);
        ArrayList listo= new ArrayList<>(500);
        Department dp= new Department(0000000,"dysgy",list3) ;
        Classroom room = new Classroom(0000000,"hfdg",50,lista) ;
        Instructor inst = new Instructor(00000,"dr mohamed","...","893276",listo);
        course stu1=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,inst,dp,room);
        one.printdata();
    }
}