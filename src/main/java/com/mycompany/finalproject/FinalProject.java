package com.mycompany.finalproject;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FinalProject {            //team 7 ok ?
    public static void main(String[] args) {
        
        String file="C:\\Users\\hp\\Desktop\\TEST PROJECT.csv";
        BufferedReader reader =null;
        String line = "";
        try{
            reader =new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!=null){
                String[] row= line .split(",");
                for(String index:row){
                    System.out.printf("%-10s",index);
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(FinalProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
//        
//        
//        ArrayList list = new ArrayList<String>(100);
//        ArrayList list2 =new ArrayList<Double>(2000);
//        ArrayList list3= new ArrayList<>(500);
//        ArrayList lista= new ArrayList<>(500);
//        ArrayList listo= new ArrayList<>(500);
//        ArrayList lists= new ArrayList<>(500);
//        ArrayList cours=new ArrayList<String>(1);
//        //test
//        //Classroom
//        Classroom C1=new Classroom(0101,"A1L1",50,lista,cours);
//        Classroom C2=new Classroom(0102,"A1L1",50,lista,cours);
//        Classroom C3=new Classroom(0103,"A1L1",50,lista,cours);
//        Classroom C4=new Classroom(0104,"A1L1",50,lista,cours);
//        Classroom C5=new Classroom(0000,"A1L1",00,lista,cours);
//        C1.addOurses("asd");
//        C2.addOurses("asd");
//        C3.addOurses("asd");
//        C4.addOurses("asd");
//        C5.addOurses("asd");
//        
//        //Department
//        Department d1= new Department(0000000,"computer science",list3) ;
//        Department d2= new Department(0000000,"engineering",list3) ;
//        Department d3= new Department(0000000,"medicine",list3) ;
//        Department d4= new Department(0000000,"dysgy",list3) ;
//        Department d5= new Department(0000000,"dysgy",list3) ;
//        d1.addaculties("asd");
//        d2.addaculties("asd");
//        d3.addaculties("asd");
//        d4.addaculties("asd");
//        d5.addaculties("asd");
//        
//        //Instructor
//        Instructor i1 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i2 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i3 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i4 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        Instructor i5 = new Instructor(00000,"dr mohamed","...","893276",listo);
//        i1.addepartment("asd");
//        i2.addepartment("asd");
//        i3.addepartment("asd");
//        i4.addepartment("asd");
//        i5.addepartment("asd");
//        
//        //course
//        course c1=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3);
//        course c2=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3);
//        course c3=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3);
//        course c4=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3);
//        course c5=new course(list,list2,"ai","data science","liner alge","calc","oop","comunication ",80,70,50,"first",5,3);
//        c1.addtextbooks("text1");
//        c2.addtextbooks("text2");
//        c3.addtextbooks("text3");
//        c4.addtextbooks("text4");
//        c5.addtextbooks("text5");
//        c1.addprerequisitecourses("data science");
//        c2.addprerequisitecourses("liner alge");
//        c3.addprerequisitecourses("calc");
//        c4.addprerequisitecourses("oop");
//        c5.addprerequisitecourses("comunication");
//        
//        //student
//        student s1 =new student("grade1",2.5,"2205051",2,3000,"Mohammed Mustafa","2003","area","01289322355","2022","computer science","Ai",lists);
//        student s2 =new student("grade1",2.5,"2205171",2,3000,"Omar Alaa","2003","area","01146561573","2022","computer science","Ai",lists);
//        student s3 =new student("grade1",2.5,"2205174",2,3000,"Mostafa Hazem","2003","area","01559040400","2022","computer science","Ai",lists);
//        student s4 =new student("grade1",2.5,"2205104",2,3000,"Hisham Ahmed","2003","area","01277260443","2022","computer science","Ai",lists);
//        student s5 =new student("grade1,2,3,4",1.4,"220500T",1/*2*/,3000,"TEST","2003","area","01111111111","2022","computer science","Ai",lists);
//        
//        //
//        System.out.println("\t"+"student info");//right
//        System.out.println("\t"+"student 1");
//        s1.print_student();
//        System.out.println("\t"+"student 2");
//        s2.print_student();
//        System.out.println("\t"+"student 3");
//        s3.print_student();
//        System.out.println("\t"+"student 4");
//        s4.print_student();
//        System.out.println("\t"+"student 5");
//        s5.print_student();
//        
//        System.out.println("\t"+"course info");
//        c1.print_course();
//        c2.print_course();
//        c3.print_course();
//        c4.print_course();
//        c5.print_course();
//        
//        System.out.println("\t"+"Instructor info");//right
//        i1.print_Instructor();
//        i2.print_Instructor();
//        i3.print_Instructor();
//        i4.print_Instructor();
//        i5.print_Instructor();
//        
//        System.out.println("\t"+"Department info");//right
//        d1.print_Department();
//        d2.print_Department();
//        d3.print_Department();
//        d4.print_Department();
//        d5.print_Department();
//        
//        System.out.println("\t"+"Classroom info");//right
//        C1.print_Classroom();
//        C2.print_Classroom();
//        C3.print_Classroom();
//        C4.print_Classroom();
//        C5.print_Classroom();
//        
        
        
        
        
        
        
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new inter_face().setVisible(true);
//            }
//        });
    }
}












