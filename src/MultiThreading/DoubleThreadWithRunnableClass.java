package MultiThreading;

class MyRunnable implements Runnable {
    private String threadNane;

    public MyRunnable(String threadNane) {
        this.threadNane = threadNane;
    }

    @Override
    public void run () {
        for (int i = 0; i <= 5; i++) {
            System.out.println(threadNane + " : " + i);
        }
    }
}

public class DoubleThreadWithRunnableClass {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable("Thread1");
        Thread thread1 = new Thread(runnable);

        MyRunnable runnable1 = new MyRunnable("Thread2");
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();
    }
}
