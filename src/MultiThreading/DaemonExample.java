package MultiThreading;

public class DaemonExample {

    public static void main(String[] args) {

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true); // MUST be before start()
        daemonThread.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread work: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread finished!");
    }
}

