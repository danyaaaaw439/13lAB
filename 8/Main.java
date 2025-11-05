public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] arr = {12342, 4562, 222, 7829, 9202, 11, 5};
        int first = arr[0];
        int lastDigit = Math.abs(first % 10);
        System.out.println("Task 1:");
        for (int i = 0; i < arr.length; i++) {
            if (countDigitOccurrences(arr[i], lastDigit) == 2) {
                System.out.println("Index " + (i + 1) + ": " + arr[i]);
            }
        }
        System.out.println();
    }

    private static void task2() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Task 2:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    private static void task3() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("Task 3:");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[i + n / 2];
            arr[i + n / 2] = temp;
        }
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\n");
    }

    private static void task4() {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int m = a.length;
        System.out.println("Task 4:");
        for (int k = 0; k < 2 * m - 1; k++) {
            int sum = 0, count = 0;
            for (int i = 0; i < m; i++) {
                int j = m - 1 - (k - i);
                if (j >= 0 && j < m) {
                    sum += a[i][j];
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Diagonal " + (k + 1) + ": " + (double) sum / count);
            }
        }
        System.out.println();
    }

    private static int countDigitOccurrences(int number, int digit) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) count++;
            number /= 10;
        }
        return count;
    }
}
