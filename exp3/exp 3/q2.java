import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the number of rows for the irregular array:");
        int numRows = myObj.nextInt();

        int[][] irregularArray = new int[numRows][];

        int count = 1;
        for (int i = 0; i < numRows; i++) {
            irregularArray[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                irregularArray[i][j] = count++;
            }
        }
        System.out.println("Irregular Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
