import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Complex complex1 = new Complex();
    
        System.out.print("Enter the real part for Complex1: ");
        double realPartInput = scanner.nextDouble();
        complex1.setRealPart(realPartInput);

        System.out.print("Enter the imaginary part for Complex1: ");
        double imaginaryPartInput = scanner.nextDouble();
        complex1.setImaginaryPart(imaginaryPartInput);

        System.out.println("Complex: Real Part = " + complex1.getRealPart() +", Imaginary Part = " + complex1.getImaginaryPart());
        System.out.println( complex1.getRealPart()+"+"+ complex1.getImaginaryPart()+"j");

        scanner.close();
    }
}
