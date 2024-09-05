import java.util.*;
class q5{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int x=2, y=5, z=0;
        boolean a = (x==2);
        System.out.println(a);
        boolean b = (x!=5);
        System.out.println(b);
        boolean c = (x!=5 && y>=5);
        System.out.println(c);
        boolean d = (z!=0 || x==2);
        System.out.println(d);
        boolean e = (!(y<10));
        System.out.println(e);
    }
}
