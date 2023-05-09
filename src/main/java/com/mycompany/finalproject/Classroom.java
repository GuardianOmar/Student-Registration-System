package com.mycompany.finalproject;

import java.util.ArrayList;

public class Classroom {
    protected int id;
    protected String location;
    protected int capacity;
    protected ArrayList<course>courses;

    public Classroom() {
    }
    
    public Classroom(int id, String location, int capacity, ArrayList<course> courses) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<course> getCourses() {
        return courses;
    }
public void addcourse(course cours){
     courses.add(cours);
}
public void removecourse(course cours){
     courses.remove(cours);
}
public void print_Classroom(){
    System.out.println("location:"+"\t"+location+"\n"+"capacity:"+"\t"+capacity+"\n"+"courses:"+"\t\t"+courses+"\n"+"ID:"+"\t\t"+id);
}
}