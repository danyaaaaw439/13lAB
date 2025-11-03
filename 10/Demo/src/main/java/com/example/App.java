package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Проверка штатного сотрудника ===");
        try {
            StaffEmployee s1 = new StaffEmployee("Иванов И.И.", "Инженер", 1000, 200);
            System.out.println("Зарплата: " + s1.rasschitatZarplatu());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Проверка отрицательной премии ===");
        try {
            StaffEmployee s2 = new StaffEmployee("Петров П.П.", "Менеджер", 1200, -300);
            System.out.println("Зарплата: " + s2.rasschitatZarplatu());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Проверка исключения OkladException ===");
        try {
            Employee e1 = new Employee("Сидоров С.С.", "Рабочий", -500);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Контрактный сотрудник ===");
        try {
            ContractEmployee c1 = new ContractEmployee("Козлов К.К.", "Разработчик", 2000);
            System.out.println("Зарплата: " + c1.rasschitatZarplatu());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
