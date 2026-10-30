package MultiThreading;

public class YieldExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T1 running: " + i);
                Thread.yield(); // giving chance to T2
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("---- T2 running: " + i);
                Thread.yield(); // giving chance to T1
            }
        });

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}

