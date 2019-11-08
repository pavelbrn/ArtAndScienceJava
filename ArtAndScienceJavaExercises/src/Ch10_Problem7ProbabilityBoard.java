import acm.program.*;
import acm.util.*;
import java.awt.Color;
import java.util.ArrayList;
import acm.graphics.*;

/* create an int[] probability board(probBoard) array =10
 * 
 * drop marbles 50 times.
 * 
 * for each marble:
 * -randomGen either 1 or 0 --> 9 times.
 * -feed result into probability board index i
 * -tally the amount of times fed into index i
 * 
 * -create the same mount of GOvals as in every index i.
 * 
 * NOTE: 9 bounces to right, ball will land in 9th index of probability board.
 * 
 *
 * 
 * 
 * 
 * */

public class Ch10_Problem7ProbabilityBoard extends GraphicsProgram {
	
	
	
public void run() {
	setSize(1000,1800);
	
		
	generateFiftyFalls();
	draw();
	
	//check and see how many elements in array.
	checkArray();
		

}
	
public void checkArray() {
	for (int i=0; i<10; i++) {
		println(probBoard[i]);
	}
}

	
	public void generateFiftyFalls() {
		
		int i =0;
		while(i<50) {
			i++;
			generateOneFall();
		}
		
	}
	
	
	
public void generateOneFall() {
		
	//every right bounce is 1
	//every left bounce is 0
	//generates the amount of times a ball bounces left or right while bouncing 9 times
	//the marble lands in the column that has the same index as the number of right bounces.
	int countRightBounce = 0;
	for (int i=0; i<=9; i++) {
		int bounce = rgen.nextInt(0, 1);
		countRightBounce = countRightBounce + bounce;
		
	}
	//adds 1 element(marble) to column every time a ball lands at index i.
	probBoard[countRightBounce] = probBoard[countRightBounce] + 1;
	//println(countRightBounce);
	//adds a marble to the probability board
		
		
		
		
	}
	
public void draw() {
		
	int temp = 0;
	for (int i = 0; i<=9; i++) {
		temp = probBoard[i];
			
	//draw GOvals equivalent to number inside probBoard:
		for (int j = 0; j<=temp-1; j++) {
		addMarble().setLocation(200+i*40,800 - 40*j);
		}
			
			
	}
		
}
	
	public GOval addMarble() {
		//x,y,width,height.
		GOval marble = new GOval(200,800, 40,40);
		marble.setFilled(true);
		marble.setFillColor(Color.black);
		add(marble);
		return marble;
		
		
		
	}
	

	//private ArrayList<GOval> probBoard = new ArrayList<>();
	private int[] probBoard = new int[10];
	private RandomGenerator rgen = new RandomGenerator();

}

