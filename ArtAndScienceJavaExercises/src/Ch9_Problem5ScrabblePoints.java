import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/* assign points to letters
 * 
 * user enters word
 * store word in instance variable
 * read each letter in word
 * store points in points instance variable
 * print points
 * 
 * */

public class Ch9_Problem5ScrabblePoints extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		enterWord();
		readWord();
		letterPoints();
		
		println(points);
		points=0;
		run();
		

	}
	
	private void enterWord() {
		word = readLine("Enter word: ");
		word = word.toLowerCase();
	}
	//Assign points to letters:
	private int letterPoints() {
		int locPoints =0;
		if (letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("l")||letter.equals("n")||letter.equals("o")||letter.equals("r")||letter.equals("s")||letter.equals("t")||letter.equals("u")) {
			locPoints = 1;
			return locPoints;
			
			
		} else if(letter.equals("d")||letter.equals("g")){
			locPoints =2;
		} else if(letter.equals("b")||letter.equals("c")||letter.equals("m")||letter.equals("p")){
			locPoints =3;
		} else if(letter.equals("f")||letter.equals("h")||letter.equals("v")||letter.equals("w")||letter.equals("y")){
			locPoints = 4;
		} else if (letter.equals("k")){
			locPoints=5;
		} else if(letter.equals("j")||letter.equals("x")){
			locPoints=8;
		} else {
			locPoints =10;
			
		}return locPoints;
		
		
	}
	

	//read each letter in word:
	private void readWord() {
		
		//int i2 = 1;
		int i=0;
		while(i<word.length()) {
			
			letter = word.substring(i, i+1);
			points= points+ letterPoints();
			i++;
		}
		
	}
	
	private String letter;
	private String word;
	private int points;
}