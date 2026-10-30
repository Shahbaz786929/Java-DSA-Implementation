class BankAccount {

    private String accountHolderName;
    private long accountNumber;
    private double balance;
    private String pin;

    public BankAccount(String accountHolderName, long accountNumber, int balance, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

public class EncapsulationExamp {
    public static void main(String[] args) {
        BankAccount bnk = new BankAccount("Mohammad shahbaz", 12345, 5000,"5432");
        System.out.println(bnk.getAccountHolderName());
        System.out.println(bnk.getAccountNumber());
        System.out.println(bnk.getBalance());
        System.out.println(bnk.getPin());
    }
}
