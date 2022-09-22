import java.util.Scanner;
public class MovieManagementSystem {
    public static void main(String[] args) {
        String movieName, startTime, movieEndTime, movieTicketPrice;
        Movie movie = new Movie(); // Creating object of movie class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name: "); movieName = sc.nextLine(); // taking user input
        System.out.println("Enter Movie Start Time: "); startTime = sc.nextLine();
        System.out.println("Enter Movie End Time: "); movieEndTime = sc.nextLine();
        System.out.println("Enter Movie Ticket price: "); movieTicketPrice = sc.nextLine(); sc.close(); // closing Scanner

        movie.setMovie(movieName, startTime, movieEndTime, movieTicketPrice); // calling setMovie method and passing parameters 
        System.out.println(movie.getMovie()); // calling getMovie method for getting all details
    }
}
class Movie {
    private String movieName, StartTime, movieEndTime, MovieTicketPrice; // declaring all variable as private
    public void setMovie(String movieName, String startTime, String movieEndTime, String MovieTicketPrice) { // setter method
        this.movieName = movieName; this.StartTime = startTime; this.movieEndTime = movieEndTime;
        this.MovieTicketPrice = MovieTicketPrice;
    }
    public String getMovie() { // getter method
        return movieName + " :: "+ StartTime+ " :: "+ movieEndTime + " :: "+ MovieTicketPrice;
    }
}