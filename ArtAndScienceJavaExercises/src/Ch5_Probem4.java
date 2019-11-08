import acm.program.*;

public class Ch5_Probem4 extends ConsoleProgram{

	/*This program take two integers n and k and returns 
	 *n^k.
	 * 
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		/* INITIAL PROGRAM:
		 * double n = readInt("Enter number: ");
		double k = readInt("Enter exponent: ");
		
		
		double answer = raiseIntToPower(n, k);
		
		println("The answer is: " + answer); 
		
		*/
		
		println("This subprogram prints out the values of 2 to the power of 0 to 10 ");
		
		for (int i=0; i<=10; i++) {
			
			double answer = raiseIntToPower(2, i);
			println(""+answer);
			
			
		}
		
		
	}
	
	
	
	
	
	 private double raiseIntToPower(double n, double k) {
		
	 n = Math.pow(n, k);
		
		return n;
		
		
		
		
	} 
	
	
}
