import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*Heads = 1 
 *Tails = 0
 * 
 * when you iterate 3 heads then 
 * the program ends.
 * 
 * */

public class Ch6_Problem2HeadsTails extends ConsoleProgram {
	
	//using the keyword final will result in this
	//static variable to be PERMANENT!
	private static int NUMBER_OF_HEADS = 4;
	
	public void run() {
		setFont("Helvetica-40");
		
		//initializes the variable called heads.
		int heads = 0;
		
		//initializes i, which counts.
		int i = 0;
		while(true) {
			i++;
			
			String headsTails =	ht.nextBoolean(0.5) ? "Heads" : "Tails";
			
				
		
			if (headsTails.equals("Heads")) {
			heads ++;
			println(headsTails);
			
			} else {
			heads = 0;
			println("Tails");
			}
		
			if (heads ==NUMBER_OF_HEADS) {
				println("It took " + i + " turns to get " + NUMBER_OF_HEADS + " heads in a row");
				break;
				
				
			}
		
		
		}
		
		//Once the program is done, you can change 
		//the number of heads in a row
		String ask = readLine("Change number of heads? y/n? ");
		if (ask.equals("y")) {
			int changeNumberOfHeads = readInt("Enter no. Heads:");
			NUMBER_OF_HEADS = changeNumberOfHeads;
			
			run();
			
			
		} else {
			println("Thank you for playing");
		}
		
	
		
	
		
		
	
		
		
		
	}
		
	
	//declaring a new Object from theRandomGenerator class:
	RandomGenerator ht = new RandomGenerator();
	
	
}