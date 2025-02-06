import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("To LIFE", "Krishna");
        Book book2 = new Book("THE END !", "Krishna");

        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);

        Library library2 = new Library();
        library2.addBook(new Book("The Great", "Ajmera"));

        System.out.println("Library 1 Books:");
        library1.showBooks();
        System.out.println("\nLibrary 2 Books:");
        library2.showBooks();
    }
}

