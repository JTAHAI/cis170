package edu.tahai.java.week5;


public class Hangman 
{
	
		public static void main(String[] args)
	{
			System.out.println("WELCOME TO HANGMAN!");
			System.out.println("Here is your word:");
		//call createMask to print mask to console
			Loops l = new Loops();
			l.createMask();
		//call inputLoop	
			Loops i = new Loops();
			i.inputLoop();
		//call gameLoop to play
			Loops g = new Loops();
			g.gameLoop();


	}
}
