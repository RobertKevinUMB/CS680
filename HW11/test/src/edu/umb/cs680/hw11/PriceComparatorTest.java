package edu.umb.cs680.hw11;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class PriceComparatorTest {

	LinkedList<Car> carLt = new LinkedList<Car>();

    @Test
	void testPriceComparator() {
		
	    Car car1 = new Car("BMW", "X3", 2014, 23, 80000);
		Car car2 = new Car("Mercedes", "300", 2015, 30, 105000);
		Car car3 = new Car("Mercedes", "C300", 2013, 20, 95000);
		carLt.add(car1);
		carLt.add(car2);
		carLt.add(car3);
		Collections.sort(carLt,new PriceComparator());
		assertEquals(car2, carLt.get(0));
		assertEquals(car3, carLt.get(1));
		assertEquals(car1, carLt.get(2));
		
	}
}
