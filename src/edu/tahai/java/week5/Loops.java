package edu.tahai.java.week5;

import java.util.Random;
import java.util.Scanner;

public class Loops 
{
	int i = 0;
	int g = 5;
	
	//create word array
	String[] wordsArr = {"HORSE", "CAR", "HOME", "SCHOOL", "JAVA", "COMPUTER", "SCIENCE"};
	
	//create guessed letter array
	String[] guessedLetters = {};
	
	//generate random number
	Random rand = new Random();
	int  n = rand.nextInt(7) + 0;
	
	//choose and then store a word from word array as variable for current game using random number
	String gameWord = wordsArr[n];

	Scanner scanner = new Scanner(System.in);

	//create mask
	
	public void createMask()
	{
		
	//create initial mask

		for(int i = 0; i < gameWord.length(); i++)
		{
			System.out.print("*");
		}
	}
	
	public void inputLoop()
	{
		//prompt user to guess a letter
		System.out.println();
		System.out.println("Guess a letter: ");

	    while (!scanner.hasNext("[A-Za-z]+")) 
	    {
	        System.out.println("Letters only! Guess a letter:");
	        scanner.nextLine();
	    }

	}
	//create game play loop
	public void gameLoop()
	{

	//insert loop logic

		
	//check if user input is contained in gameWord
	    if(gameWord.contains(scanner.next()))
	    {
	        System.out.println("You got a letter!");
	    }
	        else
	    {
	    	System.out.println("Fail...");
	    	g--;
	    }

	
	    
	//create and display new mask

		
		
		
	//display list of letters guessed
		System.out.println("You guessed: " + scanner.next());
		
	//display state of "hang man" (number of incorrect guesses)
		if(g > 0)
		{
		System.out.println("You have " + g + " incorrect guesses remaining.");
		}
		else
		{
		System.out.println("GAME OVER.");

		}
		    	
		

		
		
		
	//prompt user to guess again
		
	}
}
