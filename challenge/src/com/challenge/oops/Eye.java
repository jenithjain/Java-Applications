package com.challenge.oops;

public class Eye extends Organ {
    private String color;
    private boolean opened;

    public Eye(String medicalCondition, String color) {
        super("Eye", medicalCondition);
        this.color = color;
        this.opened = false;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye Color: " + color);
        System.out.println("Eye Status: " + (opened ? "Opened" : "Closed"));
    }

    public void open() {
        opened = true;
        System.out.println("Eye is opened");
    }

    public void close() {
        opened = false;
        System.out.println("Eye is closed");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened(){
        return opened;
    }
}
