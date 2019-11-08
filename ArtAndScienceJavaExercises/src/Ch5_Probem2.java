import acm.program.*;

public class Ch5_Probem2 extends ConsoleProgram{

	/*This program 
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		println("Enter coefficient for the quadratic equation:");
		
		
		//Variable "a" can not be zero, according to the problem parameters.
		
		double a = readInt("a: ");
		if (a <= 0) {
			println("a cannot be equal to zero.");
			run();
			
		}
		
		
		double b = readInt("b: ");
		double c = readInt("c: ");
		
		double pos = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)) ) / (2 * a) ;
		
		println("The first solution is " + pos);
		
		double neg = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2 * a) ;
		println("The second solution is " + neg);
		
		
		
		
	}
	
}
