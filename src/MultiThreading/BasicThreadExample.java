package MultiThreading;

public class BasicThreadExample {

    static class MyRunnable implements Runnable {
        @Override
        public void run () {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread : " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
