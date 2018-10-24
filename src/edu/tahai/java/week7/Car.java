package edu.tahai.java.week7;

public class Car 
{
	// define attributes of cars
private int topSpeed;
private int mpg;
private double accelFactor;
private int fuelTankCap;

// car constructor
public Car(int topSpeed, int mpg, int fuelTankCap)
{
	this.topSpeed = topSpeed;
	this.mpg = mpg;
	this.fuelTankCap = fuelTankCap;
	
}

// getters and setters
public int getTopSpeed() {
	return topSpeed;
}
public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}
public double getMpg() {
	return mpg;
}
public void setMpg(int mpg) {
	this.mpg = mpg;
}
public int getFuelTankCap() {
	return fuelTankCap;
}
public void setFuelTankCap(int fuelTankCap) {
	this.fuelTankCap = fuelTankCap;
}

// get miles till next pit stop
public int getMilesTillNextPitStop(int distanceTraveled)
{


	

	
	// fuel used = distance / mpg
	
	int fuelUsed = (distanceTraveled / mpg);
	
	// fuelTankCap - (distanceTraveled / mpg) = gallonsTillEmpty
	int gallonsTillEmpty = (fuelTankCap - fuelUsed);
	
	// solve for two test cases
	// test if fuel left


	
	return gallonsTillEmpty;


}

public static void main(String[] args)
{
	// Text case 1: Test miles left in car

	int n = 9;
	Car car1 = new Car(100, 20, 10);
	if(car1.getMilesTillNextPitStop(20) == n)	
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("test fail");
	}
	
	// define a second test case
	int n2 = 8;
	Car car2 = new Car(100, 25, 10);
	if(car2.getMilesTillNextPitStop(50) == n2)	
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("test fail");
	}
}
}
