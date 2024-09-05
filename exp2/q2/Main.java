import letmecalculate.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                result = Calculator.addition(num1, num2);
                break;
            case 2:
                result = Calculator.subtraction(num1, num2);
                break;
            case 3:
                result = Calculator.multiplication(num1, num2);
                break;
            case 4:
                double quotient = Calculator.division(num1, num2);
                System.out.println("Quotient: " + quotient);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (choice != 4) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
