import acm.program.*;

/* This program counts from 1 to 100 and checks 
 * if each number is divisible by either
 * a 6 or a 7*/
public class Ch4_Problem4Divisibleby6 extends ConsoleProgram {

	public void run() {
		
		for (int i = 1; i <= 101; i++) {
			
			
			/*check for divisibility by 6
			 * the General rule is if a number is 
			 * divisible by a 2 or a 3 then 
			 * it is divisible by 6 */
			boolean divBySix = ((i % 2 == 0) && (i % 3 == 0));
			
			
			
			if (divBySix) {
				
				println("numbers divisible by 6 " + i);
				
				
			
			
			} 
			
		}
		
		println("");
		
		//Print number if its divisible by 7.
		for (int i = 1; i <= 101; i++) {
			
			boolean divBySeven = i%7 == 0;
			
			if (divBySeven) {
				println("numbers divisible by 7 " + i);
			}
		}
		
	}
	
	
	
	
}
