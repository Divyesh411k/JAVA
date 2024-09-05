import java.util.Scanner;
interface Sports {
    void score();
}

class Student {
    int rollno;

    public Student(int rollno) {
        this.rollno = rollno;
    }
}

class Test extends Student {
    int sem1_marks;
    int sem2_marks;

    public Test(int rollno, int sem1_marks, int sem2_marks) {
        super(rollno);
        this.sem1_marks = sem1_marks;
        this.sem2_marks = sem2_marks;
    }
}

class Result extends Test implements Sports {
    int score;
    int total;

    public Result(int rollno, int sem1_marks, int sem2_marks, int score) {
        super(rollno, sem1_marks, sem2_marks);
        this.score = score;
        calculateTotal();
    }

    @Override
    public void score() {
        System.out.println("Sports score: " + score);
    }

    private void calculateTotal() {
        total = sem1_marks + sem2_marks + score;
    }

    public void displayResult() {
        score();
        System.out.println("Total Marks: " + total);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter Semester 1 Marks: ");
        int sem1_marks = scanner.nextInt();

        System.out.print("Enter Semester 2 Marks: ");
        int sem2_marks = scanner.nextInt();

        System.out.print("Enter Sports Score: ");
        int sportsScore = scanner.nextInt();

        scanner.close();

        Result result = new Result(rollno, sem1_marks, sem2_marks, sportsScore);
        result.displayResult();
    }
}
