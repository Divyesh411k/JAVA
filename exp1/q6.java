import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        int unitCost = 100;
        int total = quantity * unitCost;

        if (total > 1000) {
            double discount = 0.10 * total; 
            total-= discount; 
            System.out.println("You get a 10% discount!");
        }

        System.out.println("Total cost: $" + total);

        scanner.close();
    }
}
