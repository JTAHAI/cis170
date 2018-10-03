package edu.tahai.java.week5;


public class Hangman 
{
	
		public static void main(String[] args)
	{
		//call createMask to print mask to console
			Loops l = new Loops();
			l.createMask();
			
		//call gameLoop to play
			Loops g = new Loops();
			g.gameLoop();
			

	}
}
