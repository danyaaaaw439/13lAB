package com.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }


    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "A2", 1000.0);
    }


    public Tester(String name) {
        this(name, "Unknown", 0);
    }
// 

    public String introduce() {
        return "Я " + name + " " + surname + ", опыт: " + expirienceInYears + " лет";
    }

    public String introduce(String prefix) {
        return prefix + introduce();
    }

    public String introduce(boolean withSalary) {
        return withSalary ? introduce() + ", зарплата: " + salary : introduce();
    }

    public static double averageSalary(Tester... testers) {
        double sum = 0;
        for (Tester t : testers) {
            sum += t.salary;
        }
        return sum / testers.length;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }
        //int f = MathUtils.factorial(5);
  
    }
    

    

