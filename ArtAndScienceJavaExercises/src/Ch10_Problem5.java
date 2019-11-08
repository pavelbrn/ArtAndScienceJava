import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*declare array with characters:
 * 
 *user enters string
 *
 *method iterates string
 *this methd turns each character/word into morse code
 *morse code is then printed line by line seperated by spaces
 *
 * program not finished:input rest of morse code in string to translate fully
 * 
 * */


/*char letter= 'Z';

int index = letter - 'A';

println(index);
*/
public class Ch10_Problem5 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		sentence = readLine("Enter sentence: ");
		
		convertToMorse();
		
		
	}
	
	public void convertToMorse(){
		sentence = sentence.toLowerCase();
		
		
		int toIndex=0;
		String convert="";
		
		
		for (int i=0; i<=sentence.length()-1;i++) {
			
			char temp= sentence.charAt(i);
			
			if(!Character.isWhitespace(temp)) {
				
				//converts a char letter into an index number that can be used in an array
				//this then retreives the corresponding symbols
				toIndex = temp-'a';		
				convert = convert.concat(morseCode[toIndex]);	
			} 
			
		}
		println(convert);
		
		
}
	
	
	
	
	
	private String sentence;
	//							  A     B       C                            
	private String[] morseCode= {"a*","b*","c*",};

}