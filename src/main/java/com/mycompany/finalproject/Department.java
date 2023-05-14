package com.mycompany.finalproject;

import java.util.ArrayList;

public class Department {
    protected int departmentid;
    protected String name;
    protected ArrayList<Instructor>faculties;
    protected ArrayList<String>aculties;

    public Department() {
    }

    public Department(int departmentid, String name, ArrayList<String> aculties) {
        this.departmentid = departmentid;
        this.name = name;
        this.aculties = aculties;
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
    public void addInstructor(Instructor instructor) {
        faculties.add(instructor);
    }
    public void addaculties(String faculties) {
        aculties.add(faculties);
    }
    
    public void print_Department(){
        System.out.println("name:"+"\t\t"+name+"\n"+"departmentid:"+"\t"+departmentid+"\n"+"faculties:"+"\t"+aculties);
    }
    
}