package cars;

public class Cars 
{
	
	private String make;
	private String model;
	private String year;

	/* Method signature consists of...
	 * ACCESSOR - public, private, or protected.
	 * RETURN TYPE - Any type or void for nothing.
	 * ARGUMENT LIST - parameters passed to the method. 
	 */
	
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getYear()
	{
		return year;
	}
	public void setYear(String year)
	{
		this.year = year;
	}

}
