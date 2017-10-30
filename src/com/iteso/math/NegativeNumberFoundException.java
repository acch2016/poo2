package com.iteso.math;

public class NegativeNumberFoundException extends Exception {

	private double negativeNumberFound;
	
	public NegativeNumberFoundException(double n) {
		super("NegativeNumberFoundException");
		this.negativeNumberFound = n;
	}
	
	public String toString() {
		return getMessage() + "\nNegative number found: " + this.negativeNumberFound;
	}
	
}
