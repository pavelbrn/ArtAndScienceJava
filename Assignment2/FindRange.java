/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	
	public void run() {
		setFont("Helvetica-40");
		/* while loop
		 * compares number to largest number
		 * saves whichever one is larger
		 * 
		 * compares number to smalles number
		 * saves whichever one is smaller */
		
		println("This program finds the larges and smalles numbers");
		
		double max= 0;
		double min = 0;
		
		double x = 0;
		double y= 0;
		
		
		
		while (x>=0) {
			
			x++;
			y=readDouble("Enter Number:" );
			/*This part initializes the first value of of the min variabe
			 * so that it will no longer be zero and every
			 * subsequent value will be compared to this one.*/
			if (x==1) {
				min = y;
			}
			
			
			/*This part excludes the value 0 from the 
			 * min variable! This means it will not be counted when 
			 * the sentinel value of 0 gets entered*/
			if (y!=0) {
			min = smallest(y,min);
			} 
			
				
			max = largest(y,max);
			
			if (y == SENTINEL) {
					if (max==0 &&min==0) {
						println("Please enter the first value that is not 0");
						run();
					} else {
					
					println("The largest number was: "+ max);
					println("The smallest number was: " + min);
					run();
					}
			} 
			
		}
			
			
			
			
			
			
			
				
			
			
			
			
		
		}
		
	
	
	private double largest(double n,double z) {
		double mx = Math.max(n, z);
		return mx;
	}

	private double smallest(double n, double z) {
		
			double minim = Math.min(n,z);
			
			return minim;
	
	
	} 
	
	

}

