package com.example;

import java.util.List;

public class Report {
    public static void generateReport(List<Employee> employees) {
        System.out.printf("%-5s %-15s %15s%n", "ID", "Имя", "Средняя зарплата");
        System.out.println("-------------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%-5d %-15s %15.2f%n",
                    emp.getId(), emp.getFullName(), emp.getAverageSalary());
        }
        System.out.println("-------------------------------------------");
    }
}
