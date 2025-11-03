package com.example;

import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> grades;

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(i -> i).average().orElse(0);
    }

    @Override
    public String toString() {
        return name + " (курс " + course + ", группа " + group + ", средний балл: " + getAverageGrade() + ")";
    }
}
