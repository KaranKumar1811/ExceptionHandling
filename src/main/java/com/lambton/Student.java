package com.lambton;

public class Student {
    int sID;
    String name;


    public Student()
    {
        this.sID=-1;
        this.name="No Name";
    }
/*
    public Student(String ID,String Sname)
    {
        return
    }*/


    @Override
    protected void finalize() {
        System.out.println("I am finalize");
    }


}
