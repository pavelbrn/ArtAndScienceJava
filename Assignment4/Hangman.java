/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Hangman extends ConsoleProgram {

	/***********************************************************
	 *              CONSTANTS                                  *
	 ***********************************************************/
	
	/* The number of guesses in one game of Hangman */
	private static final int N_GUESSES = 10;
	/* The width and the height to make the karel image */
	private static final int KAREL_SIZE = 150;
	/* The y-location to display karel */
	private static final int KAREL_Y = 230;
	/* The width and the height to make the parachute image */
	private static final int PARACHUTE_WIDTH = 300;
	private static final int PARACHUTE_HEIGHT = 130;
	/* The y-location to display the parachute */
	private static final int PARACHUTE_Y = 50;
	/* The y-location to display the partially guessed string */
	private static final int PARTIALLY_GUESSED_Y = 430;
	/* The y-location to display the incorrectly guessed letters */
	private static final int INCORRECT_GUESSES_Y = 460;
	/* The fonts of both labels */
	private static final String PARTIALLY_GUESSED_FONT = "Courier-36";
	private static final String INCORRECT_GUESSES_FONT = "Courier-26";
	
	/***********************************************************
	 *              Instance Variables                         *
	 ***********************************************************/
	
	/* An object that can produce pseudo random numbers */
	private RandomGenerator rg = new RandomGenerator();
	
	private GCanvas canvas = new GCanvas();
	
	/***********************************************************
	 *                    Methods                              *
	 ***********************************************************/

	
public void run() {
	
	scanFileToArray();
	
	//print lexiconArray for debugging purposes at index 555 or any other:
	//println(lexiconArray.get(555));
	
	mistakes =0;
	//Canvas methods:
	setSize(3000,2000);
	drawBackground();
	drawKarel();
	
	drawParachute();
	addLines();
//canvas.remove(karel);
	
	
	//Console methods:
	this.setFont("Helvetica-70");
	println("Welcome to Hangman!");
	getWord();
	initGuessWord();
	runGame();
	
	replay();
	
	

}

//sets turns to 10 and restarts the game:
public void replay() {
	String replay = readLine("Play the game again? y=yes/n=no: ");
	if (replay.equals("y")) {
		
		run();
	} else if(replay.equals("n")) {
		println("Thank you for playing");
	} else{
		println("please enter a y or n(y=yes/n=no): ");
		//turns =10;
		replay();
	}
	
	
	
}


public void runGame() {
	usedLetter="";
while(turns>=0) {
	
	String userInput = readLine("Your guess: ");
	userInput = userInput.toUpperCase();
	usedLetter= usedLetter.concat(userInput);
	if(word.equals(userInput)) {
		
		println("You win!");
		turns =10;
	
		break;
	}
	userGuess(userInput);
	
	if(word.equals(guessWord)) {
		println("You win!");
		turns =10;
		//mistakes=0;
		//addLines();
		break;
	} else if(turns==0) {
		karelLoose();
		//canvas.remove(line10);
		turns =10;
		//mistakes=0;
		//addLines();
		println("You loose the game");
		println("the answer was: "+word);
		break;
	}
	
}



}

private void karelLoose() {
	canvas.remove(karel);
	
	 
	 GImage karelFlipped = new GImage("karelFlipped.png");
	//karel.setSize(canvas.getWidth(), canvas.getHeight());
	canvas.add(karelFlipped,canvas.getWidth()/2-karelFlipped.getWidth()/2,canvas.getHeight()/2-karelFlipped.getHeight()/2);
}
	

public void userGuess(String userInput) {
	
	//guess here
	
	
	String check= "";
	
	
	for (int i = 0; i<word.length(); i++) {
		
		
		char ch = word.charAt(i);
		String convLetterToString = Character.toString(ch);
		
		
		//usedLetter= userInput;
		
		if(convLetterToString.equals(userInput)) {
			
		//swaps a dash for a letter that matched the secret word:
			//extends to i but DOES NOT include it!
		String beginningOfGuessWord =guessWord.substring(0, i);
		
		String endOfGuessWord = guessWord.substring(i+1, guessWord.length());
		
		guessWord = beginningOfGuessWord.concat(userInput).concat(endOfGuessWord);
		check = convLetterToString;
		
		} 
		
		
	} 
	
	
	//check if the user input is equal to a letter in the word ivar:
	if(check.equals(userInput)) {
	    println("This guess is correct.");
	    //removeLine();
		}else {
			turns--;
			removeLine();
			
			
			//remove a line.
			//canvas.remove(line1);
			//if lines= 0 break;
			println("There is no "+userInput+" in this word");
	
	}
	addLabels();
	addLettersUsed();
	
	println("You have "+turns+" guesses left.");
	println("Your word now looks like this: "+guessWord);
	println();
	
}

private GLabel addLabels() {
	
	//guess.sendToFront();
	guess.setLabel(guessWord);
	guess.setFont("Helvetica-80");
	canvas.add(guess);
	return guess;
	
	
}

private void addLettersUsed() {
	usedLetterLabel.setLabel(usedLetter);
	usedLetterLabel.setFont("Helvetica-80");
	canvas.add(usedLetterLabel);
	//return usedLetters;
}

private void removeLine() {
	 if(turns ==9) canvas.remove(line1);
	else if(turns ==8) canvas.remove(line2);
	else if(turns ==7) canvas.remove(line3);
	else if(turns ==6) canvas.remove(line4);
	else if(turns ==5) canvas.remove(line5);
	else if(turns ==4) canvas.remove(line6);
	else if(turns ==3) canvas.remove(line7);
	else if(turns ==2) canvas.remove(line8);
	else if(turns ==1) canvas.remove(line9);
	else if(turns ==0) canvas.remove(line10);
}

//initialize the guess word with dashes
//guess word has same length as answer word:
public void initGuessWord() {
	
	guessWord = "";
	for (int i=0; i<word.length(); i++) {
		guessWord = guessWord.concat("-");
		
	}
	
	println(guessWord);
	
	//for debugging purposes, turn println() into comment when program is finished:
	//println(word);
}

public void getWord() {
	
	word = getRandomWord();
	
}

private void scanFileToArray() {
	
	try {
		Scanner input = new Scanner(new File("HangmanLexicon.txt"));
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			lexiconArray.add(line);
			
		}
		
		
	} catch(FileNotFoundException ex){
		println("File not found: " + ex);
	}
	
}

