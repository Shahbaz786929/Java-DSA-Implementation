package MultiThreading;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;   // now only one thread enters at a time
    }
}

public class SyncExample2 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (with sync): " + c.count);
    }
}

