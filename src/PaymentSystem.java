import javax.xml.transform.Source;
import java.util.Scanner;

interface Payment {
    void processPayment(double amount);
}

abstract class CardPayment implements Payment {
   protected String cardNumber;
   protected String expiryDate;

    public CardPayment(String cardNumber, String expiryDate){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    protected void validateCard() {
        System.out.println("Validating card number: " + cardNumber);
        // dummy check
        if (expiryDate.compareTo("09/25") < 0) {
            System.out.println("Card expired!");
        } else {
            System.out.println("Card valid.");
        }
    }
}
class CreditCardPayment extends CardPayment {
    public CreditCardPayment(String cardNumber, String expiryDate){
        super(cardNumber, expiryDate);
    }

    @Override
    public void processPayment(double amount) {
        validateCard();
        System.out.println("Processing Credit Card Payment of " + amount );
    }
}

class UpiPayment implements Payment {
    private String upiId;
    public UpiPayment(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + " via " + upiId);
    }
}

class PaypalPayment implements Payment {
    private String mail;
    public PaypalPayment(String mail){
        this.mail = mail;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of " + amount + " via " + mail);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the Payment Method");

        System.out.println("\n1 Credit Card");
        System.out.println("2 UPI");
        System.out.println("3 payPal");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Amount: ₹");
        double amount = sc.nextDouble();
        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.println("Enter Card Number:");
                String cardNumber = sc.nextLine();
                System.out.println("Enter Expiry Date:");
                String expiryDate = sc.nextLine();
                payment = new CreditCardPayment(cardNumber,expiryDate);
                break;

            case 2:
                System.out.println("Enter your UPI ID:");
                String upiId = sc.nextLine();
                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.println("Enter PayPal Mail:");
                String mail = sc.nextLine();
                payment = new PaypalPayment(mail);
                break;

            default:
                System.out.println("Invalid Choice!!!!");
                System.exit(0);
        }
        payment.processPayment(amount);

        sc.close();
        /*
        Payment p1 = new CreditCardPayment("1234-5678-9876-5432", "12/26");
        Payment p2 = new UpiPayment("shahbaz@upi");
        Payment p3 = new PaypalPayment("shahbaz78692@gmail.com");

        p1.processPayment(5000);
        p2.processPayment(6000);
        p3.processPayment(7000);

         */
    }
}
