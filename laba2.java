import java.util.Random;
import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1 - Одномерный массив (замена чётных элементов на сумму соседей)");
        System.out.println("2 - Двумерный массив (элементы главной диагонали в квадрат)");
        System.out.println("3 - Одномерный массив (увеличить нечётные числа на последнее нечётное)");
        System.out.println("4 - Одномерный массив (увеличить все элементы на значение A[K])");
        System.out.print("Ваш выбор: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                task1(sc);
                break;
            case 2:
                task2();
                break;
            case 3:
                task3(sc);
                break;
            case 4:
                task4(sc);
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        sc.close();
    }

    // Задание 1
    // Заменить элемент массива на сумму его соседей,
    // если элемент чётный и индекс в диапазоне [a, b]
    public static void task1(Scanner sc) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21); 
        }

        System.out.println("Исходный массив:");
        printArray(arr);

        System.out.print("Введите a (от 0 до " + (arr.length - 1) + "): ");
        int a = sc.nextInt();
        System.out.print("Введите b (от 0 до " + (arr.length - 1) + "): ");
        int b = sc.nextInt();
        if (a < 0 || a >= arr.length || b < 0 || b >= arr.length) {
            System.out.println("Ошибка! Индексы должны быть от 0 до " + (arr.length - 1));
            return; 
        }

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            if (i > 0 && i < arr.length - 1 && arr[i] % 2 == 0) {
                arr[i] = arr[i - 1] + arr[i + 1];
            }
        }

        System.out.println("Изменённый массив:");
        printArray(arr);
    }



    // Задание 2 
    // Двумерный массив: элементы главной диагонали возвести в квадрат
    public static void task2() {
        Random rand = new Random();
        int n = 5; 
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(9) + 1;
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(arr);

        // Возводим главную диагональ в квадрат
        for (int i = 0; i < n; i++) {
            arr[i][i] *=  arr[i][i];
        }

        System.out.println("После преобразования:");
        printMatrix(arr);
    }

    // Задание 3 
    // Увеличить все нечётные числа на значение последнего нечётного
    public static void task3(Scanner sc) {
        Random rand = new Random();
        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(21); // 0..20
        }

        System.out.println("Исходный массив:");
        printArray(arr);

        // Ищем последнее нечётное
        Integer lastOdd = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                lastOdd = arr[i];
                break;
            }
        }

        // Если нечётное есть — увеличиваем
        if (lastOdd != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] += lastOdd;
                }
            }
        }

        System.out.println("После преобразования:");
        printArray(arr);
    }

    // Задание 4 
    // Увеличить все элементы массива на значение A[K]
    public static void task4(Scanner sc) {
        Random rand = new Random();
        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(21);
        }

        System.out.println("Исходный массив:");
        printArray(arr);

        System.out.print("Введите K (1.." + n + "): ");
        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Ошибка: K должно быть в диапазоне 1.." + n);
            return;
        }

        int value = arr[k - 1]; // элемент A[K]
        for (int i = 0; i < n; i++) {
            arr[i] += value;
        }

        System.out.println("После преобразования:");
        printArray(arr);
    }

    // Вспомогательные методы 
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
    }
}



