package com.iteso.math;

public class Utils {

	public static double squareRoot(double x) throws NegativeNumberFoundException {
		if(x < 0) throw new NegativeNumberFoundException(x);
		return Math.sqrt(x);
	}
	
	public static double solve(double a, double b, double c) 
			throws NegativeNumberFoundException {
		return (-b + squareRoot(b * b - 4 * a * c)) / (2 * a);
	}
	
	public static double magnitude(double x, double y) {
		double m = 0;
		try {
			m = squareRoot(x * x + y * y);
		} catch (NegativeNumberFoundException e) {}
		return m;
	}
	
}
