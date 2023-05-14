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
    private int coursenumber;
    private ArrayList<String>prerequisitecourses;
    private ArrayList<String>textbooks;
    private Instructor instructor;
    private Department department;
    private Classroom classroom;

    public course(ArrayList<String>textbooks,ArrayList<String>prerequisitecourses,String course1, String course2, String course3, String course4, String course5, String course6, double finalmark1, double finalmark2, double finalmark3, String term, int credits, int coursenamber) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
        this.course6 = course6;
        this.finalmark1 = finalmark1;
        this.finalmark2 = finalmark2;
        this.finalmark3 = finalmark3;
        this.term = term;
        this.credits = credits;
        this.coursenumber = coursenamber;
        this.prerequisitecourses = prerequisitecourses;
        this.textbooks = textbooks;
        this.instructor = instructor;
        this.department = department;
        this.classroom = classroom;
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
        this.coursenumber = coursenamber;
    }

    public void setPrerequisitecourses(ArrayList<String> prerequisitecourses) {
        this.prerequisitecourses = prerequisitecourses;
    }
    public void addprerequisitecourses(String prerequisitecourse) {
        prerequisitecourses.add(prerequisitecourse);
    }
    public void setTextbooks(ArrayList<String> textbooks) {
        this.textbooks = textbooks;
    }
    public void addtextbooks(String textbook) {
        textbooks.add(textbook);
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
        System.out.print( course2+""+course1+" "+course3+"");
    }

    public ArrayList<String> getTextbooks() {
        return textbooks;
    }

    public ArrayList<String> getPrerequisitecourses() {
        return prerequisitecourses;
    }

    public String getTerm() {
        return term;
    }

    public int getCredits() {
        return credits;
    }

    public int getCoursenamber() {
        return coursenumber;
    }
    public void print_course(){
    System.out.println("course1"+"\t"+course1+"\n"+"course2"+"\t"+course2+"\n"+"course3"+"\t"+course3+"\n"+"course4"+"\t"+course4+"\n"+"course5"+"\t"+course5+"\n"+"course6"+"\t"+course6+"\n"+"finalmark1"+"\t"+finalmark1+"\n"+"finalmark2"+"\t"+finalmark2+"\n"+"finalmark3"+"\t"+finalmark3+"\n"+"term"+"\t"+term+"\n"+"credits"+"\t"+credits+"\n"+"coursenumber"+"\t"+coursenumber+"\n"+"prerequisitecourses"+"\t"+prerequisitecourses+"\n"+"textbooks"+"\t"+textbooks);
    }
}