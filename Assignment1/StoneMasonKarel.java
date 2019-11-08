/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	
	public void run() {
		
		while (rightIsBlocked()) {
			checkColumn();
			checkForEastWall();
			
		
			moveToNextColumn();
		 
			//checkColumn();
	  
			checkForEastWall();
		
		 }
		
		turnAround();
		
		
	}
	

	
	private void moveToNextColumn() {
		for (int i = 0; i <4 ; i++) {
			move();
			if (leftIsBlocked()) {
				checkForBeeper();
				
				moveToNextColumn();
				
			}
		}
	}
	
	
	
	
//CHECK FOR EAST WALL
	private void checkForEastWall() {
		if (frontIsBlocked()) {
			checkColumn();
			
			turnAround();
			
		}
	}
	
	
	
	
	
	
	
	
	
//CHECK COLUMN STARTS HERE
	
	private void checkColumn() {
		checkForBeeperBase();
		checkForColumnTop();
		moveUpColumn();
		checkForColumnTop();
		turnLeft();
		//checkForBeeperInColumn();
		
		
		
		
		
	}
	
	
	private void checkForBeeperBase() {
		if (noBeepersPresent()) {
			putBeeper();
		
			turnLeft();
			
			} else {
				turnLeft();
				
			}
	}
	
	private void checkForColumnTop() {
		if (frontIsBlocked()) {
			turnAround();
			checkForBottom();
			moveToBottom();
			
		} 
	}
	
	private void checkForBottom() {
		if (frontIsBlocked()) {
			turnLeft();
			
		}
	}

	private void moveToBottom() {
		while (frontIsClear()) {
			move();
			
		}
	}
	


private void moveUpColumn() {
	while (frontIsClear()) {
		move();
		checkForBeeper();
		
		
	}
}

private void checkForBeeper() {
	if (noBeepersPresent()) {
		putBeeper();
	}
	
}

}