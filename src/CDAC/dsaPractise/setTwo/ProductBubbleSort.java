package CDAC.dsaPractise.setTwo;

public class ProductBubbleSort {

    public static void bubbleSort(Product [] products) {

        int n= products.length;
        for(int i=0;i<n-1;i++){

            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){

                if(products[j].rating <products[j+1].rating ||
                        (products[j].rating == products[j+1].rating && products[j].price >products[j+1].price)){

                    Product temp=products[j];
                    products[j]=products[j+1];
                    products[j+1]=temp;

                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }

    }

    public static void main(String[] args) {
        Product[] inventory= {new Product(301, "Smart Watch", "Wearables", 4.5, 4999.0),
                new Product(302, "Fitness Tracker", "Wearables", 4.2, 1999.0),
                new Product(303, "Bluetooth Speaker", "Audio", 4.5, 2499.0),
                // Same rating asSmart Watch, cheaper!
                new Product(304, "Earbuds", "Audio", 4.8, 3999.0),
                new Product(305, "Power Bank", "Accessories", 4.2, 1499.0),
                // Same rating asTracker, cheaper!
                new Product(306, "Laptop Stand", "Accessories", 4.5, 1299.0) // Same rating,cheapest of the 4.5s!
                 };
                System.out.println("--- BEFORE BUBBLE SORT ---");
                for (Product p : inventory) System.out.println(p);
                bubbleSort(inventory);
                System.out.println("\n--- AFTER OPTIMIZED BUBBLE SORT (Rating DESC, Price ASC) ---");
                for (Product p : inventory)
                    System.out.println(p);
    }
}
