import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/* enter number
 * convert number to string
 * num ending in 1: place suffix st
 * num ending in 2: place suff nd
 * num ending in 3: place suff rd
 * num ending in greater than 3: place suff th
 * 
 * */

public class Ch9_Problem9 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		num = readInt("Enter number: ");
		ordinalForm(num);
		run();
	}
	
	public void ordinalForm(int n) {
		
		//convert the users integer into a string:
		String stringNum = Integer.toString(num);
		
		if (stringNum.endsWith("1")) {
			stringNum = stringNum.concat("st");
			println(stringNum);
		} else if (stringNum.endsWith("2")) {
			stringNum = stringNum.concat("nd");
			println(stringNum);
		} else if (stringNum.endsWith("3")) {
			stringNum = stringNum.concat("rd");
			println(stringNum);
		}else {
			stringNum = stringNum.concat("th");
			println(stringNum);
		}
		
	}
	
	private int num;
}