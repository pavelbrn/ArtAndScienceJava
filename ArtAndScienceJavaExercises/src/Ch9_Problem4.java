import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch9_Problem4 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		dateString();
		
		

	}
	
	
	
	private void dateString() {
		int day=0;
		int month=0; 
		int year=0;
		day = readInt("");
		month = readInt("");
		year = readInt("");
		
		String daySt = Integer.toString(day);
		String monthSt = Integer.toString(month);
		String yearSt= Integer.toString(month);
		
		println("Date: " + daySt +"-"+ monthSt+"-" + yearSt);
		
	}
	
}