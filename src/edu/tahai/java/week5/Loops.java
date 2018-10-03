package edu.tahai.java.week5;

import java.util.Random;
import java.util.Scanner;

public class Loops 
{
	int i = 0;
	int g = 5;
	
	//create word array
	String[] wordsArr = {"HORSE", "CAR", "HOME", "SCHOOL", "JAVA", "COMPUTER", "SCIENCE"};
	
	//create alphabet array
	String[] alphabetArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	//create guessed letter array
	String[] guessedLetters = {};
	
	//generate random number
	Random rand = new Random();
	int  n = rand.nextInt(7) + 0;
	
	//choose and then store a word from word array as variable for current game using random number
	String gameWord = wordsArr[n];



	//create mask
	
	public void createMask()
	{
		

	//create initial mask
		for(int i = 0; i < gameWord.length(); i++)
		{
			System.out.print("*");
		}
	}
	
	
	//create game play loop
	@SuppressWarnings("resource")
	public void gameLoop()
	{

	//insert loop logic
		
		
	//prompt user to guess a letter
		System.out.println();
		System.out.println("Guess a letter: ");
		Scanner scanner = new Scanner(System.in);
		String guessedLetters = scanner.nextLine();
		
		
	//check if user input is contained in gameWord
	    if(gameWord.contains(guessedLetters.toUpperCase()))
	        System.out.println("You got a letter!");
	    else
	    	System.out.println("Fail...");
	    	g--;
	    	

	
	    
	//create and display new mask
	    if(gameWord.contains(guessedLetters.toUpperCase()))
	    	
	    	// use letter position in logic to create new partial mask
	        System.out.print("*");
		
		
		
	//display list of letters guessed
		System.out.println("You've guessed: " + guessedLetters.toUpperCase());
		
	//display state of "hang man" (number of incorrect guesses)
		if(g > 0)
		System.out.println("You have " + g + " incorrect guesses remaining.");
		else
		System.out.println("GAME OVER.");	

		    	
		

		
		
		
	//prompt user to guess again
		
	}
}
