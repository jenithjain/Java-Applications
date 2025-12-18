package com.example.hellooops;

public class Car {
    String model;
    String color;
    int year;
    Engine eng;

    public Car(String model, String color, int year, Engine eng) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.eng = eng;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
}
