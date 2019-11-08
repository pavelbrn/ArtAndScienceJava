import acm.program.*;

/*This program prints given digits in reverse order*/

public class Ch4_Problem7DigSum extends ConsoleProgram {

	public void run() {
		
		int n = readInt("Enter a positive number: ");
		int reverse = 0;
		
		
		/*Every number is multiplied by 10 and added
		 * on top of the previous one
		 * */
		while (n > 0) {
			 
			/*The order placement of the following
			 * variables in this loop statement is IMPORTANT!
			 * mixing the order leads to an 
			 * off by one or more error!!(OBOB)*/
			reverse = reverse*10;
			reverse = reverse + n%10;
			n = n/10;
			
			
		}
		
		println("The reverse number is: "+ reverse);
		
	}
	

	
}
