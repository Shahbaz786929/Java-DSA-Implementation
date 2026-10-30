package MultiThreading;

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException {

        // Thread 1: SLEEP STATE INTERRUPT
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("T1: Going to sleep for 5 sec...");
                Thread.sleep(5000);
                System.out.println("T1: Completed sleep");
            } catch (InterruptedException e) {
                System.out.println("T1: I was interrupted during sleep!");
            }
        });

        // Thread 2: RUNNING LOOP INTERRUPT
        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("T2: Working...");
                try {
                    Thread.sleep(500); // small pause
                } catch (InterruptedException e) {
                    System.out.println("T2: Interrupted inside sleep!");
                    Thread.currentThread().interrupt(); // re-set flag
                }
            }
            System.out.println("T2: Stopped after interrupt signal.");
        });

        t1.start();
        t2.start();

        Thread.sleep(2000); // Wait 2 sec, then interrupt both

        System.out.println("\nMain: Interrupting T1 and T2\n");

        t1.interrupt(); // Interrupt sleep thread
        t2.interrupt(); // Interrupt loop thread

        t1.join();
        t2.join();

        System.out.println("Main: All threads stopped.");
    }
}
