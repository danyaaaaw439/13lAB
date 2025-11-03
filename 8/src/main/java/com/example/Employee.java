package com.example;

public abstract class Employee implements Comparable<Employee> {
    private static int counter = 1;
    private int id;
    private String fullName;

    public Employee(String fullName) {
        this.fullName = fullName;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract double getAverageSalary();

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(other.getAverageSalary(), this.getAverageSalary());
        if (salaryCompare == 0) {
            return other.getFullName().compareTo(this.getFullName());
        
        }
        
        return salaryCompare;
    }


    @Override 
    public String toString() {
        return String.format("ID=%d, Имя=%s, Средняя зп=%.2f", id, fullName, getAverageSalary());
    }
}
