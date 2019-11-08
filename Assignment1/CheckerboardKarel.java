/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		
		
		
		
		
		putBeeper();
		ifInColumn();
		ifInRow();
		
		
		
	while (facingEast()) {
			putRow();
			
			nextRow();
			
		}
		
		
		
	while (rightIsClear()) {
		putBeeper();
		putRow();
		nextRow();
		if (leftIsBlocked()) {
			turnRight();
		}
	} 
	
		ifFacingSouth();
		
		ifFacingWest();
		
		columnBeeperPresent();
	
	}
	

	private void columnBeeperPresent() {
		if (facingWest()) {
			if (beepersPresent()) {
				pickBeeper();
				
			}
		}
	}
		
		
	private void ifInColumn() {
		if (frontIsBlocked()) {
			
			turnLeft();
			
			putRow();
			
			
			
		}
		
	
		
		
	}
	
	private void ifInRow() {
		if (leftIsBlocked()) {
			putRow();
			turnLeft();
		}
	}
	
	private void ifFacingWest() {
		if (facingWest()) {
			putBeeper();
			putRow();
		}
	}
	
	private void ifFacingSouth() {
		if (facingSouth()) {
			turnLeft();
			putBeeper();
			putRow();
		}
	}
	
	private void checkForBeeper() {
		if (beepersPresent()) {
			
			turnLeft();
			move();
			turnLeft();
			move();
			
		} else {
			turnLeft();
			move();
			turnLeft();
		}
		
	}

	
		
	
	
	private void nextRow() {
		
		checkTop();
		
		if (facingEast()) {
			
			checkForBeeper();
			
		} else {
			turnRight();
			move();
			turnRight();
		}
		
	}

	private void checkTop() {
		if (leftIsBlocked()) {
			turnAround();
		}
	}
	
	private void putRow() {
		while (frontIsClear()) {
			
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
					
			}
			}
	}
	
	
	
	
	

	
	

	
	
	
	
	
		
}
	
		
		
	
		
	

		



