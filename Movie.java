
public class Movie {

    int movieId;
    String movieName;
    String genre;
    double ticketPrice;

    public Movie(int movieId, String movieName,
                 String genre, double ticketPrice) {

        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public void displayMovie() {
        System.out.println(
            movieId + ". " + movieName
            + " | Genre: " + genre
            + " | Price: Rs. " + ticketPrice
        );
    }
}
