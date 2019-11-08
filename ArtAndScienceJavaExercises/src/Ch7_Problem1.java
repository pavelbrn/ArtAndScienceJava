import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch7_Problem1 extends ConsoleProgram {
	
	public static final String STOP = "0";
	
	
	public void run() {
		println("This program converts hexadecimal to decimal.");
		
		this.setFont("Helvetica-30");
		
		String n= readLine("Enter hex: ");
		
		
		while(true) {
			if (n.equals(STOP)) {
				break;
			}
			convertHexToDecimal(n);
			
			n = readLine("Enter hex: ");
			
		}
		
	}
		
	
private void convertHexToDecimal(String n) {
	
	
	//Integer nAsInteger = new Integer(n);
	
	println(n+" hex = " + Integer.parseInt(n,16) + " decimal");
}
	
	
}