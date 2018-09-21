package edu.tahai.java.assignment3;

import java.util.Random;

public class Loops 
{
	int i = 0;
			
	//create word array
	String[] wordsArr = {"Horse", "Car", "Home", "School"};
	
	//create mask
	public void createMask()
	{
		
	//generate random number
		Random rand = new Random();
		int  n = rand.nextInt(4) + 0;
		
	//use random number to select word from array and mask letters
		for(int i = 0; i < wordsArr[n].length(); i++)
		{
			System.out.print("*");
		}
	}
	
	
	//still need to add while loop ****************************************
	
	
	//still need to add nested loops ***************************************
	
	
}