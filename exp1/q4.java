import java.util.Scanner;

public class q4 {   
       public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1,n2,n3,i,largest;
        System.out.println("Enter age of person 1:");
        n1 = obj.nextInt();
         System.out.println("Enter age of person 2:");
        n2 = obj.nextInt();
         System.out.println("Enter age of person 3:");
        n3 = obj.nextInt();
    
        largest = n3 > (n1>n2 ? n1:n2) ? n3:((n1>n2) ? n1:n2); 
        System.out.println("Older"+largest);

        int young = n3 < (n1<n2 ? n1:n2) ? n3:((n1<n2) ? n1:n2); 
        System.out.println("Youngest"+young);

        

     }
    
}
