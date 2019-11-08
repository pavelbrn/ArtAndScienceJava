import acm.program.*;

public class Ch5_Probem5 extends ConsoleProgram{

	/*This program calculates x to the power of k
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		//Defines the initial variables x and k as entered by the user.
		double x = readDouble("Enter x: ");
		
		double k =  readInt("Enter k: ");
		
		
		
		double answer =  raiseRealToPower(x,k);
		
		println("Answer is: "+ answer);
		
		run();
		
		
		
		
	}
	
	private double raiseRealToPower(double x, double k) {
		
		x = Math.pow( x, -k);
		
		return x;
		
		
		
	}
	
}
