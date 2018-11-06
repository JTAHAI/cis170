package edu.tahai.java.hangmanproject2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App 
{


	// load game from file *****************************************************
	private List<Game> loadGames() throws IOException
	{
		List<Game> game = new ArrayList<Game>();
		File f = new File("games.txt");
	
		if(f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String st;
			while ((st = br.readLine()) != null)
			{
				String[] splitGames = st.split(" ");
				Game g = new Game();
				u.setHint(splitGames[0]);
				u.setWord(splitGames[1]);
				}
				game.add(g);
			}
		}
			return users;
	}
	
	
	
	
	
	// number of allowed guesses
	private int guessCount = 6;
	
	// Control flow of game.
	public void playGame()
	{

		// change to file buffered reader ******************** no longer an array ****************************************
		
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
