import acm.program.*;

public class Ch5_Probem6 extends ConsoleProgram{

	/*This program uses a method to sum up
	 * the digits of a given integer.
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		int n= readInt("Enter the number: ");
		int x = 0;
		
		//println calls nDigits and prints back the result.
		println("The sum is: " + nDigits(n));
		run();
		
		
	}
	
	
	private int nDigits(int n) {
		
		int sum = 0; 
		while (n>0) {
			
			sum= sum + n%10;
			
			n= n/10;
			
		}
		
		//n= sum;
		
		//returns n back into the method
		return sum;
		
	}
	
}
