package com.example.abstraction;

public  abstract class TestAbstract {
    public abstract void display(String name);

    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public TestAbstract(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    

}
