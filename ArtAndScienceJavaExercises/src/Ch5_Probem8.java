import acm.program.*;

public class Ch5_Probem8 extends ConsoleProgram{

	/*This program uses a predicate method
	 *with a string answer from the user in the form
	 *of "yes" and "no".
	 * 
	 * */

	public void run() {
		
		setFont("Helvetica-40");
		
		String answer = readLine("Would you like instructions? ");
		
		if (answer.equals ("yes")) {
			println("Instructions will follow");
			
		} else if (answer.equals("no")) {
			println("No instructions needed");
			
		} else {
			println("Invalid answer");
			
		}
		
		
		run();
		
		
	}
	
	
	
}
