package edu.umb.cs680.hw13; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class ObservableTest {

	static StockQuoteObservable s = new StockQuoteObservable();
	static DJIAQuoteObservable d = new DJIAQuoteObservable();

	@BeforeAll
	public static void setUp() {

		s.addObserver(new PiechartObserver());
		s.addObserver(new TableObserver());
		s.addObserver(new ThreeDObserver());

		d.addObserver(new PiechartObserver());
		d.addObserver(new TableObserver());
		d.addObserver(new ThreeDObserver());

	}

	@Test
	public void noOfStockQuoteObservers() {

		int expectedNumObservers = 3;
		int actualNumObservers = s.countObservers();
		assertEquals(expectedNumObservers, actualNumObservers);

	}

	@Test
	public void noOfDJIAQuotObservers() {

		int expectedNumObservers = 3;
		int actualNumObservers = s.countObservers();
		assertEquals(expectedNumObservers, actualNumObservers);

	}

	@Test
	public void chgeStockQuote() {

		s.chgeQuote("LYFT", 28.05f);
		s.chgeQuote("UBER", 32.42f);
		s.chgeQuote("LYFT", 35.06f);
		s.chgeQuote("UBER", 40.06f);
		s.chgeQuote("LYFT", 45.06f);
		s.chgeQuote("UBER", 50.06f);

		int expectedNumObservers = 3;
		int actualNumObservers = s.countObservers();
		assertEquals(expectedNumObservers, actualNumObservers);
	}

	@Test
	public void chgeDJIAQuote() {

		d.chgeQuote(18.65f);
		d.chgeQuote(20.45f);
		d.chgeQuote(32.33f);
		d.chgeQuote(28.65f);
		d.chgeQuote(30.45f);
		d.chgeQuote(42.33f);

		int expectedNumObservers = 3;
		int actualNumObservers = d.countObservers();
		assertEquals(expectedNumObservers, actualNumObservers);
	}

}
