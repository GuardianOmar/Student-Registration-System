package com.mycompany.finalproject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class FinalProject {            //team 7 ok ?

    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new inter_face().setVisible(true);
//            }
//        });
        
        ArrayList list = new ArrayList<String>(100);
        ArrayList list2 = new ArrayList<Double>(2000);
        ArrayList list3= new ArrayList<>(500);
        ArrayList lista= new ArrayList<>(500);
        ArrayList listo= new ArrayList<>(500);
        Department dp= new Department(0000000,"dysgy",list3) ;
        Classroom room = new Classroom(0000000,"hfdg",50,lista) ;
        Instructor inst = new Instructor(00000,"dr mohamed","...","893276",listo);
        course stu1=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,inst,dp,room);
        
        //test
        
//        student s1 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s2 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s3 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s4 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s5 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        s1.print_student();
//        s2.print_student();
//        s3.print_student();
//        s4.print_student();
//        s5.print_student();
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("filename.ser"));
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
//        oos.writeObject(s4);
//        oos.writeObject(s5);
//        oos.close();
    }
}