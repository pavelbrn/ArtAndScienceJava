import acm.program.*;

public class Ch3_FarenheitToCelcius extends ConsoleProgram {
	
	
	public void run() {
		
	println ("This program converts Farenheit to Celcius");
	
	double farenheit = readDouble ("Enter Farenheit temperature: ");
	
	/* 5 divided by 9 will give 0.5555, but since
	 * 5 and 9 are integers Java throws away the decimals
	 * so you will be eft with 0. Solving this requires 
	 * writing double in front of 5 so that the result
	 * is converted into a floating number.
	 */
	double celcius = (double)5/9*(farenheit-32) ;
	
	
	println ("Celcius equivalent: " + celcius);
	
	
	
		
	}

}
