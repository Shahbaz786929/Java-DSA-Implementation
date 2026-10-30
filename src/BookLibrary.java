
import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lab = new Library();

        while (true){
            System.out.println("1. Add Book:");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book:");
            System.out.println("4. Show All Books:");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title:");
                    String title = sc.nextLine();
                    System.out.println("Enter Author:");
                    String author = sc.nextLine();
                    Book b1 = new Book(id, title,author);
                    lab.addbook(b1);
                    break;

                case 2:
                    System.out.println("Enter Book ID to borrow:");
                    int borrow = sc.nextInt();
                    lab.borrowBook(borrow);
                    break;

                case 3:
                    System.out.println("Enter Book ID to return:");
                    int ret = sc.nextInt();
                    lab.returnBook(ret);
                    break;

                case 4:
                    lab.showBooks();
                    break;

                case 5:
                    System.out.println("Exiting...... Thank You ");
                    sc.close();
                    return;

                default:
                    System.out.println("Please choice right option:");
            }
        }
    }
}
class Book {
    int id;
    String title;
    String author;
    boolean isAvailable;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public void display() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " |Available: " + isAvailable);
    }
}
class Library{
    ArrayList<Book> books = new ArrayList<>();

    public void addbook(Book b){
        books.add(b);
        System.out.println("Book Added: ");
    }

    public void borrowBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("You borrowed: " + b.title);
                } else {
                    System.out.println("Not available");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.isAvailable) {
                    b.isAvailable = true;
                    System.out.println("Book returned: " + b.title);
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}
