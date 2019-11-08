import acm.program.*;

import acm.util.*;
import java.awt.Color;

import acm.graphics.*;


/*This program calculates the rate of decay
 * of "n" number of atoms
 *
 * */

public class Ch6_Problem4_HalfLife extends ConsoleProgram {
	
	public void run() {
		setFont("Helvetica-40");
		
		int i =0;
		int n = readInt("Enter nuber of atoms to decay ") ;
		
		println("There are " + n + " atoms initially");
		while (i<=100) {
			i++;
			int x=	n - decomp(n);
			n=x;
			pause(500);
				if (n==0) {
					
					break;
				
				}
			
			
				println("There are " + n + " atoms at the end of year "+ i);
			
		}
		
		println("There are " +n+ " atoms at the end of year " + i);
	}

	//creates a PREDICATE METHOD, this creates the 50% chance of decay
	//change the probability to change the decay rate!
	private boolean half() {
		return rgen.nextBoolean(0.5);
		
	}
	
	/*decomp method takes an initial atom value n 
	 * and calculates the probability of each atom decomposing
	 * */
	private int decomp(int n) {
		
		int i=n;
	
		while(i>0) {
			i--;
			if (half()) {
				n--;
				
			} 
			
		}
		
		return n;
	}
	
	//creates rgen object from the RandomGenerator class
	RandomGenerator rgen = new RandomGenerator();
	
	
	
	
}