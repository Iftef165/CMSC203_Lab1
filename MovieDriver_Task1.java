package labWork1;

import java.util.Scanner;
public class MovieDriver_Task1 {
	
	/*
	 * Class: CMSC203
	 * Instructor: Farnaz Eivazi
	 * Description: asks the user to guess a color and calculate how many they got correct at the end
	 * Due: 2/01/2024
	 * Platform/compiler: Eclipse 
	 * I pledge that I have completed the programming assignment
	 * independently. I have not copied the code from a student or
	 * any source. I have not given my code to any student.
	 * Print your Name here: Ifte Maksud
	 */
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//new object for the movie
		Movie movie1 = new Movie();
		
		//user is asked about what is the name of the movie
		System.out.println("Enter the name of a movie");
		
		//store there response onto string literal
		String name1 = input.nextLine();
		
		// assigns there value to the title Attribute in Movie class
		movie1.setTitle(name1);
		
		// asks the user about the movie rating
		System.out.println("Enter the rating of the movie");
		
		String movieRating = input.nextLine();
		
		//assigns there response in "rating" attribute in movie class
		movie1.setRating(movieRating);
		
		// asks for the number of tickets
		System.out.println("Enter the number of tickets sold for this movie");
		
		// store their response into an integer variable
		int soldTickets = input.nextInt();
		
		// assings their responce to "soldTickets" attribute in movie class
		movie1.setSoldTickets(soldTickets);
		
		//prints their result of the overall movie
		System.out.println(movie1.toString());
		
		System.out.println("Goodbye");
		
		input.close();
		

	}

}
