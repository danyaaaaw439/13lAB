package com.example;

public class App {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "ИМЯ";
        System.out.println("Hello, " + name);
        Tester t1 = new Tester("Ivan", "Petrov", 5, "B2", 2500.0);
        Tester t2 = new Tester("Anna", "Sidorova", 2);
        Tester t3 = new Tester("Maxim");
        System.out.println(t1.introduce());
        System.out.println(t1.introduce(">>> "));
        System.out.println(t1.introduce(true));
        double avg = Tester.averageSalary(t1, t2, t3);
        System.out.println("Средняя зарплата: " + avg);
    }
}
