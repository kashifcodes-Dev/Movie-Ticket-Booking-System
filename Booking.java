
public class Booking {

    int bookingId;
    String customerName;
    Movie movie;
    int numberOfTickets;
    double totalAmount;

    public Booking(int bookingId, String customerName,
                   Movie movie, int numberOfTickets) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;

        this.totalAmount =
            movie.ticketPrice * numberOfTickets;
    }

    public void displayBooking() {

        System.out.println("\n----- BOOKING TICKET -----");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer: " + customerName);
        System.out.println("Movie: " + movie.movieName);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.println("Total Amount: Rs. " + totalAmount);
        System.out.println("--------------------------");
    }
}
