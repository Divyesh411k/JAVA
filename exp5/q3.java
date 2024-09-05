import java.util.Scanner;

class myexception extends Exception {
    public myexception(String message) {
        super(message);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seatno, centerno, sem1, sem2, sem3;
        String name, date;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter seat number: ");
        seatno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter date: ");
        date = sc.nextLine();
        System.out.print("Enter center number: ");
        centerno = sc.nextInt();
        try {
            System.out.print("Enter marks for semester 1: ");
            sem1 = sc.nextInt();
            if (sem1 < 0 || sem1 > 100) {
                throw new myexception("Marks out of bound");
            }
            System.out.print("Enter marks for semester 2: ");
            sem2 = sc.nextInt();
            if (sem2 < 0 || sem2 > 100) {
                throw new myexception("Marks out of bound");
            }
            System.out.print("Enter marks for semester 3: ");
            sem3 = sc.nextInt();
            if (sem3 < 0 || sem3 > 100) {
                throw new myexception("Marks out of bound");
            }
        } catch (myexception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
