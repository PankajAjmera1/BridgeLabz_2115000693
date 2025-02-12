class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket last;
    private int totalTickets;

    public TicketReservationSystem() {
        this.last = null;
        this.totalTickets = 0;
    }

    // Add a new ticket at the end
    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            newTicket.next = newTicket;
            last = newTicket;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        totalTickets++;
        System.out.println("Ticket booked successfully.");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next, prev = last;
        do {
            if (current.ticketID == ticketID) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                totalTickets--;
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket ID not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = last.next;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Search ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    // Get total number of booked tickets
    public int getTotalTickets() {
        return totalTickets;
    }
}

public class TicketReservationSystemMain {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Rajesh", "3 Idiots", 5, "10:30 AM");
        system.addTicket(102, "Sneha", "Dangal", 12, "1:00 PM");
        system.addTicket(103, "Amit", "Thor", 8, "3:30 PM");

        system.displayTickets();

        System.out.println("Searching for 'Dangal':");
        system.searchTicket("Dangal");

        System.out.println("Total Tickets: " + system.getTotalTickets());

        system.removeTicket(102);
        system.displayTickets();
    }
}
