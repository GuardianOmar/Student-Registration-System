package com.mycompany.finalproject;

import java.util.ArrayList;

public class student {
    protected String studylevel;
    protected double GPA;
    protected String id;
    protected int semester;
    protected double cridet;
    protected static int numberofstudent;
    protected ArrayList<String>registeredcourses;
    protected String name;
    protected String birth;
    protected String address;
    protected String phone;
    protected String enrolled_year;
    protected String faculty;
    protected String department;

    public student(String studylevel, double GPA, String id, int semester, double cridet, String name, String birth, String address, String phone, String enrolled_year, String faculty, String department) {
        this.studylevel = studylevel;
        this.GPA = GPA;
        this.id = id;
        this.semester = semester;
        this.cridet = cridet;
        this.registeredcourses = registeredcourses;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.enrolled_year = enrolled_year;
        this.faculty = faculty;
        this.department = department;
    }

    public static void setNumberofstudent(int numberofstudent) {
        student.numberofstudent = numberofstudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEnrolled_year(String enrolled_year) {
        this.enrolled_year = enrolled_year;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
 
    public static int getnumberofstudent() {
        return numberofstudent;
    }
    public void setStudylevel(String studylevel) {
        this.studylevel = studylevel;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setRegisteredcourses(ArrayList<String> registeredcourses) {
        this.registeredcourses = registeredcourses;
    }

    public static int getNumberofstudent() {
        return numberofstudent;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEnrolled_year() {
        return enrolled_year;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public ArrayList<String> getRegisteredcourses() {
        return registeredcourses;
    }
    public void registerCourse(String course){
        registeredcourses.add(course);
    }
    public void unregisterCourse(String course){
        registeredcourses.remove(course);
    }
    public void setCridet(double cridet) {
        this.cridet = cridet;
    }
    public String getStudylevel() {
        return studylevel;
    }
    public double getGPA() {
        return GPA;
    }
    public String getId() {
        return id;
    }
    
    public double getCridet() {
        return cridet;
    }
    public boolean maxnumclassroom(int maxnumber ){
        maxnumber=2;
        if(this.numberofstudent<=maxnumber)
            return true;
        else
            return false;
    }
 public void printdata(){
System.out.println("birth: "+birth+"\n"+"address: "+address+"\n"+"phone: "+phone+"\n"+"enrolled year: "+enrolled_year+"\n"+"faculty: "+faculty+"\n"+"department: "+department+"\n"+"id: "+id+"\n"+"GPA:"+GPA+"\n"+"your check"+cridet+"$"+"\n"+"studylevel: "+studylevel);
    }
}