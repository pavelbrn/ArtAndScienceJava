/*
 * File: AltCaps.java
 * ------------------
 * A sandcastle warmup for assgignment 4
 */

import acm.program.*;

public class AltCaps extends ConsoleProgram {

	/**
	 * Method: AltCaps
	 * ---------------
	 * Takes in an input string and returns the same string,
	 * except that the capitalization of the letters is changed
	 * to be alternating.
	 * Example usage:
	 * altCaps("aaaaa") -> "aAaAaA"
	 * altCaps("hello world") -> "hElLo WoRlD"
	 */
	
	/* My Algorithm:
	 * iterate through each letter in string
	 * check if isLetter()
	 * capitalize every second letter
	 * use counter to keep track of letter count
	 * concat each letter into new String
	 * */
	
	private String altCaps(String input) {
		String output = "";
		
		//counter keeps track of letters to be capitalized
		int counter = 0;
		
		//This loops through each letter in the string "input"
		for (int i=0; i<input.length(); i++) {
			
			char chLetter = input.charAt(i);
			counter ++;
			
			//each iteration checks 1 of 3 cases:
			if (Character.isWhitespace(chLetter)) {
				counter = counter-1;
				String temp2 =Character.toString(chLetter);
				output = output.concat(temp2);
			}
			
			else if(Character.isLetter(chLetter) && counter%2 ==0 ) {
				
				String temp = Character.toString(chLetter);
				String temp0 = temp.toUpperCase();
				output = output.concat(temp0);
				
				
			} else {
				String temp2 =Character.toString(chLetter);
				output = output.concat(temp2);
			}
			
		}
	
		
		
		
		
		return output;
	}
	
	//private boolean isLetter(char letter) {
		
//	}

	/****************************************************
	 *                  STARTER CODE                    *
	 * You can read this code, but you should not edit  *
	 * It (except to add more tests, if you so desire)  *
	 ****************************************************/

	// an instance variable which keeps track of how many tests 
	// have been run.
	private int testIndex = 0;
	
	// This run method executes a barrage of tests.
	public void run() {
		setFont("Monospaced-Bold-40");
		runTest("aaaaaa", "aAaAaA");
		runTest("bbbbbb", "bBbBbB");
		runTest("hello", "hElLo");
		runTest("hello world", "hElLo WoRlD");
		runTest("i love the beach", "i LoVe ThE bEaCh");
		runTest("----altj----", "----aLtJ----");
	}

	/**
	 * Method: Run Test
	 * ----------------
	 * Takes in an input and an expected output, and checks
	 * if the method altCap produces the correct output! Each
	 * call runs exactly one test.
	 */
	private void runTest(String input, String expectedOutput) {
		// call the altCaps method!
		String output = altCaps(input);
		
		// print out the results
		println("Test #:   " + testIndex);
		println("Input:    " + input);
		println("Output:   " + output);
		println("Expected: " + expectedOutput);
		
		// don't forget to use .equals when comparing strings
		if(expectedOutput.equals(output)) {
			println("Test passed");
		} else {
			println("Test failed");
		}
		
		// this adds a blank line so each test looks like a
		// paragraph of text
		println("");
		
		// keep track of how many tests have been run
		testIndex++;
	}





}
