package edu.umb.cs680.hw14;
import java.util.LinkedList;



public class Car {
	private String make, model;
	private int mileage, yr;
	private float price;
	private int dominationCount;

	public Car(String make, String model, int yr, int mileage, float price) {
		this.make = make;
		this.model = model;
		this.yr = yr;
		this.mileage = mileage;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMileage() {
		return mileage;
	}

	public int getyr() {
		return yr;
	}

	public float getPrice() {
		return price;
	}
	
	public void setDominationCount(LinkedList<Car> usedCar) {
		for (Car car : usedCar) {
			if ((car.getPrice() >= this.getPrice()) && (car.getMileage() >= this.getMileage())
					&& (car.getyr() <= this.getyr())) {
				this.dominationCount = dominationCount+1;
		    }	
		}
	}

	public int getDominationCount() {
		return dominationCount;
	}
}
