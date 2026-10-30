import java.util.*;

// Parent class
class Item {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayItem() {
        System.out.println(id + ". " + name + " - ₹" + price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return id == other.id;
    }
}

// Child class
class FoodItem extends Item {
    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }
}

// Cart class
class Cart {
    private HashMap<Item, Integer> items = new HashMap<>();

    public Cart() {
//        items = new HashMap<>();
    }

    public void addItem(Item item, int qty) {
        items.put(item, items.getOrDefault(item, 0) + qty);
        System.out.println(qty + " x " + item.getName() + " added to cart.");
    }

    public void removeItem(Item item) {
        if(items.containsKey(item)) {
            items.remove(item);
            System.out.println(item.getName() + " removed from cart.");
        } else {
            System.out.println("Item not in cart.");
        }
    }

    public void viewCart() {
        if(items.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        double total = 0;
        System.out.println("\n--- Your Cart ---");
        // entry.Set() is the check both key and value
        for(Map.Entry<Item, Integer> entry : items.entrySet()) {
            // getkey () return the key on hashMap only
            Item item = entry.getKey();
            //getValue () is the return value only
            int qty = entry.getValue();
            double subtotal = item.getPrice() * qty;
            System.out.println(item.getName() + " x " + qty + " = ₹" + subtotal);
            total += subtotal;
        }
        System.out.println("Total Bill: ₹" + total + "\n");
    }

    public void checkout() {
        if(items.isEmpty()) {
            System.out.println("Cart is empty! Cannot checkout.");
            return;
        }
        double total = 0;
        System.out.println("\n--- Final Bill ---");
        for(Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int qty = entry.getValue();
            double subtotal = item.getPrice() * qty;
            System.out.println(item.getName() + " x " + qty + " = ₹" + subtotal);
            total += subtotal;
        }
        System.out.println("Total Bill: ₹" + total);
        System.out.println("Thank you for your order!\n");
        items.clear();
    }
}

// Main class
public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menu items
        List<Item> menu = new ArrayList<>();
        menu.add(new FoodItem(1, "Burger", 120));
        menu.add(new FoodItem(2, "Pizza", 250));
        menu.add(new FoodItem(3, "Momos", 80));
        menu.add(new FoodItem(4, "Pasta", 200));
        menu.add(new FoodItem(5, "Coke", 50));

        Cart cart = new Cart();
        int choice;

        do {
            System.out.println("\n--- Food Ordering System ---");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\n--- Menu ---");
                    for(Item item : menu) item.displayItem();
                    break;
                case 2:
                    System.out.print("Enter Item ID to add: ");
                    int addId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    Item addItem = null;
                    for(Item item : menu) {
                        if(item.getId() == addId) {
                            addItem = item;
                            break;
                        }
                    }
                    if(addItem != null) cart.addItem(addItem, qty);
                    else System.out.println("Invalid Item ID!");
                    break;
                case 3:
                    System.out.print("Enter Item ID to remove: ");
                    int removeId = sc.nextInt();
                    Item removeItem = null;
                    for(Item item : menu) {
                        if(item.getId() == removeId) {
                            removeItem = item;
                            break;
                        }
                    }
                    if(removeItem != null) cart.removeItem(removeItem);
                    else System.out.println("Invalid Item ID!");
                    break;
                case 4:
                    cart.viewCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(choice != 6);

        sc.close();
    }
}
