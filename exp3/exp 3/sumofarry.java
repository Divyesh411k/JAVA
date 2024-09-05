import java.util.Scanner;  

class sumofarry {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    
     System.out.println("Enter no. of elements");
    int n=myObj.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
       a[i]= myObj.nextInt();
    }
     int sum=0;
      for(int i=0;i<n;i++)
    {
       sum+=a[i];
    }

    System.out.println("The sum of arry is"+sum);



   
  }
}