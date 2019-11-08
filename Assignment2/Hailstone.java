/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import java.awt.Color;

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	/* Algorithm:
	 * if n is even: divide by 2
	 * if n is odd, x= 3*n+1 
	 * n=x
	 * repeat for x
	 * if x== 0 println("Job is done")
	 * */
	
	public void run() {
		setFont("Helvetica-40");
		
		int n= readInt("Enter number please:");
		
		hof(n);
		run();
		
		
		
	}
	
	private int hof(int n) {
		
		int i= 0;
		while(n>1) {
			i++;
		if (n%2==0) {
			int n2=n/2; 
			println(n+" is even so I take half = " +n2); 
			n=n2;
			
			//return n;
		} else {
			int n2= 3*n + 1;
			println(n+ " is odd so I make 3n + 1 =" + n2);
			n=n2;
			//return n;
		}
		
		
		
		
		}
		println("this process took "+i+" steps to reach "+n);
		return n;
		
		
		
	} //return n;
}

