
import java.util.ArrayList;
import java.util.Scanner;

public class MovieBookingSystem {

    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int bookingCounter = 1001;

    public MovieBookingSystem() {

        movies.add(new Movie(1, "Sholay", "Action", 180));
        movies.add(new Movie(2, "Ghayal", "Action", 150));
        movies.add(new Movie(3, "Virasat", "Drama", 160));
        movies.add(new Movie(4, "Meri Jung", "Action", 140));
    }

    public void viewMovies() {

        System.out.println("\n===== AVAILABLE MOVIES =====");

        for (Movie movie : movies) {
            movie.displayMovie();
        }
    }

    public void bookTickets() {

        viewMovies();

        System.out.print("\nEnter Movie ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Movie selectedMovie = null;

        for (Movie movie : movies) {
            if (movie.movieId == id) {
                selectedMovie = movie;
                break;
            }
        }

        if (selectedMovie == null) {
            System.out.println("Invalid Movie ID!");
            return;
        }

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        if (tickets <= 0) {
            System.out.println("Enter a valid number of tickets!");
            return;
        }

        Booking booking = new Booking(
            bookingCounter++,
            name,
            selectedMovie,
            tickets
        );

        bookings.add(booking);

        System.out.println("\nBooking Successful!");
        booking.displayBooking();
    }

    public void viewBookings() {

        if (bookings.isEmpty()) {
            System.out.println("\nNo bookings available.");
            return;
        }

        System.out.println("\n===== BOOKING HISTORY =====");

        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }

    public void start() {

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("  MOVIE TICKET BOOKING SYSTEM");
            System.out.println("==============================");
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    viewMovies();
                    break;

                case 2:
                    bookTickets();
                    break;

                case 3:
                    viewBookings();
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using our system!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Try again."
                    );
            }

        } while (choice != 4);

        sc.close();
    }
}
