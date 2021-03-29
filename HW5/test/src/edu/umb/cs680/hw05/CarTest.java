package edu.umb.cs680.hw05;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.Test;

public class CarTest {	
	private String[] CarToStringArray(Car c){
		String[] carInfo = 
			{ 
				c.getMaking(), c.getModel(), Integer.toString(c.getYr()) 
			};
		return carInfo;
	}	
	
	
	@Test
	public void CarEqualWithMakeModelYr() {
		String[] expected = {"honda", "accord", "2021"};
		Car actual = new Car("honda", "accord", 2020);
		assertArrayEquals(expected, CarToStringArray(actual));
	}
	
	@Test
	public void CarEqualWithMakeModelYr_NotEqual() {
		String[] expected = {"Ford", "mustang", "2021"};
		Car actual = new Car("Toyota", "prius", 2020);
		assertNotEquals(expected, CarToStringArray(actual));
	}	
}
		
