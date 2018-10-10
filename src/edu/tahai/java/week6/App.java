package edu.tahai.java.week6;

import java.util.Scanner;

/**
 * Future steps:
 * Control number of tries.
 * Make case insensitive.
 * Play multiple games in a row.
 * 
 * @author sjustintahai
 *
 */
public class App 
{

	
	Game[] gArray = {new Game("Meow", "Cat"), new Game("Woof", "Dog")};
	
	// number of allowed guesses
	private int guessCount = 6;
	
	// Control flow of game.
	public void playGame()
	{

		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < gArray.length; i++)
		{
		Game g = gArray[i];
		// number of allowed guesses
		int guessCount = 6;
		
		
		// Repeat while not solved
		while(!g.isSolved() && guessCount > 0)
		{
			// Prompt the user
			System.out.println("Guess a letter ");
			System.out.println("Hint " + g.getHint());
			// Display current mask
			System.out.println("Mask " + g.generateMask());
			// Collect user input
			String userGuess = sc.nextLine();
			g.setGuesses(userGuess.toLowerCase());
			g.setGuesses(userGuess.toUpperCase());
			
			guessCount --;
			System.out.println("You have " + guessCount + " guesses remaining.");			
		}
		
		// play again?
		if(g.isSolved())
		{
			System.out.println("Play again? y/n?");
			String playAgain = sc.nextLine();

		}
		}
	}
	public static void main(String[] args)
	{
		App app = new App();
		app.playGame();

	}
}
