package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class App {


    public static void filterAndPromoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void main(String[] args) {

        // ЗАДАНИЕ 1: Работа со студентами 
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", 101, 1, Arrays.asList(4, 5, 3, 4)));
        students.add(new Student("Петров", 102, 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Сидоров", 103, 1, Arrays.asList(5, 5, 4, 5)));
        students.add(new Student("Андреев", 104, 3, Arrays.asList(3, 3, 3)));
        students.add(new Student("Кузнецов", 105, 2, Arrays.asList(1, 2, 2)));

        System.out.println("===== ДО фильтрации студентов =====");
        students.forEach(System.out::println);

        filterAndPromoteStudents(students);

        System.out.println("\n===== ПОСЛЕ фильтрации и перевода =====");
        students.forEach(System.out::println);

        printStudents(students, 2);

        // ЗАДАНИЕ 2: Сотрудники 
        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedSalaryEmployee("Иванов", 2500));
        employees.add(new HourlySalaryEmployee("Петров", 15));
        employees.add(new FixedSalaryEmployee("Сидоров", 3000));
        employees.add(new HourlySalaryEmployee("Андреев", 20));
        employees.add(new FixedSalaryEmployee("Белов", 2500));

        Collections.sort(employees);

        System.out.println("\n===== Полный список сотрудников =====");
        Report.generateReport(employees);

        System.out.println("\n===== Первые 5 имен сотрудников =====");
        employees.stream().limit(5).forEach(e -> System.out.println(e.getFullName()));

        System.out.println("\n===== Последние 3 ID сотрудников =====");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .forEach(e -> System.out.println(e.getId()));

        // ЗАДАНИЕ 3: Экипировка
        System.out.println("\n===== Спортивная экипировка =====");
        Map<String, SportEquipment> equipmentMap = new HashMap<>();
        equipmentMap.put("Мяч футбольный", new Football());
        equipmentMap.put("Мяч баскетбольный", new Basketball());

        System.out.println("Элементы экипировки:");
        for (SportEquipment equipment : equipmentMap.values()) {
            System.out.println(equipment);
        }
    }
}
