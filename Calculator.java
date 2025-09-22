import java.util.Scanner;

public class Calculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Choose operation: 1-Add 2-Subtract 3-Multiply 4-Divide 5-Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting Calculator. Goodbye!");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result: " + result);
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}