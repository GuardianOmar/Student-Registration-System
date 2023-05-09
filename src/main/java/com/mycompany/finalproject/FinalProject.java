package com.mycompany.finalproject;

//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.util.*;

public class FinalProject {            //team 7 ok ?

    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>(100);
        ArrayList list2 = new ArrayList<Double>(2000);
        ArrayList list3= new ArrayList<>(500);
        ArrayList lista= new ArrayList<>(500);
        ArrayList listo= new ArrayList<>(500);
        //course stu1=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,inst,dp,room);
        
        //test
        //student
        System.out.println("student info");
        student s1 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s2 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s3 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s4 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
//        student s5 =new student("grade1",2.5,"2205051",1,3000,"mohamed","2003","smoha","01289322355","2022","computer science","Ai");
        s1.print_student();
//        s2.print_student();
//        s3.print_student();
//        s4.print_student();
//        s5.print_student();
        
        //Classroom
        System.out.println("Classroom info");
        Classroom c1=new Classroom(123,"asd",20,lista);
//        Classroom c2=new Classroom(123,"asd",20,lista);
//        Classroom c3=new Classroom(123,"asd",20,lista);
//        Classroom c4=new Classroom(123,"asd",20,lista);
//        Classroom c5=new Classroom(123,"asd",20,lista);
        c1.print_Classroom();
//        c2.print_Classroom();
//        c3.print_Classroom();
//        c4.print_Classroom();
//        c5.print_Classroom();
        
        //Instructor
//        Instructor i1 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i2 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i3 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i4 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i5 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        i1.print_Instructor();
//        i2.print_Instructor();
//        i3.print_Instructor();
//        i4.print_Instructor();
//        i5.print_Instructor();
        
        //Department
//        Department d1= new Department(0000000,"dysgy",list3) ;
//        Department d2= new Department(0000000,"dysgy",list3) ;
//        Department d3= new Department(0000000,"dysgy",list3) ;
//        Department d4= new Department(0000000,"dysgy",list3) ;
//        Department d5= new Department(0000000,"dysgy",list3) ;
        //d1.
        
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("filename.ser"));
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
//        oos.writeObject(s4);
//        oos.writeObject(s5);
//        oos.close();
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new inter_face().setVisible(true);
//            }
//        });
    }
}