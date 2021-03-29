package edu.umb.cs680.hw03;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeGenerator {
	protected long from, to;
	protected LinkedList<Long> primenum = new LinkedList<Long>();

	public PrimeGenerator(long from, long to) {
		if (from >= 1 && to > from) {
			this.from = from;
			this.to = to;
		} else if (from < 1 || to < 1) {
			throw new IllegalArgumentException("Negative prime num not possible");
		} else {
			throw new RuntimeException("Error: from=" + from + " to=" + to);
		}
	}

	public LinkedList<Long> getPrimenum() {
		return primenum;
	};

	protected boolean isEven(long a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	protected boolean isPrimenum(long n) {

		if (n <= 1) {
			return false;
		}

		if (n > 2 && isEven(n)) {
			return false;
		}
		long i;

		for (i = (long) Math.sqrt(n); n % i != 0 && i >= 1; i--) {
		}

		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

	public void generatePrimenum() {
		for (long n = from; n <= to; n++) {
			if (isPrimenum(n)) {
				primenum.add(n);
			}
		}
	}

	public static void main(String[] args) {
		PrimeGenerator gen = new PrimeGenerator(1, 100);
		gen.generatePrimenum();
		LinkedList<Long> primenum = gen.getPrimenum();
		Iterator<Long> it = primenum.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println("\n" + gen.getPrimenum().size() + " prime num are found.");
	}
}
