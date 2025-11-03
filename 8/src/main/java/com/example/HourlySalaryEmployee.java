package com.example;

public class HourlySalaryEmployee extends Employee {
    private double hourlyRate;

    public HourlySalaryEmployee(String fullName, double hourlyRate) {
        super(fullName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAverageSalary() {
        return hourlyRate * 20.8 * 8; 
    }
}
