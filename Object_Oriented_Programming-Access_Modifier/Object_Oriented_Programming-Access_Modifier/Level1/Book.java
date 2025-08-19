class Book {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("ISBN: " + this.isbn);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid Book object.");
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN101", "The Alchemist", "Paulo Coelho");
        Book b2 = new Book("ISBN102", "Wings of Fire", "A.P.J. Abdul Kalam");

        b1.displayBookDetails();
        b2.displayBookDetails();

        Book.displayLibraryName();
    }
}
