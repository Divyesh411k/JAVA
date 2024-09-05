package letmecalculate;

public class Calculator {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not-a-Number
        }
        return (double) num1 / num2;
    }
}
