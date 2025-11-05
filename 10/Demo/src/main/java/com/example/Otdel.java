package com.example;

public class Otdel {
    private String name;
    private int employeesCount;

    public Otdel(String name, int employeesCount) throws NameException {
        if (name == null || name.isEmpty()) {
            throw new NameException("Название отдела не может быть пустым!");
        }
        this.name = name;
        this.employeesCount = employeesCount;
    }

    public String getName() { return name; }
    public void setName(String name) throws NameException {
        if (name == null || name.isEmpty()) {
            throw new NameException("Название отдела не может быть пустым!");
        }
        this.name = name;
    }

    public int getEmployeesCount() { return employeesCount; }
    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }
}
    