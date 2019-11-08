import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch6_Problem1 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		println("This program display a randomly chosen card");
		//String answer = readLine("Generate random card? y/n: ");
		
		
		int i = 1;
		while(i>0){
			i++;
			String answer = readLine("Generate random card? y/n/exit: ");
			if (answer.equals("exit")) {
				println("The program has ended.");
				break;
				
				
			}
			
			genCard(answer);
		
		}
		
		
		
		/*String answer = readLine("Generate random card? y/n: ");
		
		if (answer.equals("y")) {
			println( getRank()+ " of " + getSuit());
		} else if (answer.equals("n")) {
			println("Thank you for playing.");
			run();
			
		} else {
			println("Invald Answer. Generate random card? y/n: ");
			run();
		}
		
		run(); */
		
		
	}
	
private String getRank() {
	int rank = rgen.nextInt(1,13);
	switch (rank) {
	case 1: return "Ace";
	case 11: return "Jack";
	case 12: return "Queen";
	case 13: return "King";
	
	//Converts the int to STRING!
	default: return ("" +  rank);
	
	}
}

private String getSuit() {
	int suit = rgen.nextInt(1,4);
	switch (suit) {
	case 1: return "Clubs";
	case 2: return "Diamonds";
	case 3: return "Hearts";
	case 4: return "Spades";
	default: return ("");
	
	}
}

private String genCard(String answer) {
	//answer = readLine("Generate random card? y/n: ");
	if (answer.equals("y")) {
		println( getRank()+ " of " + getSuit());
		
	} else if (answer.equals("n")) {
		println("Thank you for playing.");
		
		
	} else {
		println("Invald Answer. Generate random card? y/n: ");
		
		
	}
	return answer;
	
}
	
private RandomGenerator rgen = new RandomGenerator();

	
}