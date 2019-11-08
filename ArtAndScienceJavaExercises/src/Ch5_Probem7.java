import acm.program.*;

public class Ch5_Probem7 extends ConsoleProgram{

	/*This program identifies numbers
	 * that are perfect squares.
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		int numb = readInt("Enter number: ");
		
		double x= Math.sqrt(numb);
		
		println(""+ x);
		
		if (isPerfectSquare(x)) {
			println("This number is a perfect square");
			
		}
		
		run();
		
		
	}
	/*this method takes the result of a square root
	 * takes the remainder 1, if this equals to zero then
	 * this predicate method is true. 
	 * */
	private boolean isPerfectSquare(double n) {
		return (n%1 ==0);
		
	}
}
