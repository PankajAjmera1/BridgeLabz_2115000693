class Book {
    private static String libraryName = "Edu Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("THE LIFE Pride", "Pankaj Ajmera", "123-456-789");
        Book book2 = new Book("THE END ", "Krish", "987-654-321");

        book1.displayDetails();
        book2.displayDetails();
        Book.displayLibraryName();
    }
}
