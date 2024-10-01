
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Movie movieProfile = new Movie();
		String toContinue = "";
		do
		{
			System.out.println("Enter the name of the movie");
			String movie = input.nextLine();
			movieProfile.setTitle(movie);
			
			
			System.out.println("Enter the rating of the movie");
			String movieRating = input.nextLine();
			movieProfile.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			int ticketSold = input.nextInt();
			movieProfile.setSoldTickets(ticketSold);
			
			input.nextLine();

			
			System.out.println(movieProfile);
			System.out.println("Do you want to enter another? (y or n)");
			toContinue = input.nextLine();
			
		}while(toContinue.equals("y"));
		
		System.out.println("Goodbye");
		input.close();
	}

}
