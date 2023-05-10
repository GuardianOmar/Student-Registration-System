package com.mycompany.finalproject;

import java.util.ArrayList;

public class Department {
    protected int departmentid;
    protected String name;
    protected ArrayList<Instructor>faculties;

    public Department() {
    }

    public Department(int departmentid, String name, ArrayList<Instructor> faculties) {
        this.departmentid = departmentid;
        this.name = name;
        this.faculties = faculties;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Instructor> getFaculties() {
        return faculties;
    }
    public void print_Department(){
        System.out.println("name:"+"\t\t"+name+"\n"+"departmentid:"+"\t"+departmentid+"\n"+"faculties:"+"\t"+faculties);
    }
    
}