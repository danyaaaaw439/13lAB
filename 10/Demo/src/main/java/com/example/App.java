package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Тест штатных сотрудников ===");

        try {
            ShtatSotrudnik s1 = new ShtatSotrudnik("Иванов Иван", "Программист", 1500, 500);
            System.out.println("Зарплата: " + s1.rasschitatZarplatu());

            // проверяем ошибку премии
            ShtatSotrudnik s2 = new ShtatSotrudnik("Петров Петр", "Менеджер", 1200, -300);
            System.out.println("Зарплата: " + s2.rasschitatZarplatu());

        } catch (Exception e) {
            System.out.println("Ошибка при создании сотрудника: " + e.getMessage());
        }


        System.out.println("\n=== Тест контрактных сотрудников ===");

        try {
            ContractSotrudnik c1 = new ContractSotrudnik("Сидоров Сидр", "Тестировщик", 1000);
            System.out.println("Зарплата контрактника: " + c1.rasschitatZarplatu());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        System.out.println("\n=== Проверка ошибки оклада при создании сотрудника ===");

        try {
            Sotrudnik bad = new Sotrudnik("Ошибка Ошибкин", "Инженер", -100);
        } catch (OkladException e) {
            System.out.println(e.getMessage());
        } catch (NameException e) {
            System.out.println("Ошибка имени: " + e.getMessage());
        }


        System.out.println("\n=== Проверка ошибки пустого имени ===");

        try {
            Sotrudnik emptyName = new Sotrudnik("", "Аналитик", 900);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
