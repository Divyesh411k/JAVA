import java.util.Scanner;

public class Student {
    String name;  
    public Student(String studentName) {
        if (studentName != null && !studentName.isEmpty()) {
            name = studentName;
        } else {
            name = "Unknown";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first student: ");
        String name1 = scanner.nextLine();
        Student student1 = new Student(name1);

        System.out.print("Enter the name of the second student: ");
        String name2 = scanner.nextLine();
        Student student2 = new Student(name2);

        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 2 Name: " + student2.name);

        scanner.close();
    }
}
