import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch7_Problem2 extends ConsoleProgram {
	
	private static final String SENTINEL = " ";
	
	public void run() {
		
		//declare the variables
		double total = 0;
		int count = 0;
		
		/*activates the while loop 
		 * when the user enters a value
		 * these values get added to the "total" variable
		 * 
		 * the "count++" counts the 
		 * amount of times the user
		 * has entered a number */
		while (true) {
			
			String value = readLine(" Enter score ");
			
			
			if (value.equals(SENTINEL)) break;
			
			/*"count ++" is equal to "count= count +1"
			 *I printed out the 'total' and 'value'
			 *variables in the middle of the 
			 *loop while debugging the code and 
			 *decided to leave them there.
			 **/
			
			//converts a String of numbers into Integers.
			int value2=Integer.parseInt(value);
			
			count++;
			total = value2+total;
			println("total " + total);
			
			println("value" + value);
			
			
		}
		
		total = total/count;
		
		println("The average is " + total + ".");
		
		
		println("sum " + count);
			
		
	}
	
	
	
	
}