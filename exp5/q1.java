import java.util.LinkedList;
import java.util.Queue;

class Consumer extends Thread {
    private final Queue<Integer> buffer;

    public Consumer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {

                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int data = buffer.poll();
                System.out.println("Consumed: " + data);
             
                buffer.notify();
            }
        }
    }
}

class Producer extends Thread {
    private final Queue<Integer> buffer;
    private int value = 0;

    public Producer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.size() >= 5) {
                    try {
               
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Produced: " + value);
                buffer.offer(value++);
                buffer.notify();
            }
        }
    }
}

public class q1 {
    public static void main(String args[]) {
        Queue<Integer> buffer = new LinkedList<>();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}
