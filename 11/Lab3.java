import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Lab3 {

    // ===== Task 1 =====
    public static void task1_variant6() {
        String text = "I like Java!!!";
        int pos = text.indexOf("Java");
        System.out.println("Position of substring 'Java': " + pos);
    }

    // ===== Task 2 =====
    public static void task2() {
        String[] words = {"string", "code", "Practice"};
        for (String w : words) {

            int mid = w.length() / 2;
            String result = w.substring(mid -1, mid +1);
            System.out.println(w + " -> " + result);
        }
    }

    // ===== Task 3 =====
    static class Employee {
        String fullname;
        double salary;

        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }

    static class Report {
        static void generateReport(Employee[] employees) {
            System.out.println("------ Salary Report ------");
            for (Employee e : employees) {
                System.out.printf("%-15s %10.2f%n", e.fullname, e.salary);
            }
        }
    }

    public static void task3() {
        Employee[] staff = {
            new Employee("Ivanov", 500.50),
            new Employee("Petrov", 1200.75),
            new Employee("Sidorov", 950.00)
        };
        Report.generateReport(staff);
    }

    // ===== Task 4 =====
    public static void task4_variant6() {
        String s = "aeeea aeea aea axa axxa axxxa";
        String[] words = s.split(" ");
        System.out.println("Matches:");
        for (String w : words) {
            if (w.matches("a(e+|x+)a")) {
                System.out.println(w);
            }
        }
    }

    // ===== Task 5 =====
    public static void task5() {
        String s = "If you have unfinished tasks start with the first. 123 324 111 4554";
        String[] words = s.split("\\s+");
        System.out.println("Numeric palindromes:");
        for (String w : words) {
            if (w.matches("\\d+")) {
                String reversed = new StringBuilder(w).reverse().toString();
                if (w.equals(reversed)) {
                    System.out.println(w);
                }
            }
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("Task 1 (Variant 6):");
        task1_variant6();
        System.out.println();

        System.out.println("Task 2:");
        task2();
        System.out.println();

        System.out.println("Task 3:");
        task3();
        System.out.println();

        System.out.println("Task 4 (Variant 6):");
        task4_variant6();
        System.out.println();

        System.out.println("Task 5:");
        task5();
    }
}
