package edu.tahai.java.hangmanproject;

import java.util.Scanner;

public class Hangman 
{
public static String gameWord = "cat";
public static String gameHint = "meow";
public static String gameMask1 = gameWord.replace('c' , '*');
public static String gameMask2 = gameWord.replace('a' , '*');
public static String gameMask3 = gameWord.replace('t' , '*');
public static String gameMask4 = gameWord.replace("ca" , "**");
public static String gameMask5 = gameWord.replace("at" , "**");
public static String gameMask6 = gameWord.replace("cat" , "***");
public static String gameMask7 = gameWord.replace("cat" , "*a*");
public static String gameMask8 = gameWord.replace("cat" , "c*t");

public void Start()
{
	System.out.println("WELCOME TO HANGMAN!");
	System.out.println("Word is: " + gameMask6);
	System.out.println("Hint is: " + gameHint);
}

public void Guess()
{
	System.out.println("Guess a letter: ");
	Scanner input = new Scanner(System.in);	
	String guess = input.next();
	if(guess.contains("c"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask5);
	}
	if(guess.contains("a"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask7);
	}
	if(guess.contains("t"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask4);
	}
	System.out.println("Guess a letter: ");
	Scanner input2 = new Scanner(System.in);	
	String guess2 = input.next();
	if(guess.contains("c") && guess2.contains("a"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask3);
	}
	if(guess.contains("c") && guess2.contains("t"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask8);
	}
	if(guess.contains("a") && guess2.contains("c"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask3);
	}
	if(guess.contains("a") && guess2.contains("t"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask1);
	}
	if(guess.contains("t") && guess2.contains("c"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask2);
	}
	if(guess.contains("t") && guess2.contains("a"))
	{
		System.out.println("You got a letter!");
		System.out.println(gameMask1);
	}

	System.out.println("Guess a letter: ");
	Scanner input3 = new Scanner(System.in);	
	String guess3 = input.next();
	if(guess.contains("c") && guess2.contains("a") && guess3.contains("t"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
	if(guess.contains("c") && guess2.contains("t") && guess3.contains("a"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
	if(guess.contains("a") && guess2.contains("c") && guess3.contains("t"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
	if(guess.contains("a") && guess2.contains("t") && guess3.contains("c"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
	if(guess.contains("t") && guess2.contains("c") && guess3.contains("a"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
	if(guess.contains("t") && guess2.contains("a") && guess3.contains("c"))
	{
		System.out.println("You solved the word!");
		System.out.println(gameWord);
	}
}
}