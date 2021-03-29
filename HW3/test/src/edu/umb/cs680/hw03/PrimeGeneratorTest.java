package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void twentytothirty() {
		PrimeGenerator gen = new PrimeGenerator(20, 30);
		gen.generatePrimenum();
		Long[] expectedPrimenum = { 23L, 29L };
		assertArrayEquals(expectedPrimenum, gen.getPrimenum().toArray());
	}

	@Test
	public void minustoplus() {

		try {
			PrimeGenerator gen = new PrimeGenerator(-20, 20);

		} catch (Exception ex) {
			assertEquals("Negative prime number not possible", ex.getMessage());

		}
	}

	@Test
	public void onetoten() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		gen.generatePrimenum();
		Long[] expectedPrimenum = { 2L, 3L, 5L, 7L };
		assertArrayEquals(expectedPrimenum, gen.getPrimenum().toArray());
	}

}
