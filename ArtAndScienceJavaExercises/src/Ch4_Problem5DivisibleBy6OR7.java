import acm.program.ConsoleProgram;

/* This program counts from 1 to 100 and checks 
 * if each number is divisible by either
 * a 6 or a 7 and prints only numbers
 * divisible by 6 OR 7, not both*/
public class Ch4_Problem5DivisibleBy6OR7 extends ConsoleProgram {

	public void run() {
		
		for (int i = 1; i <= 101; i++) {
			
			
			/*check for divisibility by 6
			 * the General rule is if a number is 
			 * divisible by a 2 or a 3 then 
			 * it is divisible by 6 */
			boolean divBySix = ((i % 2 == 0) && (i % 3 == 0));
			boolean divBySeven = i%7 == 0;
			
			
			//Numbers divided by 6 or 7
			if (divBySix != divBySeven) {
				
				
				println("numbers divisible by 6 or 7 " + i);
				
				
			
			
			} 
			
		}
		
	
		
	}
	
	
	
	
}
