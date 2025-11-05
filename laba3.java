import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class laba3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите задание от 1 до 5 (0 для выхода):");
            System.out.println("1. Задание 1 (Вариант 11)");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4 (Вариант 4)");
            System.out.println("5. Задание 5");
            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                switch (choice) {
                    case 1:
                        runTask1();
                        break;
                    case 2:
                        runTask2();
                        break;
                    case 3:
                        runTask3();
                        break;
                    case 4:
                        runTask4();
                        break;
                    case 5:
                        runTask5();
                        break;
                    case 0:
                        System.out.println("Программа завершена.");
                        break;
                    default:
                        System.out.println("Неверный номер задания.");
                }
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.nextLine();
                choice = -1;
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    public static void runTask1() {
        String initialString = "A=B";
        StringBuilder sb = new StringBuilder(initialString);
        int index = sb.indexOf("=");
        if (index != -1) {
            sb.replace(index, index + 1, "равно");
        }
        System.out.println("Исходная строка: " + initialString);
        System.out.println("Измененная строка: " + sb.toString());
    }

    public static void runTask2() {
        System.out.println("string" + getMiddleChars("string"));
        System.out.println("code" + getMiddleChars("code"));
        System.out.println("Practice" + getMiddleChars("Practice"));
    }

    public static String getMiddleChars(String str) {
        if (str.length() % 2 != 0) {
            return "Длина строки нечетная.";
        }
        int middleIndex = str.length() / 2 - 1;
        return str.substring(middleIndex, middleIndex + 2);
    }


    public static void runTask3() {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Иванов", 50000.50);
        staff[1] = new Employee("Петров", 75123.7234565);
        staff[2] = new Employee("Сидоров-Кузнецов", 120000.00);
        Report.generateReport(staff);
    }

    
    public static void runTask4() {
        String text = "aAXa aeffa aGha aza ax23a a3sSa";
        Pattern pattern = Pattern.compile("a[a-z0-9]*a");
        Matcher matcher = pattern.matcher(text);
        
        System.out.println("Исходная строка: " + text);
        System.out.println("Найденные строки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void runTask5() {
        String sentence = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String[] words = sentence.split("\\s+");
        
        System.out.println("Исходное предложение: " + sentence);
        System.out.println("Найденные слова-палиндромы:");
        
        for (String word : words) {
            if (word.matches("\\d+")) {
                if (isPalindrome(word)) {
                    System.out.println(word);
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}

class Employee {
    public String fullname;
    public double salary;
    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s | %15s%n", "Фамилия", "Зарплата");
        System.out.println("----------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%-15s |%15.2f%n", emp.fullname, emp.salary);
        }
        System.out.println("----------------------------------------");
    }
}