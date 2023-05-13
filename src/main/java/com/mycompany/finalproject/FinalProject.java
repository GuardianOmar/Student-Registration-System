package com.mycompany.finalproject;

//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.util.*;
public class FinalProject {            //team 7 ok ?
    public static void main(String[] args) {
//        read("C:\\Users\\hp\\Desktop\\TEST PROJECT");
        ArrayList list = new ArrayList<String>(100);
        ArrayList list2 =new ArrayList<Double>(2000);
        ArrayList list3= new ArrayList<>(500);
        ArrayList lista= new ArrayList<>(500);
        ArrayList listo= new ArrayList<>(500);
        //test
        //Classroom
        System.out.println("\t"+"Classroom info");//right
        Classroom C1=new Classroom(0101,"A1L1",50,lista);
        Classroom C2=new Classroom(0102,"A1L1",50,lista);
        Classroom C3=new Classroom(0103,"A1L1",50,lista);
        Classroom C4=new Classroom(0104,"A1L1",50,lista);
        Classroom C5=new Classroom(0000,"A1L1",00,lista);
        C1.print_Classroom();
        C2.print_Classroom();
        C3.print_Classroom();
        C4.print_Classroom();
        C5.print_Classroom();
        //Department
        System.out.println("\t"+"Department info");//right
        Department d1= new Department(0000000,"computer science",list3) ;
        Department d2= new Department(0000000,"engineering",list3) ;
        Department d3= new Department(0000000,"medicine",list3) ;
        Department d4= new Department(0000000,"dysgy",list3) ;
        Department d5= new Department(0000000,"dysgy",list3) ;
        d1.print_Department();
        d2.print_Department();
        d3.print_Department();
        d4.print_Department();
        d5.print_Department();
        //Instructor
        System.out.println("\t"+"Instructor info");//right
        Instructor i1 = new Instructor(00000,"dr mohamed","...","893276",listo);
        Instructor i2 = new Instructor(00000,"dr mohamed","...","893276",listo);
        Instructor i3 = new Instructor(00000,"dr mohamed","...","893276",listo);
        Instructor i4 = new Instructor(00000,"dr mohamed","...","893276",listo);
        Instructor i5 = new Instructor(00000,"dr mohamed","...","893276",listo);
        i1.print_Instructor();
        i2.print_Instructor();
        i3.print_Instructor();
        i4.print_Instructor();
        i5.print_Instructor();
        
        //course
        System.out.println("\t"+"course info");
        course c1=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,i1,d1,C1);
        course c2=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,i1,d1,C1);
        course c3=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,i1,d1,C1);
        course c4=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,i1,d1,C1);
        course c5=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3,i1,d1,C1);
        c1.print_course();
        c2.print_course();
        c3.print_course();
        c4.print_course();
        c5.print_course();
        //student
        System.out.println("\t"+"student info");//right
        student s1 =new student("grade1",2.5,"2205051",2,3000,"Mohammed Mustafa","2003","area","01289322355","2022","computer science","Ai");
        student s2 =new student("grade1",2.5,"2205171",2,3000,"Omar Alaa","2003","area","01146561573","2022","computer science","Ai");
        student s3 =new student("grade1",2.5,"2205174",2,3000,"Mostafa Hazem","2003","area","01559040400","2022","computer science","Ai");
        student s4 =new student("grade1",2.5,"2205104",2,3000,"Hisham Ahmed","2003","area","01277260443","2022","computer science","Ai");
        student s5 =new student("grade1,2,3,4",1.4,"220500T",1/*2*/,3000,"TEST","2003","area","01111111111","2022","computer science","Ai");
        System.out.println("\t"+"student 1");
        s1.print_student();
        System.out.println("\t"+"student 2");
        s2.print_student();
        System.out.println("\t"+"student 3");
        s3.print_student();
        System.out.println("\t"+"student 4");
        s4.print_student();
        System.out.println("\t"+"student 5");
        s5.print_student();
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