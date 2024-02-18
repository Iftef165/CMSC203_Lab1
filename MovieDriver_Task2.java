package labWork1Part2;

import java.util.Scanner;

public class MovieDriver_Task2 {
	
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
		
		Movie movie1 = new Movie();
		
		//determines if the program should continue to ask them questions
		String goOn;
		
		do
		{
			
			// retrieves users name, rating and number of tickers sold for the movie
			System.out.println("Enter the name of a movie");
			
			String name1 = input.nextLine();
			
			movie1.setTitle(name1);
			
			System.out.println("Enter the rating of the movie");
			
			String movieRating = input.nextLine();
			
			movie1.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			
			int soldTickets = input.nextInt();
			
			movie1.setSoldTickets(soldTickets);
			
			//prints the results of the movie 
			System.out.println(movie1.toString());
			
			input.nextLine();
			
			//asks whether the user wants to be questioned about other movies
			System.out.println("Do you want to enter another (y/n)");
			
			goOn = input.nextLine();
			
			//if the user enters "y" the do-while loop will be true and the program iterates from the top
		}while(goOn.equals("y"));
		
		// if the user types "n", the goodbye message will appear and the Scanner will close
		System.out.println("Goodbye");
		
		input.close();

	}

}
