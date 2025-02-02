import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("\nEBook Details:");
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Book
        System.out.print("Enter Book ISBN: ");
        String bookISBN = scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        String bookAuthor = scanner.nextLine();

        Book book = new Book(bookISBN, bookTitle, bookAuthor);
        book.displayDetails();

        // Update Book Author
        System.out.print("\nEnter Updated Author Name: ");
        String updatedAuthor = scanner.nextLine();
        book.setAuthor(updatedAuthor);
        System.out.println("Updated Author: " + book.getAuthor());

        // Taking input for EBook
        System.out.print("\nEnter EBook ISBN: ");
        String eBookISBN = scanner.nextLine();

        System.out.print("Enter EBook Title: ");
        String eBookTitle = scanner.nextLine();

        System.out.print("Enter EBook Author: ");
        String eBookAuthor = scanner.nextLine();

        EBook eBook = new EBook(eBookISBN, eBookTitle, eBookAuthor);
        eBook.displayEBookDetails();

        scanner.close();
    }
}
