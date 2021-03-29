package  edu.umb.cs680.hw01;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	public void add4and5()
	{
		Calculator cal = new Calculator();
		float actual = cal.add(4,5);
		float expected = 9;
		assertEquals(actual, expected);
	}
	
	@Test
	public void sub5By3()
	{
		Calculator cal = new Calculator();
		float actual = cal.sub(5,3);
		float expected = 2;
		assertEquals(actual, expected);
	}
	
	@Test
	public void multiply3By3()
	{
		Calculator cal = new Calculator();
		float actual = cal.mul(3,3);
		float expected = 9;
		assertEquals(actual, expected);
	}
	
	@Test
	public void multiply15fBy25f()
	{
		Calculator cal = new Calculator();
		float actual = cal.mul(1.5f,2.5f);
		float expected = 3.75f;
		assertEquals(actual, expected);
	}
	@Test
	public void divide25fBy55f()
	{
		Calculator cal = new Calculator();
		float expected = 2.2f;
		float actual = cal.div(5.5f,2.5f);
		assertEquals(actual, expected); 
	}
	
	
	@Test
	public void divide7By0()
	{
		Calculator cal = new Calculator();
		Assertions.assertThrows(IllegalArgumentException.class, () -> cal.div(7, 0));
	}
}	