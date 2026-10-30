package MultiThreading;

public class TwoThreadUsingLambdaExp {
    public static void main(String[] args) {

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 : " + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i<5; i++) {
                System.out.println("Thread Two : " + i);
            }
        };

        Thread thread = new Thread(task1);
        Thread thread1 = new Thread(task2);

        thread.start();
        thread1.start();
    }
}
