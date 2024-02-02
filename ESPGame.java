package assignment1;
import java.util.Scanner;
import java.util.Random;
public class ESPGame {

	public static void main(String[] args) {
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
		
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		System.out.println("\t\t     ESPGame\n");
		
		//these are my constant string variables for my 5 colors
		final String colorRed = "Red";
		final String colorGreen = "Green";
		final String colorBlue = "Blue";
		final String colorOrange = "Orange";
		final String colorYellow = "Yellow";
		
		final String name;
		System.out.print("What is your name: ");
		
		name = input.nextLine();
		
		final String userDescription;
		
		System.out.print("Describe yourself: ");
		
		userDescription = input.nextLine();
				
		final String dueDate;
		
		System.out.print("Due date: ");
		
		dueDate = input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		//these are different identifiers that'll be used inside the for loop
		
		//represents the start of the round of the game
		int round = 1;
		int totalCorrect=0;
		
		//the color that the game will randomly pick and compare it with the users choice
		String targetColor;
		
		//this will be used later on in the loop which determines if the user should receive the point
		boolean getsPoint=true;
		
		
				
		for(int i =0; i<11;i++)
		{
			System.out.println("Round "+round+"\n");
			//randomly generates a number and decides which color to pick that the user has to guess
			int numGenerator = num.nextInt(5)+1;
			if(numGenerator ==1)
			{
				targetColor = colorRed;
			}
			else if(numGenerator ==2)
			{
				targetColor = colorGreen;
			}
			else if(numGenerator ==3)
			{
				targetColor = colorBlue;
			}
			
			else if(numGenerator ==4)
			{
				targetColor = colorOrange;
			}
			else
			{
				targetColor = colorYellow;
			}
			boolean correct = false;
			
			//as long as "correct" is false, the while loop will continue
			while(!correct)
			{
				System.out.println("I am thinking of a color.\nIs it Red, Green, Blue, Orange,"
						+ " or Yellow?\nEnter your guess:");
				
				String chosenColor = input.nextLine();
				
				//if the color typed by the user matches the color that the game picked either 
				//all lowerCase or start upperCase, this if statement will run
				if(chosenColor.equals(targetColor)|| chosenColor.equals(targetColor.toLowerCase()))
				{
					//if the user did not get their guess wrong the first time, they receive the point
					if(getsPoint ==true)
					{   
						System.out.println("I was thinking of "+chosenColor);
						getsPoint = true;
						totalCorrect++;
						correct = true;
						round ++;
					}
					else
					{
						//however if they did get their first guess wrong, they don't recieve any points
						System.out.println("I was thinking of "+chosenColor);
						getsPoint = true;
						correct = true;
						round ++;
					}
				}
				else
				{
					// if the color was wrong, this variable will be set to false to let
					//the other if statments know that they got their first guess wrong
					getsPoint = false;
					System.out.println("You entered an incorrect color, try again");
				}
			}
			
			
		}
		
		//prints game over after round 11 and their information entered when starting the game
		System.out.println("Game Over\n");
		
		//closes the scanner
		input.close();
		System.out.println("You guessed "+totalCorrect+" out of 11 colors correctly.");
		System.out.println("Student Name: "+name);
		System.out.println("User Description: "+userDescription);
		System.out.println("Due date: "+dueDate);
		

	}
}
