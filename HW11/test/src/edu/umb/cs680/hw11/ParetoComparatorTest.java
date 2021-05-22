package edu.umb.cs680.hw11;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class ParetoComparatorTest {
	
	 LinkedList<Car> usedCar = new LinkedList<Car>();

	@Test
	public void testParetoCompare1() {
		Car car1 = new Car("Mercedes", "GLA", 2018, 33, 85000);
		Car car2 = new Car("Audi", "Q3", 2016, 35, 100000);
		Car car3 = new Car("BMW", "X5", 2016, 35, 90000);
		usedCar.add(car1);
		usedCar.add(car2);
		usedCar.add(car3);
		for (Car car : usedCar) {
			car.setDominationCount(usedCar);
		}
		Collections.sort(usedCar, new ParetoComparator());
		assertEquals(85000, usedCar.get(0).getPrice());
		assertEquals(90000, usedCar.get(1).getPrice());
		assertEquals(100000, usedCar.get(2).getPrice());
		
	}
}
