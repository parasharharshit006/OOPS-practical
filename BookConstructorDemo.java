//practical 6
class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class BookConstructorDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("--- Book 1 (No-Argument Constructor) ---");
        book1.display();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        System.out.println("\n--- Book 2 (Parameterized Constructor) ---");
        book2.display();
        Book book3 = new Book(book2);
        System.out.println("\n--- Book 3 (Copy Constructor - Copied from Book 2) ---");
        book3.display();
        System.out.println("\n=== Modifying Book 3's price and title ===");
        book3.title = "Modified Title";
        book3.price = 25.50;

        System.out.println("\nAfter modification:");
        System.out.print("Book 2 (Original): ");
        book2.display();
        System.out.print("Book 3 (Copied/Modified): ");
        book3.display();
    }
}