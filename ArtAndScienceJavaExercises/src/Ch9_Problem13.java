import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/* check if letter
 * compare first and last letter
 * move to next comparison:
 * compare index +1 with word.length()-1
 * if both indexes equal each other break.
 * 
 * gather letters from front to last
 * gather letters from last for first
 * compare two strings
 * if equal print "Palindrome"
 * if not equal print "not palindrome"
 * 
 * */

public class Ch9_Problem13 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");

		palindrome = readLine("Enter sentence: ");
		
		//Converts sentence to lower case letters:
		palindrome = palindrome.toLowerCase();
		
		checkForeward();
		checkBackwards();
		isSentencePalindrome();
		run();
	}
	
	//Compares both strings and checks if its a palindrome
	private void isSentencePalindrome() {
		
		
		
		
		if (forwardSentence.equals(backwardSentence)) {
			println("This is a palindrome");
		} else {
			println("This is not a palindrome");
		}
	}
	
	//gathers all the letters of the string from first to last
	public void checkForeward() {
		
		int i=0;
		String foreward= "";
		while(i<palindrome.length()) {
			
			char checkforwardSentenceetter = palindrome.charAt(i);
			if(Character.isLetter(checkforwardSentenceetter)) {
				forwardSentence = Character.toString(checkforwardSentenceetter);
				foreward= foreward.concat(forwardSentence);
			} 
			
			i++;
			
		}
		forwardSentence=foreward;
		
		

		
	}
	
	//gathers all the letters in string from last to first
	public void checkBackwards() {
		int i = palindrome.length();
		
		String backward = "";
		while (i>0) {
			
			char checkbackwardSentenceetter =palindrome.charAt(i-1);
			if (Character.isLetter(checkbackwardSentenceetter)) {
				backwardSentence=Character.toString(checkbackwardSentenceetter);
				backward=backward.concat(backwardSentence);
			}
			i--;
		}
		backwardSentence=backward;
		
		
	}
	
	//Instance variables
	private String palindrome;
	private String forwardSentence;
	private String backwardSentence;
	
}