package com.mycompany.finalproject;

import java.util.ArrayList;

public class course {
    private String course1;
    private String course2;
    private String course3;
    private String course4;
    private String course5;
    private String course6;
    private double finalmark1;
    private double finalmark2;
    private double finalmark3;
    private String term;
    private int credits;
    private int coursenamber;
    private ArrayList<String>prerequisitecourses;
    private ArrayList<String>textbooks;
    private Instructor instructor;
    private  Department department;
    private Classroom classroom;
    
public course(String course1i,String course2i,String course3i,String course4i,String course5i ,String course6i ,double f,double g,double x){       
  course1=course1i;
  course2=course2i;
  course3=course3i;
  course4=course4i;
  course5=course5i;
  course6=course6i;
  finalmark1=f;
  finalmark2=g;
  finalmark3=x;
  
}

public course(String term,Department department ,Instructor instructor,Classroom classroom,int credits, int coursenamber, ArrayList<String> prerequisitecourses, ArrayList<String> textbooks) {
        this.term = term;
        this.credits = credits;
        this.coursenamber = coursenamber;
        this.prerequisitecourses = prerequisitecourses;
        this.textbooks = textbooks;
        this.department=department;
        this.instructor=instructor;
        this.classroom=classroom;
    }
    public void setFinalmark1(double finalmark1) {
        this.finalmark1 = finalmark1;
    }
    public void setFinalmark2(double finalmark2) {
        this.finalmark2 = finalmark2;
    }
    public void setFinalmark3(double finalmark3) {
        this.finalmark3 = finalmark3;
    }
    public double getFinalmark1() {
        return finalmark1;
    }
    public double getFinalmark2() {
        return finalmark2;
    }
    public double getFinalmark3() {
        return finalmark3;
    }
    public void setCourse1(String course1) {
        this.course1 = course1;
    }
    public void setCourse2(String course2) {
        this.course2 = course2;
    }
    public void setCourse3(String course3) {
        this.course3 = course3;
    }
    public void setCourse4(String course4) {
        this.course4 = course4;
    }
    public void setCourse5(String course5) {
        this.course5 = course5;
    }
    public void setCourse6(String course6) {
        this.course6 = course6;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setCoursenamber(int coursenamber) {
        this.coursenamber = coursenamber;
    }

    public void setPrerequisitecourses(ArrayList<String> prerequisitecourses) {
        this.prerequisitecourses = prerequisitecourses;
    }

    public void setTextbooks(ArrayList<String> textbooks) {
        this.textbooks = textbooks;
    }
    
    public String getCourse1() {
        return course1;
    }
    public String getCourse2() {
        return course2;
    }
    public String getCourse3() {
        return course3;
    }
    public String getCourse4() {
        return course4;
    }
    public String getCourse5() {
        return course5;
    }
    public String getCourse6() {
        return course6;
    }
    public void semester1(){
        System.out.print( course2+" 764875476    "+course1+"   000057438 "+course3+"3767468");
 }  

    public String getTerm() {
        return term;
    }

    public int getCredits() {
        return credits;
    }

    public int getCoursenamber() {
        return coursenamber;
    }

    public ArrayList<String> getPrerequisitecourses() {
        return prerequisitecourses;
    }

    public ArrayList<String> getTextbooks() {
        return textbooks;
    }
    
 public String courseI(String course_1,double grades2,String requerment) {
      grades2=this.finalmark1;
      course_1=this.course1;
      requerment=this.course4;
      if( grades2>50)
          return requerment;
      else
         return course_1 ;       
 }
  public String courseII(String course_2,double grades0,String requermentI) {
      grades0=this.finalmark2;
      course_2=this.course2;
      requermentI=this.course5;
      if(grades0>50)
          return requermentI;
      else
         return course_2 ;       
}
   public String courseIII(String course_3,double grades1,String requermentII) {
      grades1=this.finalmark3;
      course_3=this.course3;
      requermentII=this.course6;
      if(grades1>50)
      return requermentII;
       else
       return course_3 ;       
}
}