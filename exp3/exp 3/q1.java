import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a 4-digit number");
        int n = myObj.nextInt();
        int temp = n;
        int[] a = new int[4];

        for (int i = 3; i >= 0; i--) {
            a[i] = temp % 10;
            temp /= 10;
        }

        boolean result = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    int num1 = a[i] * 10 + a[j];
                    int num2 = (a[3 - i] * 10 + a[3 - j]);

                    if (num1 * num2 == n) {
                        result = true;
                        break;
                    }
                }
            }
            if (result) {
                break;
            }
        }

        if (result) {
            System.out.println(n + " is a Vampire number.");
        } else {
            System.out.println(n + " is not a Vampire number.");
        }
    }
}
