package edu.umb.cs680.hw14;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ParetoComparatorTest {
	
	static LinkedList<Car> usedCar = new LinkedList<Car>();
    static Car car1;
    static Car car2;
    static Car car3;
    
    @BeforeAll
    public static void setUp() {
    	Car car1 = new Car("Mercedes", "GLA", 2018, 33, 85000);
		Car car2 = new Car("Audi", "Q3", 2016, 35, 100000);
		Car car3 = new Car("BMW", "X5", 2016, 35, 90000);
		usedCar.add(car1);
		usedCar.add(car2);
		usedCar.add(car3);
    }
    
	@Test
	public void PareToCompareSortingUsingComparator() {
		Comparator<Car> compare = Comparator.comparing(Car::getDominationCount);
		
		for (Car car : usedCar) {
			car.setDominationCount(usedCar);
		}
		Collections.sort(usedCar, compare);
		assertEquals(100000, usedCar.get(0).getPrice());	
		assertEquals(90000, usedCar.get(1).getPrice());
		assertEquals(85000, usedCar.get(2).getPrice());
	}
	
	@Test
	public void ParetoCompare() {

		for (Car car : usedCar) {
			car.setDominationCount(usedCar);
		}
		Collections.sort(usedCar, (Car obj1, Car obj2) -> obj2.getDominationCount() - obj1.getDominationCount());
		assertEquals(85000, usedCar.get(0).getPrice());
		assertEquals(90000, usedCar.get(1).getPrice());
		assertEquals(100000, usedCar.get(2).getPrice());	
	}
}

