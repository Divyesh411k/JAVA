import java.util.Scanner;

public class q3 {

     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,i;
        System.out.println("Enter number:");
        n = obj.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(+n+"x"+i+"="+n*i+"");
        }

     }
    
}