private String getRandomWord() {   
	int index = rg.nextInt(121805); 
	return lexiconArray.get(index);
	/*if(index == 0) return "BUOY"; 
	if(index == 1) return "COMPUTER"; 
	if(index == 2) return "CONNOISSEUR";  
	if(index == 3) return "DEHYDRATE";  
	if(index == 4) return "FUZZY";  
	if(index == 5) return "HUBBUB";  
	if(index == 6) return "KEYHOLE"; 
	if(index == 7) return "QUAGMIRE"; 
	if(index == 8) return "SLITHER";  
	if(index == 9) return "ZIRCON";  */
	//throw new ErrorException("getWord: Illegal index"); 
	
} 

private void drawBackground() {
	GImage bg = new GImage("background.jpg");
	bg.setSize(canvas.getWidth(), canvas.getHeight());
	canvas.add(bg,0,0);
	
	
}

private GImage drawKarel() {
	karel = new GImage("karel.png");
	//karel.setSize(canvas.getWidth(), canvas.getHeight());
	canvas.add(karel,canvas.getWidth()/2-karel.getWidth()/2,canvas.getHeight()/2-karel.getHeight()/2);
	
	return karel;
}
	private void drawParachute() {
		GImage parachute = new GImage("parachute.png");
		canvas.add(parachute,canvas.getWidth()/2-parachute.getWidth()/2, canvas.getHeight()/2-800);
		
		
	}
	
	private void addLines() {
		line1 = new GLine(karel.getX()+150,karel.getY(), 410,482);
		canvas.add(line1);
		
		line2 = new GLine(karel.getX()+150,karel.getY(), 400+50,482);
		canvas.add(line2);
		
		line3 = new GLine(karel.getX()+150,karel.getY(), 400+100,482);
		canvas.add(line3);
	
		line4 = new GLine(karel.getX()+150,karel.getY(), 400+200,482);
		canvas.add(line4);
		line5 = new GLine(karel.getX()+150,karel.getY(), 400+300,482);
		canvas.add(line5);
		line6 = new GLine(karel.getX()+150,karel.getY(), 400+400,482);
		canvas.add(line6);
		line7 = new GLine(karel.getX()+150,karel.getY(), 400+500,482);
		canvas.add(line7);
		line8 = new GLine(karel.getX()+150,karel.getY(), 400+600,482);
		canvas.add(line8);
		line9 = new GLine(karel.getX()+150,karel.getY(), 400+650,482);
		canvas.add(line9);
		line10 = new GLine(karel.getX()+150,karel.getY(), 400+675,482);
		canvas.add(line10);
	}
	




//this method will automatically run before the run() method! 
//No need to add it into the run() method.
public void init() {
	add(canvas);
}

//declares a new canvas instance variable:
private GImage karel;

//create lines.
private GLine line1;
private GLine line2;
private GLine line3;
private GLine line4;
private GLine line5;
private GLine line6;
private GLine line7;
private GLine line8;
private GLine line9;
private GLine line10;


private int diff = 100;

private int mistakes;
private int turns = 10;
private String word;
private String guessWord;

ArrayList<String> lexiconArray = new ArrayList<>();

GLabel guess= new GLabel("", 700,1700);
GLabel usedLetterLabel = new GLabel("", 700,1800);

private String usedLetter;
}
 
 
 
 