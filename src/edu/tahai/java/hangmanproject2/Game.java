package edu.tahai.java.hangmanproject2;

public class Game 
{

	private String hint;
	private String word;
	private String guesses = "";

	// Arg Constructor
	public Game()
	{
		this.hint = hint;
		this.word = word;
	}

	
	public String getHint() 
	{
		return hint;
	}
	public void setHint(String hint) 
	{
		this.hint = hint;
	}
	public String getWord() 
	{
		return word;
	}
	public void setWord(String word) 
	{
		this.word = word;
	}
	public String getGuesses() 
	{
		return guesses;
	}
	public void setGuesses(String guesses) 
	{
		this.guesses += guesses;
	}
	
	public boolean isSolved()
	{
		// Do smart things to determine if solved
		return generateMask().equals(word);
	}
	
	public String generateMask()
	{
		String mask = "";
		
		// Loop over word
		for(int i = 0; i < word.length(); i ++)
		{
			// Look at each character in word
		String currentChar = String.valueOf(word.charAt(i));

				
			// Determine if user guessed that char.
			if(guesses.contains(currentChar))
			{
			//  If they did, append the char.
				mask += currentChar;
			}
			else 
			{
			// If they did not, append a *.
				mask += "*";
			}
			

		}
		return mask;
	}
}
