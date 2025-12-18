package com.collections.java;

public class student
{   // static variable
    public  static String name;
    public int agel;
    public String skincolor;


    public student( int agel, String skincolor) {
        this.agel = agel;
        this.skincolor = skincolor;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        student.name = name;
    }

    public int getAgel() {
        return agel;
    }

    public void setAgel(int agel) {
        this.agel = agel;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }
}
