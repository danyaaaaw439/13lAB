import java.util.*;

abstract class Employee {
    final int id;
    final String fullName;

    Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    abstract double avgMonthlySalary();
}

class FixedSalaryEmployee extends Employee {
    private final double monthlyRate;

    FixedSalaryEmployee(int id, String fullName, double monthlyRate) {
        super(id, fullName);
        this.monthlyRate = monthlyRate;
    }

    @Override
    double avgMonthlySalary() {
        return monthlyRate;
    }
}

class HourlySalaryEmployee extends Employee {
    private final double hourlyRate;

    HourlySalaryEmployee(int id, String fullName, double hourlyRate) {
        super(id, fullName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    double avgMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}

class Report {

    static void generateReport(Employee[] staff) {
        System.out.println("----- REPORT -----");
        for (Employee e : staff) {
            System.out.printf("%-15.15s %10.2f%n", e.fullName, e.avgMonthlySalary());
        }
        System.out.println("------------------");
    }
}

public class EmployeesApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new FixedSalaryEmployee (101, "Иванов Иван",        120000),
                new HourlySalaryEmployee(102, "Петров Пётр",            750),
                new FixedSalaryEmployee (103, "Сидорова Анна",      135000),
                new HourlySalaryEmployee(104, "Смирнов Кирилл",         900),
                new HourlySalaryEmployee(105, "Кузнецова Ольга",        820),
                new FixedSalaryEmployee (106, "Лебедев Артём",       150000),
                new FixedSalaryEmployee (107, "Ковалёв Даниил",     150000),
                new HourlySalaryEmployee(108, "Егорова Дарья",          860),
                new FixedSalaryEmployee (109, "Сергеев Тимур",      110000),
                new HourlySalaryEmployee(110, "Морозов Павел",          700)
        ));

 
        employees.sort(Comparator
        .comparing((Employee e) -> e.fullName.split(" ")[0])     
        .thenComparing(e -> e.fullName.split(" ")[1])           
        .thenComparingDouble(Employee::avgMonthlySalary)         
);

        System.out.println("ID   Имя                Ср. зарплата");
        for (Employee e : employees) {
            System.out.printf("%-4d %-18.18s %10.2f%n", e.id, e.fullName, e.avgMonthlySalary());
        }


        System.out.println("\nПервые 5 имён:");
        employees.stream().limit(5).forEach(e -> System.out.println(e.fullName));

      
        System.out.println("\nПоследние 3 идентификатора:");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .forEach(e -> System.out.println(e.id));

      
        Employee[] staffArray = employees.toArray(new Employee[0]);
        Report.generateReport(staffArray);
    }
}
