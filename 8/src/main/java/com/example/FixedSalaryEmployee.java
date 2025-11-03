package com.example;

public class FixedSalaryEmployee extends Employee {
    private double monthlySalary;

    public FixedSalaryEmployee(String fullName, double monthlySalary) {
        super(fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getAverageSalary() {
        return monthlySalary;
    }
}
