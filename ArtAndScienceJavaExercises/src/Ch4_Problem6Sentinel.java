import acm.program.*;

/*This program calculates the average of student exam scores*/

public class Ch4_Problem6Sentinel extends ConsoleProgram{

	// Specifies value of Sentinel
			private static final int SENTINEL = -1;
	
	
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
					
					double value = readInt(" Enter score ");
					
					
					if (value == SENTINEL) break;
					
					/*"count ++" is equal to "count= count +1"
					 *I printed out the 'total' and 'value'
					 *variables in the middle of the 
					 *loop while debugging the code and 
					 *decided to leave them there.
					 **/
					count++;
					total = value+total;
					println("total " + total);
					
					println("value" + value);
					
					
				}
				
				total = total/count;
				
				println("The average is " + total + ".");
				
				
				println("sum " + count);
					
				
				
			}
	
}
