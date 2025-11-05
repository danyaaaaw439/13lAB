package com.example;

import com.example.domain.Graduate;
import com.example.domain.Undergraduate;

public class StudentTest {
    public static void main(String[] args) {
        Undergraduate u = new Undergraduate("Иван Петров", 20, "Информатика");
        Graduate g = new Graduate("Мария Сидорова", 24, "Искусственный интеллект");

        System.out.println("=== Бакалавр ===");
        u.displayInfo();

        System.out.println("\n=== Магистрант ===");
        g.displayInfo();
    }
}
