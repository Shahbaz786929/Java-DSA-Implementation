import java.util.ArrayList;

public class ShoppingCardSystemCons {

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Mouse", 500);
        Product p3 = new Product(103, "Keyboard", 1500);

        ShoppingCard cart = new ShoppingCard();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.showCard();

        cart.removeProduct(102);

        cart.showCard();
    }
}

class ShoppingCard{
    ArrayList<Product> products;

   public ShoppingCard(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
       products.add(p);
        System.out.println("Product added: " + p.productId + " - " + p.productName + " - " + p.price);
    }

    public void removeProduct(int productId){
       boolean remove = false;
       for (Product p : products) {
           if (p.productId == productId) {
               products.remove(p);
               System.out.println("Product remove: " + p.productId);
               remove = true;
               break;
           }
       }
       if (!remove) {
           System.out.println("Product not found: " + productId);
       }
    }

    public double calculateTotal() {
       double total = 0;
       for (Product p : products){
           total += p.price;
       }
       return total;
    }

    public void showCard() {
        System.out.println("Cart Details:");
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("Total Price: " + calculateTotal());
    }
}

 class Product {
     int productId;
     String productName;
     double price;

     public Product(int productId, String productName, double price) {
         this.productId = productId;
         this.productName = productName;
         this.price = price;
     }

     public void displayProduct() {
         System.out.println(productId + " - " + productName + " - " + price);
     }
 }