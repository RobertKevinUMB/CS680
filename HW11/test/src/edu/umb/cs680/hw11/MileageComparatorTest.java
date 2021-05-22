package edu.umb.cs680.hw11;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class MileageComparatorTest {

	
    LinkedList<Car> carLt = new LinkedList<Car>();

    @Test
	void testMileageComparator() {
	    Car car1 = new Car("Audi", "Q3", 2013, 33, 85000);
		Car car2 = new Car("Mercedes", "GLA", 2014, 40, 100000);
		Car car3 = new Car("Mercedes", "Sport", 2012, 30, 95000);
		carLt.add(car1);
		carLt.add(car2);
		carLt.add(car3);
		Collections.sort(carLt,new MileageComparator());
		assertEquals(car2, carLt.get(0));
		assertEquals(car1, carLt.get(1));
		assertEquals(car3, carLt.get(2));
		
	}
}
