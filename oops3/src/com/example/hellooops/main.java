package com.example.hellooops;

public class main {
    //make of engine
    public static void main(String[] args) {
        Car c=new Car("Model S","Red",2020,new Engine("Electric",1020));
        System.out.println("Car Model: "+c.getModel());


    }
}
