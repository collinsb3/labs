import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);		
System.out.println("Welcome to th Movie List Application!");
System.out.println("There are 100 movies in the list");
System.out.println("What category are you interested in?");
System.out.println("Please Choose from: scifi, horror, drama, animated");
 String userInput = sc.next();
		ArrayList<Movie> movies = new ArrayList<>();
		
movies.add(new Movie("ET", "scifi"));
movies.add(new Movie("Star Wars", "scifi"));
movies.add(new Movie("Scanners", "horror"));
movies.add(new Movie("Creepers", "horror"));
movies.add(new Movie("Green Mile", "drama"));
movies.add(new Movie("Space Jam", "animated"));
movies.add(new Movie("Up", "animated"));
movies.add(new Movie("The Lady in Black", "horror"));
movies.add(new Movie("Pretty Woman", "drama"));
movies.add(new Movie("Finding Nemo", "animated"));
for (Movie movie : movies) {
	if ( userInput.equalsIgnoreCase(movie.getMovieCategory() ) ) {
		System.out.println(movie.getName());
	}
	}

}
}
