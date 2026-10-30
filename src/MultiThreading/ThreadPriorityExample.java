package MultiThreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {

    Runnable task = () -> {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    };


        Thread max = new Thread(task);
        max.setPriority(Thread.MAX_PRIORITY);
        max.setName("Max");

        Thread mid = new Thread(task);
        mid.setPriority(Thread.NORM_PRIORITY);
        mid.setName("Normal");

        Thread min = new Thread(task);
        min.setPriority(Thread.MIN_PRIORITY);
        min.setName("Min");

        max.start();
        mid.start();
        min.start();
    }
}
