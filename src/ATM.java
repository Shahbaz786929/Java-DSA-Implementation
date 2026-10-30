import java.util.Scanner;

public class ATM {

    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public  void deposit (double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw( double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance: " + balance);
        }
        else {
            System.out.println("Insufficient Balance:");
        }
    }

    public void checkBalance() {
        System.out.println("Your Current Balance is : " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial Balance: ");
        double initialBalance = sc.nextDouble();

        ATM atm = new ATM(initialBalance);

        while (true) {
            System.out.println("Choose 1 for deposit:");
            System.out.println("Choose 2 for withdraw:");
            System.out.println("Choose 3 for Check Balance:");
            System.out.println("Choose 4 for Exit:");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    atm.withdraw(wd);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting.... Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invelid Choice, try again");
            }
        }

    }
}
