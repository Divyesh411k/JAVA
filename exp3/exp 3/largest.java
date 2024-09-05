import java.util.Scanner;  

class largest{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    
     System.out.println("Enter no. of elements");
    int n=myObj.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
       a[i]= myObj.nextInt();
    }
     int large=a[0];
      for(int i=1;i<n;i++)
    {
       
        if (large<a[i])
            large=a[i];

    }

    System.out.println("The sum of arry is"+large);



   
  }
}