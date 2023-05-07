package com.mycompany.finalproject;

import java.util.ArrayList;

public class Instructor {
    protected int facultyid;
    protected String name;
    protected String address;
    protected String phonenumber;
    protected ArrayList<String>department;

    public Instructor() {
    }

    public Instructor(int facultyid, String name, String address, String phonenumber, ArrayList<String> department) {
        this.facultyid = facultyid;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.department = department;
    }

    public int getFacultyid() {
        return facultyid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public ArrayList<String> getDepartment() {
        return department;
    }
    public void print_Instructor(){
        System.out.println("faculty id: "+facultyid+"\n"+"name: "+name+"\n"+"address: "+address+"\n"+"phonenumber: "+phonenumber+"\n"+"department: "+department);
    }
}