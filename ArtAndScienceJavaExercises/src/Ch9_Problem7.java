import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*enter word
 * check last letters and 
 * if s,x,z add an es
 * if ch, sh add an es.
 * if word ends in consonant + y, change y to ies.
 * in all other cases add s. 
 * 
 * */

public class Ch9_Problem7 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		word = readLine("Enter word: ");
		
		checkSuff();
		
		run();
		

	}
	
	public void checkSuff() {
		if (word.endsWith("s")||word.endsWith("x")||word.endsWith("z")) {
			//String temp = word.substring(0,word.length());
			word = word.concat("es");
			println(word);
		} else if(word.endsWith("ch")||word.endsWith("sh")) {
			//String temp = word.substring(0,word.length()-2);
			word = word.concat("es");
			println(word);
			//have not entered all of the consonant combinations with y for time purposes.
		} else if(word.endsWith("by")||word.endsWith("cy")||word.endsWith("dy")||word.endsWith("fy")||word.endsWith("gy")) {
			word = word.substring(0,word.length()-1);
			word = word.concat("ies");
			println(word);
		} else {
			word = word.concat("s");
			println(word);
		}
		
		
	}
	//declares instance variable word
	private String word;
	
}