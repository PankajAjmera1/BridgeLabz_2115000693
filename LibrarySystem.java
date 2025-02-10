abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isReserved;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void displayDetails() {
        System.out.println("------------------------------------------------");
        System.out.println("Item ID       : " + itemId);
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Loan Duration : " + getLoanDuration() + " days");
        System.out.println("Reserved      : " + (isReserved ? "Yes" : "No"));
        System.out.println("------------------------------------------------");
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public boolean isReserved() {
        return isReserved;
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (!isReserved()) {
            setReserved(true);
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        if (!isReserved()) {
            setReserved(true);
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "The Winning Way - by Sachin Tendulkar", "Sachin Tendulkar"),
            new Magazine(2, "Sports Illustrated - Featuring Virat", "Sports Illustrated Editors"),
            new DVD(3, "ABD - The Power Hitter", "Documentary Makers")
        };

        for (LibraryItem item : items) {
            item.displayDetails();
        }

        System.out.println("\n--- Reserving Items ---");
        ((Book) items[0]).reserveItem();  
        ((DVD) items[2]).reserveItem();  

        System.out.println("\n--- Checking Availability ---");
        System.out.println(items[0].getTitle() + " Available: " + ((Book) items[0]).checkAvailability());
        System.out.println(items[2].getTitle() + " Available: " + ((DVD) items[2]).checkAvailability());

        System.out.println("\n--- Updated Library Items ---");
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}
