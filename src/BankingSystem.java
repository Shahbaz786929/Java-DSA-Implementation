class Customer {
    private String name;
    private String customerId;

    public Customer (String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

interface Transection {
    void withdraw(double amount);
    void deposit(double amount);
    void transfer(Account toAccount,double amount);
}

abstract class Account implements Transection {
    private String accountNumber;
    protected double balance;

    public Account (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit is " + amount);
    }

    public abstract void withdraw(int amount);

    public void transfer(Account toAccount, double amount){}
}

public class BankingSystem {
}
