import acm.program.*;

/*This program calculates the sum of all
 * positive, odd integers of N given integers
 * */

public class Ch4_Problem3_SumOdd extends ConsoleProgram{

	
	/* The formula for the SUM of the first odd integers
	 *  of a given N integer is N²*/
	
	public void run() {
		
	
	int x = readInt("Enter number N: ");
	
	if (x < 0) {
		println ("Nice try, we do not accept negatives");
		run();
		
	} else {
		
		int answer = x*x;
		println ("The summ of all odd numbers up to the number " + x + " is: " + answer );
		run();
		
		
	}
		
	}
}
