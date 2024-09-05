import java.util.Scanner;

public class q1
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        String name;
        int salary,ID;
        System.out.println("Enter your name:");
        name = obj.nextLine();
         System.out.println("Enter Employee ID:");
         ID = obj.nextInt();
        System.out.println("Enter your basic salary:");
        salary = obj.nextInt();

        System.out.println("DA:" + 0.7*salary);
        System.out.println("HRA:" + 0.3*salary);
        System.out.println("PF:" + 0.1*salary);

	}
}
