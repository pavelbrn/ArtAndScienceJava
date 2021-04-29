import acm.program.*;

import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Card extends ConsoleProgram {
	
	public static final String CLUBS = "Clubs";
	public static final String HEARTS = "Hearts";
	public static final String SPADE = "Spades";
	public static final String DIAMONDS = "Diamonds";
	
	public static final String ACE = "Ace";
	public static final String JACK = "Jack";
	public static final String QUEEN = "Queen";
	public static final String KING = "King";
	
	
	//public static final int ACE = 1;
	
	
	//Constructor with two parameters
	//Parameters are fed by two IVARS suitName and rankName:
	public Card(int rank, int suits) {
		suitName = suits;
		rankName= rank;
		
	}
	
	//Accessor method: returns a random suit into suitName IVAR
	public String getSuit() {
		suitName = rgen.nextInt(1,4);
		switch (suitName) {
		case 1: return HEARTS;
		case 2: return CLUBS;
		case 3: return SPADE;
		case 4: return DIAMONDS;
		default: return "";
		
		}
	}
	//Accessor method: returns a random rank into rankName IVAR
	public String getRank() {
		rankName = rgen.nextInt(1,13);
		switch(rankName) {
		case 1: return ACE;
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return " 5 ";
		case 6: return " 6 ";
		case 7: return " 7 ";
		case 8: return " 8 ";
		case 9: return " 9 ";
		case 10: return " 10 ";
		case 11: return JACK;
		case 12: return QUEEN;
		case 13: return KING;
		default: return "";
		}
	}
	
	//toString combines both accessor methods.
	//the IVARS are fed through these methods 
	//and are turned into Strings.
	public String toString() {
		return getRank() + " of " + getSuit();
	}
	
	//generates a new object rgen from RandomGenerator class
	RandomGenerator rgen = new RandomGenerator();
	
	//Instance variables or IVARS:
	private int suitName;
	private int rankName;
	
	
}
