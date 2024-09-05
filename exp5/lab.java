class Multi1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 2) {
                Thread.yield(); 
                 System.out.println("Thread1");
            }
           
        }
    }
}

class Multi2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                Thread.yield(); 
            }
            System.out.println("Thread2");
        }
    }
}

class Lab {
    public static void main(String args[]) {
        Multi1 t1 = new Multi1();
        Multi2 t2 = new Multi2();
        t2.start();
        t1.start();
    }
}
