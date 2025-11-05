
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a task:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                int a1 = 4;
                int x1 = (a1 * a1) - (2 * a1);
                System.out.println("Result of task 1: " + x1);
                break;
            }

            case 2: {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                System.out.print("Enter max divisor (n): ");
                int n = scanner.nextInt();

                System.out.println("Checking divisibility for number " + num + ":");

                for (int i = 2; i <= n; i++) {
                    if (num % i == 0) {
                        System.out.println(num + " is divisible by " + i);
                    } else {
                        System.out.println(num + " is NOT divisible by " + i);
                    }
                }
                break;
            }

            case 3: {
                System.out.print("Enter the capital: ");
                String capital = scanner.next();

                switch (capital) {
                    case "Moscow":
                        System.out.println("Country: Russia");
                        break;
                    case "Berlin":
                        System.out.println("Country: Germany");
                        break;
                    case "Paris":
                        System.out.println("Country: France");
                        break;
                    case "Rome":
                        System.out.println("Country: Italy");
                        break;
                    case "Madrid":
                        System.out.println("Country: Spain");
                        break;
                    case "London":
                        System.out.println("Country: United Kingdom");
                        break;
                    case "Washington 1":
                        System.out.println("Country: United States of America");
                        break;
                    default:
                        System.out.println("Unknown capital.");
                        break;
                }
                break;
            }
            case 4: {
                System.out.println("Enter a number: ");
                int number = scanner.nextInt();

                System.out.println("What to display? 1 - Day of the week, 2 - Month");
                int mode = scanner.nextInt();

                switch (mode) {
                    case 1:
                        switch (number) {
                            case 1:
                                System.out.println("Monday");
                                break;
                            case 2:
                                System.out.println("Tuesday");
                                break;
                            case 3:
                                System.out.println("Wednesday");
                                break;
                            case 4:
                                System.out.println("Thursday");
                                break;
                            case 5:
                                System.out.println("Friday");
                                break;
                            case 6:
                                System.out.println("Saturday");
                                break;
                            case 7:
                                System.out.println("Sunday");
                                break;
                            default:
                                System.out.println("Invalid day number!");
                                break;
                        }
                        break;

                    case 2:
                        switch (number) {
                            case 1:
                                System.out.println("January");
                                break;
                            case 2:
                                System.out.println("February");
                                break;
                            case 3:
                                System.out.println("March");
                                break;
                            case 4:
                                System.out.println("April");
                                break;
                            case 5:
                                System.out.println("May");
                                break;
                            case 6:
                                System.out.println("June");
                                break;
                            case 7:
                                System.out.println("July");
                                break;
                            case 8:
                                System.out.println("August");
                                break;
                            case 9:
                                System.out.println("September");
                                break;
                            case 10:
                                System.out.println("October");
                                break;
                            case 11:
                                System.out.println("November");
                                break;
                            case 12:
                                System.out.println("December");
                                break;
                            default:
                                System.out.println("Invalid month number!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                break;
            }

            case 5: {
                System.out.print("Enter n: ");
                int n = scanner.nextInt();

                long product = 1;

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        product *= i;
                    }
                }

                System.out.println("Product of all even numbers from 1 to " + n + " is: " + product);
                break;
            }

            case 6: {
                System.out.print("Enter your height (cm): ");
                int height = scanner.nextInt();

                System.out.print("Enter your weight (kg): ");
                int weight = scanner.nextInt();

                double normalWeight = height - 100;

                double min = normalWeight * 0.9;

                double max = normalWeight * 1.1;

                if (weight >= min && weight <= max) {
                    System.out.println("Weight is normal");
                } else if (weight > max) {
                    System.out.println("You need to lose weight");
                } else {
                    System.out.println("You need to gain weight");
                }
                break;
            }

            case 7: {
                for (int i = 30; i <= 86; i++) {
                    if (i >= 33 && i <= 77) {
                        continue;
                    }
                    System.out.print(i + "\t");
                }
                System.out.println();
                break;
            }

case 8: {
    System.out.println("Enter how many numbers to generate:");
    int n = scanner.nextInt();

    Random rand = new Random();

    int bestNum = 0;
    int bestCnt = -1; 
    String allNumbers = "";

    int i = 0;
    while (i < n) {
        int x = rand.nextInt(1000) + 1; 
        allNumbers += x + " ";

        int y = x;
        int uniqueCount = 0;
        int digitsChecked = 0;

        while (y > 0) {
            int d = y % 10; 

            
            int temp = digitsChecked;
            boolean seen = false;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == d) {
                    seen = true;
                    break;
                }
                temp /= 10;
            }

            if (!seen) {
                uniqueCount++;      
                digitsChecked = digitsChecked * 10 + d; 
            }

            y /= 10; 
        }

     
        if (uniqueCount > bestCnt) {
            bestCnt = uniqueCount;
            bestNum = x;
        }

        i++;
    }

    System.out.println("First number with maximum different digits: " + bestNum);
    System.out.println("All generated numbers: " + allNumbers);
    break;
}


            case 9: {
                System.out.println("Numbers from 1 to 100 divisible by 3:");
                for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                break;
            }

            default:
                System.out.println("No such task yet.");
                break;
        }

        scanner.close();
    }
}
