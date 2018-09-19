package cars;

public class CarsApp 
{
	public static void main(String[] args)
	{
		Cars c1 = new Cars();
		c1.setMake("Ford");
		c1.setModel("Taurus");
		c1.setYear("1995");
		
		Cars c2 = new Cars();
		c2.setMake("Volkswagen");
		c2.setModel("Jetta");
		c2.setYear("1999");
		
		Cars c3 = new Cars();
		c3.setMake("Jeep");
		c3.setModel("Grand Cherokee");
		c3.setYear("2007");
		
		Cars c4 = new Cars();
		c4.setMake("Volkswagen");
		c4.setModel("Jetta");
		c4.setYear("2004");
		
		Cars c5 = new Cars();
		c5.setMake("Dodge");
		c5.setModel("Ram");
		c5.setYear("2018");	

		//create array
		Cars[] carsArr = {c1, c2, c3, c4, c5};
		
		// for loop
		for(int x = 0; x < carsArr.length; x++)
		{
			
			System.out.println(carsArr[x].getMake());
			System.out.println(carsArr[x].getModel());
			System.out.println(carsArr[x].getYear());
			System.out.println();


		}
	}
}