package com.example.interfaces;

public class ElectricCar implements Carinterface {
    private String name;

    public ElectricCar(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {
        System.out.println("Car Name: " + name);
    }

    @Override
    public void printColor(String color) {
        System.out.println("Car Color: " + color);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting silently.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Electric car is moving at " + speed + " km/h.");
    }

}
