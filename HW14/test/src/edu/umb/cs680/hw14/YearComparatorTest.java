package edu.umb.cs680.hw14;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class YearComparatorTest {

	static LinkedList<Car> usedCar = new LinkedList<Car>();
    static Car car1;
    static Car car2;
    static Car car3;
    
    @BeforeAll
    public static void setUp() {
 	   car1 = new Car("Audi", "Q3", 2013, 33, 85000);
 	   car2 = new Car("Mercedes", "GLA", 2014, 40, 100000);
   	   car3 = new Car("Mercedes", "Sport", 2012, 30, 95000);   		
   	   usedCar.add(car1);
   	   usedCar.add(car2);
   	   usedCar.add(car3);
    }
    
    @Test
    public void yearSortingWithComparatorComparing() {
		Comparator<Car> compare = Comparator.comparing(Car::getYear);
		Collections.sort(usedCar, compare);
		assertEquals(car3, usedCar.get(0));
		assertEquals(car1, usedCar.get(1));
		assertEquals(car2, usedCar.get(2));
			
	}
	
	@Test
	void yearSorting() {
		
		Collections.sort(usedCar, (Car obj1, Car obj2) ->  (obj1.getYear() - obj2.getYear()));
		assertEquals(car3, usedCar.get(0));
		assertEquals(car1, usedCar.get(1));
		assertEquals(car2, usedCar.get(2));
		
	}

}
