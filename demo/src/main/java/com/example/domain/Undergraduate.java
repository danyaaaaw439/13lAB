package com.example.domain;

public class Undergraduate extends Student {
    private String major; 

    public Undergraduate(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Специальность: " + major);
    }



}
