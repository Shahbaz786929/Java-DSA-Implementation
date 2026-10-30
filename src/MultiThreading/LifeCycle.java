package MultiThreading;

public class LifeCycle {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableTask());

        // Abhi thread New state mein hai, kyunki humne sirf object banaya hai.
        System.out.println("Thread state after creation: " + thread.getState());

        // Thread ko start karte hi wo Runnable state mein chala jayega.
        thread.start();
        System.out.println("Thread state after calling start(): " + thread.getState());

        try {
            // Thoda time dete hain taaki thread apne kaam kare aur phir dekhenge ki wo terminate hua ya nahi.
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ab thread ka kaam khatam ho gaya hoga, isliye wo Terminated state mein hoga.
        System.out.println("Thread state at the end: " + thread.getState());
    }
}

class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        // Yeh thoda time lega, jisse humein thread ka state change dekhne ka mauka milega.
        for (int i = 0; i < 5; i++) {
            System.out.println("Running thread: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

