import java.util.Scanner;

public class Student {
    String name;  
    int roll_no;   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();


        System.out.print("Enter student name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        student.roll_no = scanner.nextInt();
        
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.roll_no);

        scanner.close();
    }
}
