package project1;

public class HelloWorld 
{
	// An object is 2 things.
	// 1. Actions. Methods.
	// 2. Attributes. Variables.
	private static String name = "Justin";
	private static String lastName = "Tahai";
	
	// main method. Starts the program.
	//Method signature - What makes this method unique. Defines the method.
	public static void main(String[] args) 
	{
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	//This method says Hello when called.
	private void sayHello()
	{
		// Prints to the console.
		System.out.println("Hello, World!");
		System.out.println("Sent from home.");
		System.out.print("Program written by ");
		System.out.print(name);
		System.out.print(" ");
		System.out.print(lastName );
	}
}
