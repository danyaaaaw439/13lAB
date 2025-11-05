package com.example;

public class Firma {
    private String name;

    public Firma(String name) throws NameException {
        if (name == null || name.isEmpty()) {
            throw new NameException("Название фирмы не может быть пустым!");
        }
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) throws NameException {
        if (name == null || name.isEmpty()) {
            throw new NameException("Название фирмы не может быть пустым!");
        }
        this.name = name;
    }
}
