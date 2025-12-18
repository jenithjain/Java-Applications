package com.challenge.oops;

public class Heart extends Organ {
    private int heartRate;
    private boolean beating;

    public Heart(String medicalCondition, int heartRate) {
        super("Heart", medicalCondition);
        this.heartRate = heartRate;
        this.beating = true;
    }

    public int getHeartRate() {

        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Heart Status: " + (beating ? "Beating" : "Stopped"));
    }

    public void beat() {
        beating = true;
        System.out.println("Heart is beating at " + heartRate + " bpm");
    }

    public void stop() {
        beating = false;
        System.out.println("Heart has stopped beating");
    }

    public boolean isBeating() {
        return beating;
    }

    public void increaseRate(int amount) {
        heartRate += amount;
        System.out.println("Heart rate increased to " + heartRate + " bpm");
    }

    public void decreaseRate(int amount) {
        heartRate -= amount;
        if (heartRate < 0) heartRate = 0;
        System.out.println("Heart rate decreased to " + heartRate + " bpm");
    }
}

