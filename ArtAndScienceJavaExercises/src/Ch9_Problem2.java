import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*generate word length
 *generate random letters
 *concatenate the random letters into word length.
 * 
 * 
 * */

public class Ch9_Problem2 extends ConsoleProgram {
	
	private static final int MIN_LETTERS = 2;
	
	private static final int MAX_LETTERS = 10;
	
	public void run() {
		setFont("Helvetica-40");
		
		println(makeWord());
		
		
		
		
	}
	
	//makes the final word:
	private String makeWord() {
		
		int length = wordLength(1);
		String word= "";
		int i = 0;
		println("Length of 'word': "+length);
		while(i<length) {
			i++;
			word = word.concat(randomLetter());
			
		}
		return word;
	}
	
	//method to define the length of the word:
	private int wordLength(int length) {
		length = 0;
		length = rgen.nextInt(MIN_LETTERS,MAX_LETTERS);
		return length;
	}
	
	//generates a random letter
	private String randomLetter() {
		char ch;
		//this is called a type cast, it changes the types it precedes.
		ch =(char) rgen.nextInt((int) 'A', (int) 'Z');
		//converts a char into String.
		String a = Character.toString(ch);
		return a;
	}
	
	RandomGenerator rgen = new RandomGenerator();
	RandomGenerator genLenth = new RandomGenerator();
	//public String randomWord(String str) {
		
	//}
	
}