package com.example.helloworld;

public class phone {
    String c="Apple";

    private String name;
    private int age;
    private int camera;

    public phone(String c, String name, int age, int camera) {
        this.c = c;
        this.name = name;
        this.age = age;
        this.camera = camera;
    }
    public String getName(String name) {
        return name;
    }

    public  String getC() {
        return c;
    }

    public int getAge() {
        return age;
    }
}
