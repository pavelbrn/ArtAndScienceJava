/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
		
		
		for (int i= 0; i<= BRICKS_IN_BASE; i++) {
			
			for (int j=0; j<i; j++) {
				
				/*For every j that is smaller than i 
				 * Java prints one less cube than i.
				 * so it goes like this:
				 * no cubes(i=0 means j is not less than i therefore not square is printed,
				 * next line(i=1) it prints 1 square
				 * third line(i=2) it prints 2 squares*/
				int middleX = getWidth()/2;
				int middleY = getHeight()/2;
				
				
				GRect rect = new GRect( middleX + 30*j - 15*i , middleY + 12*i, BRICK_WIDTH, BRICK_HEIGHT);
				add (rect);
				
				
			}
		}
		
	}
}

