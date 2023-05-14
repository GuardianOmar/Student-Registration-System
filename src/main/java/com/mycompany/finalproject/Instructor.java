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
    public void addepartment(String Department) {
        department.add(Department);
    }
    public void print_Instructor(){
        System.out.println("name:"+"\t\t"+name+"\n"+"phonenumber:"+"\t"+phonenumber+"\n"+"faculty id:"+"\t"+facultyid+"\n"+"address:"+"\t\t"+address+"\n"+"department:"+"\t"+department);
    }
}