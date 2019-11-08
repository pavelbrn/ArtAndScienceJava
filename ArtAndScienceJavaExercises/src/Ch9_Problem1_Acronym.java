import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch9_Problem1_Acronym extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
	
		
		char test= 'B';
		
		println(isEnglishConsonant(test));
		
		
		
		//Unblock to run the code:
		//String nstr = "Testing a String Acronym";

		//println(acronym(nstr));
	}
	
	public boolean isEnglishConsonant(char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'b':
		case 'c':
			case'd':
				
			return true;
			default:
				return false;
				
		}
	}
	
	
	public String acronym(String nstring) {
		String result = nstring.substring(0, 1);
		int position = nstring.indexOf(" ");
		while( position != -1) {
			result += nstring.substring(position + 1, position+2);
			position = nstring.indexOf(" ", position + 1);
		}
		
		
		//println(position);
		return result;
		
	}
	
}