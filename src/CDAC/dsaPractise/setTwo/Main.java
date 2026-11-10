package CDAC.dsaPractise.setTwo;

public class Main {
    public static void main(String[] args) {
        ProductLinkedList catalog=new ProductLinkedList();
        System.out.println("--- 1. POSITIONAL INSERTIONS ---");
        catalog.insertAtPosition(new Product(101, "Wireless Mouse", "Electronics", 4.3, 899.0), 0);
        // At head
         catalog.insertAtPosition(new Product(102, "Mechanical Keyboard", "Electronics", 4.8, 4500.0), 1);
         // At tail
        catalog.insertAtPosition(new Product(103, "USB-C Cable", "Accessories", 4.1, 499.0), 1); // In middle
         catalog.insertAtPosition(new Product(104, "Gaming Monitor", "Electronics", 4.7, 18500.0), 0); // New head
         catalog.insertAtPosition(new Product(105, "Noise Cancelling Headphones", "Audio", 4.6, 9999.0), 4); // New tail
         System.out.println("Invalid position (pos 99): " + catalog.insertAtPosition(new Product(106, "Webcam", "Electronics", 4.2, 2200.0) , 99));
         System.out.println("\nCatalog (Size=" + catalog.size() + "):");
         catalog.display();
         System.out.println("\n--- 2. DELETING LUXURY ITEMS (Price >= Rs. 5000) ---");
         int deleted= catalog.deleteByPriceThreshold(5000.0);
         System.out.println("Total products deleted: " + deleted);
         System.out.println("\nCatalog after deletions (Size=" + catalog.size() + "):");
         catalog.display();
    }
}
