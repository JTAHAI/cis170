package edu.tahai.java.week3;

public class Loops 
{
	int i = 0;
	public void createMask()
	{
		String word  = "horse";
		for(int i = 0; i < word.length(); i++)
		{
			System.out.print("*");
		}

	}
	public void whileSample()
	{
		int i = 0;
		while(keepRunning())
		{
			System.out.println("Help me, I don't know how to stop!");
			i++;
		}
	}
	
	private boolean keepRunning()
	{
		i++;
		if(i < 12)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
}
