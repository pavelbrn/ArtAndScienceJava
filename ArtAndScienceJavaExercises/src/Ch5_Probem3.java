import acm.program.*;

public class Ch5_Probem3 extends ConsoleProgram{

	/*This program calculates the n'th fibonacci number 
	 * 
	 * In this example we use Binets Fibonacci Formula.
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		double x= readInt("Enter the n'th fibonnaci number: ");
		
		//this decleration TRUNCATES the double that is created by the fibonacci method
		int answer = (int) fibonacci(x);
		
		
		println("The Answer is: "+ answer);
		
		run();
		
		
		
	}
	
	private double fibonacci(double n) {
		
		//First calculate the golden ratio:
		double goldenRatio = (1 + Math.sqrt(5))/2 ;
		
		/* Second, plug the golden ration into Binets Formula 
		 * and then return the value.
		 * */
		return (Math.pow(goldenRatio, n) - Math.pow(0 - goldenRatio, 0 -n)) / Math.sqrt(5) ;
		
		
		
	}
	
	
	
}
