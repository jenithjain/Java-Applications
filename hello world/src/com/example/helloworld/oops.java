package com.example.helloworld;

public class oops {
    public static void main(String[] args) {
        phone p=new phone("Al","Iphone 14",1,48);
        String o=p.getC();

        System.out.println("Phone Company: "+o);
        o=p.getName("Iphone 16");
        System.out.println("Phone Name: "+o);
        int age=p.getAge();
        System.out.println("Phone Age: "+age+" year");

        System.out.println(o);
    }
}
