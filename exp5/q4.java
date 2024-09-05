class seven extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(7 +"*"+ i+ "=" + 7*i);
        }
    }
}
class five extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(5 +"*"+ i+ "=" + 5*i);
        }
    
    }
}
class thirteen extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(13 +"*"+ i+ "=" + 13*i);
        }
    }
}

class q4{
    public static void main(String args[]) {
      seven t1=new seven();
      five t2=new five();
      thirteen t3=new thirteen();
      t1.start();
      t2.start();
      t3.start();
    }
}
