package edu.umb.cs680.hw05;

public class Car {
	private String model, making;
	private int mileage, yr;
	private float price;
	
public Car(String making, String model, int yr, int mileage, float price)
	{
		this.yr = yr;
		this.model = model;
		this.making = making;
		this.mileage = mileage;
		this.price = price;
	}

	public Car(String making, String model, int yr) {
		this.yr = yr;
		this.model = model;
		this.making = making;

}

	public String getModel()
	{
		return this.model;
	}
	public String getMaking()
	{
		return this.making;
	}	

	public int getYr()
	{
		return this.yr;
	}
	public int getMileage()
	{
		return this.mileage;
	}

	
}
	

