import acm.program.*;

public class Ch5_Probem11 extends ConsoleProgram{

	/*This program checks if a given numer
	 * is a perfect number.
	 * 
	 * Algorithm:
	*divisors of n 
	 *must equal to the sum of n.
	 *
	 *1-calculate diviros
	 *2-ad diviros togeather
	 *3-if equal to n
	 *4-then true
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		int n = readInt("Enter number:" );
		
		if (isPerfect(n)) println("This is a perfect number");
		else println("NOT a perfect number");
		
		
		
		run();
		

	}
	
	private boolean isPerfect(int n) {
		
			int sum = 0;
			for (int i = 2; i<=n ; i++ ) {
			
			if (n%i == 0) {
				int x= n/i;
				sum = sum + x;
				
				//println(""+x);
			}
			
			if (n==sum) return true;
			//println("Sum:" + sum);
			
			
		} 
		return false;
		
		
		

	}
	}
	

