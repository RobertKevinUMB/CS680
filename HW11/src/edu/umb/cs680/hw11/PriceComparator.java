package edu.umb.cs680.hw11;
import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

	public int compare(Car carOne, Car carTwo) {
		return  (int) (carTwo.getPrice() -  carOne.getPrice());
	}

}