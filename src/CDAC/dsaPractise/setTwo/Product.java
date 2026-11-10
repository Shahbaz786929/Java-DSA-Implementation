package CDAC.dsaPractise.setTwo;

public class Product {
    int pid;
    String name;
    String category;
    double price;
    double rating;

    public Product(int pid, String name, String category, double rating, double price) {
        this.pid = pid;
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
