package edu.umb.cs680.hw13;
import java.util.Observable;

public class DJIAQuoteObservable extends Observable{
	private float quote;
	
	public void chgeQuote(float q) {
        quote = q;
        setChanged();
        notifyObservers(new DJIAEvent(quote));
    }

}
