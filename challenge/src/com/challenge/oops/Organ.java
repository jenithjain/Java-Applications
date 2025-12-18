package com.challenge.oops;

public class Organ {
    private  String name;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails() {
        System.out.println("Organ Name: " + name);
        System.out.println("Medical Condition: " + medicalCondition);
    }

    public String getName() {
        return name;
    }
    public String getMedicalCondition() {
        return medicalCondition;
    }

}
