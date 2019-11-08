import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/* enter sentence
 * enter number of times to shift letters
 * read each letter
 * convert letter to character
 * shift x amount of times
 * negative shift value should shift letter to beginning of alphabet.
 * print coded message
 * 
 * */

public class Ch9_Problem10 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		sentence = readLine("Enter message: ");
		cypherShift = readInt("Enter number of positions to shift: ");
		
		shift();
		run();
	}

	public void shift() {
		
		int i=0;
		String cypher = "";
		while(i<sentence.length()) {
			
			
			char letter = sentence.charAt(i);
			int temp = letter + cypherShift;
			if (temp>='Z'||cypherShift<0) {
				temp = letter-cypherShift;
				char shift2 = (char)temp;
				String converted = Character.toString(shift2);
				cypher = cypher.concat(converted);
				i++;
			}
			
			else {
				//temp = letter+cypherShift;
				
				char shift2 = (char)temp;
				
				String converted = Character.toString(shift2);
				cypher = cypher.concat(converted);
				
				i++;
			}
			
			
		} println(cypher);
		
	}
	
	private String sentence;
	private int cypherShift;
	
}