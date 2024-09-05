import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of integers: ");
        n = sc.nextInt();
        int[] numbers = new int[n];
        int validCount = 0;
        int invalidCount = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            try {
                numbers[i] = sc.nextInt();
                validCount++;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input");
                invalidCount++;
            }
        }
        System.out.println("Valid integers:" + validCount);
        System.out.println("Invalid integers:" + invalidCount);
        sc.close();
    }
}
