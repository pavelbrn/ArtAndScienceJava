/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/*This program uses the Pythagorean theorem
		 * to calculate the side c of a triangle*/
		setFont("Helvetica-40");
		
		println("Enter values to compute the Pythagoren theorem");
		
		double a= readDouble("a: ");
		double b= readDouble("b: ");
		double c= 0;
		
		c= pyth(a,b,c);
		
		println("c = "+c);
		
		
		
	}
	/*Declares the medthod pyth, this calculates
	 *the side c of a triangle using the Pythagorean Theorem*/
	
	private double pyth(double a, double b, double c) {
		
		c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		return c;
		
		
	}
	
}
