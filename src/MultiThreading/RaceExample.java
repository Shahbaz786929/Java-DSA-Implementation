package MultiThreading;

class Account {
    int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {        // CHECK
            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            balance = balance - amount; // ACT
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " cannot withdraw, insufficient balance");
        }
    }
}

public class RaceExample {
    public static void main(String[] args) throws InterruptedException {

        Account acc = new Account();

        Thread t1 = new Thread(() -> acc.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> acc.withdraw(700), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance = " + acc.balance);  // WRONG
    }
}

