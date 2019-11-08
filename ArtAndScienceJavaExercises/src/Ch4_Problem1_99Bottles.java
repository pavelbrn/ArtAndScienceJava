/*This program counts the amount of bottles on the wall
 * It starts at 99 and ends at 0 */

import acm.program.*;

public class Ch4_Problem1_99Bottles extends ConsoleProgram {

	//Declares the amount of bottles on the wall
	private static final int BOTTLES99 = 99 ;
	
	
	public void run() {
		
		
		for (int b = BOTTLES99; b >= 0; b-- ) {
			println(b);
			
		}
	
		println("There are no more bottles on the wall! You take one down, you pass it around and you go out and get more bottles of beer for the wall"); 
		
		
	}
	
	
	
}
