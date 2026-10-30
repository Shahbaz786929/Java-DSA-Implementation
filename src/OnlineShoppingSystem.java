import java.util.ArrayList;
import java.util.Scanner;

interface Discountable {
    double applyDiscount(double percent);
}

abstract class Product_1 {
    private String productName;
    private double price;
    private int quantity;

    public Product_1 (String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotalPrice (){
        return price * quantity;
    }

    public abstract void displayProduct ();
}

class Electronics extends Product_1 implements Discountable {

    private String warrantyPeriod;

    public Electronics(String productName, double price, int quantity, String warrantyPeriod) {
        super(productName, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public double applyDiscount(double percent) {
        double discount = getPrice() * percent / 100;
        setPrice(getPrice() - discount);
        return getPrice();
    }

    @Override
    public void displayProduct() {
        System.out.println("Product: " + getProductName() + ", Price: " + getPrice() +
                ", Quantity: " + getQuantity() + ", Warranty: " + getWarrantyPeriod() + " months" +
                ", Total: " + calculateTotalPrice());
    }
}

class Clothes extends Product_1 implements Discountable {

    private String size;
    private String material;

    public Clothes(String productName, double price, int quantity, String size, String material) {
        super(productName, price, quantity);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double applyDiscount(double percent) {
        double discount = getPrice() * percent / 100;
        setPrice(getPrice() - discount);
        return getPrice();
    }

    @Override
    public void displayProduct() {
        System.out.println("Product: " + getProductName() + ", Price: " + getPrice() +
                ", Quantity: " + getQuantity() + ", Size: " + getSize() + ", Material: " +
                getMaterial() + ", Total: " + calculateTotalPrice());
    }
}


class Grocery extends Product_1 implements Discountable {
    private String expiryDate;

    public Grocery(String productName, double price, int quantity, String expiryDate) {
        super(productName, price, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public double applyDiscount(double percent) {
        double discount = getPrice() * percent / 100;
        setPrice(getPrice() - discount);
        return getPrice();
    }

    @Override
    public void displayProduct() {
        System.out.println("Product: " + getProductName() + ", Price: " + getPrice() +
                ", Quantity: " + getQuantity() + ", ExpiryDate: " + getExpiryDate() + ", Total: " + calculateTotalPrice());
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product_1> cart = new ArrayList<>();

        System.out.println("Welcome to Online Shopping System!");
        boolean exit = false;

        while (!exit){
            System.out.println("1. Add Electronics:");
            System.out.println("2. Add Clothes:");
            System.out.println("3. Add Grocery");
            System.out.println("4. Show Cart");
            System.out.println("5. Discount:");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Electronics Name:");
                    String ename = sc.nextLine();
                    System.out.println("Enter price:");
                    double eprice = sc.nextDouble();
                    System.out.println("Enter Quantity:");
                    int equantity = sc.nextInt();
                    System.out.println("Enter Warranty-(DD-MM-YYYY)");
                    String ewarranty = sc.nextLine();
                    cart.add(new Electronics(ename,eprice,equantity,ewarranty));
                    break;

                case 2:
                    System.out.println("Enter Clothes Name:");
                    String cname = sc.nextLine();
                    System.out.println("Enter Price:");
                    double cprice = sc.nextDouble();
                    System.out.println("Enter Quantity:");
                    int cquantity = sc.nextInt();
                    System.out.println("Enter Size:");
                    String csize = sc.nextLine();
                    System.out.println("Enter Material:");
                    String cmaterial = sc.nextLine();
                    cart.add(new Clothes(cname, cprice, cquantity, csize, cmaterial));
                    break;

                case 3:
                    System.out.println("Enter Grocery Name:");
                    String gname = sc.nextLine();
                    System.out.println("Enter Price:");
                    double gprise = sc.nextDouble();
                    System.out.println("Enter Quantity:");
                    int gquantity = sc.nextInt();
                    System.out.println("Enter ExpiryDate-(DD-MM-YYYY)");
                    String gexpiryDate = sc.nextLine();
                    cart.add(new Grocery(gname, gprise, gquantity, gexpiryDate));
                    break;

                case 4:
                    System.out.println("\n--- Cart Details ---");
                    for (Product_1 p : cart) {
                        p.displayProduct();
                    }
                    break;

                case 5:
                    System.out.print("Enter discount percentage to apply: ");
                    double percent = sc.nextDouble();
                    for (Product_1 p : cart) {
                        ((Discountable) p).applyDiscount(percent);
                    }
                    System.out.println("Discount applied successfully!");
                    break;

                case 6:
                    exit = true;
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }
}
