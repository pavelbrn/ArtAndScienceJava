import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * enter a word
 * check each letter and compare it to parameter s
 * if s is found print index of s 
 * break
 * if s is not found print -1
 * break
 * 
 * 
 * */

public class Ch9_Problem6 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		word = readLine("Enter word: ");
		
		//look for index of letter s
		myIndexOf("s");
		
		
		//compares indexOf to myIndexOf for testing purposes:
		int g = word.indexOf("s");
		println(g);
		
	}
	
	private void myIndexOf(String s) {
		//IVAR set to 0:
		i =0;
		
		//check each letter and compare it to String s
		while(i<=word.length()) {
			i++;
			if(i== word.length()) {
				
				i=-1;
				println(i);
				break;
			}
			String check = word.substring(i, i+1);
			if(check.equals(s)) {
				
				println(i);
				break;
				
			} 
		}
		
	}
	
	private String word;
	private int i;
}