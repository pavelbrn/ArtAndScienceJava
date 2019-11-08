import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*input a user string
 * make the entire string lower case
 * cut out first letter
 * copy the rest of the string
 * capitalize first letter
 * turn rest of case into lower string
 * concatenate first capitalized letter with the rest of the string.
 * 
 * 
 * */

public class Ch9_Problem3 extends ConsoleProgram {
	
	
	public void run() {
		
		setFont("Helvetica-40");
		//user inputs a word:
		word = readLine("");
		
		
		println(capitalize());

		
	}
	
	public String capitalize() {
		
		
		//capitalizes first letter:
		char firstLetterSmall = word.charAt(0);
		String firstLetterCapital = Character.toString(firstLetterSmall);
		String a=firstLetterCapital.toUpperCase();
		
		//copy the word starting at Index 1
		String copyRest = word.substring(1, word.length());
		String b = copyRest.toLowerCase();
		
		//combine capitalized letter with rest of word:
		String capitWord = a.concat(b);
		
		
		return capitWord;
	}
	
	//instance variable that the user defines with word:
	private String word;
	
}