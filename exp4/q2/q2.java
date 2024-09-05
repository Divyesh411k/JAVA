package q2;
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            Circle c = new Circle(radius);
            System.out.println("Area of the circle: " + c.calculateArea());
        } else if (choice == 2) {
            System.out.print("Enter the length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();
            Rectangle r = new Rectangle(length, width);
            System.out.println("Area of the rectangle: " + r.calculateArea());
        } else if (choice == 3) {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            Triangle t = new Triangle(base, height);
            System.out.println("Area of the triangle: " + t.calculateArea());
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
