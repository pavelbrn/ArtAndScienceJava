/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		
		placeAllBeepers();
		gatherFirstBeeper();
		turnAround();
		move();
		stackBeepers(); 
	 	moveToMiddle();
	 	turnAround();
		removeFinalBeepers();
		moveToCenter();
			
	}
	
/*Place beepers on every second square
 * precondition: none
 * postcondition: place beepers until eastern corner is reached
 * Note: Because CheckFront turns Karel around
 * the rest of the move function AFTER it turns around is STILL executed
 * such as move and put beeper, therefore you have 2 beepers.
 */
			private void placeAllBeepers() {
				
			
				while (leftIsClear()) {
					
					checkFront();
					
					move();
					
					putBeeper();
					checkFront();
					
					move();
					
					
					
				}
				
				
			}
	
/*
 * Gather the first beeper and place it on the right 
 * side of the world.
 * Precondition: start east corner
 * postcondition: place beeper east corner
 * 
 */
			private void gatherFirstBeeper() {
				
				while (noBeepersPresent()) {
					
					move();
					if (beepersPresent()) {
						pickBeeper();
						turnAround();
						move();
						putBeeper();
						
						
						
					} else { 
						
						checkFront();
						
					}
				
			
					
				}
				
				
			}
	
/*
 * Stack the rest of the beepers on the right
 * half side of the first Avenue/street
 * precondition: start after first beeper on right
 * postcondition: Karel facing right on the west corner, all beepers 
 * are stacked on the right half of first avenue.
 */
			
	 private void stackBeepers() {
		while (rightIsClear()) {
			move();
			if (beepersPresent()) {
				
				
				pickBeeper();
				turnAround();
				
				stack();
				
			
				
			} else {
				checkFront();
				
			}
		}
	}
		
	 
/* stacks beepers next to each other.
 * 
 * */
		private void stack() {
			while (rightIsBlocked()) {
				move();
			
				if (beepersPresent()) {
				
					turnAround();
					move();
					putBeeper();
				} 
				
			
				}
			}

/* Checks the front before Karel hits a wall.
 * */
		private void checkFront() {
			if (frontIsBlocked()) {
				turnAround();
				
			}
		}
		
			
		
		private void moveToMiddle() {
			while (rightIsBlocked()) {
				move();
				if (beepersPresent()) {
					
					turnAround();
					
					
					
				}
			}
			
		}
		
		/*NOTE! removeFinalBeepers removes the 2 Beepers on the right side because
		 * the while statement is STILL executed even when Karel turns around
		 * thus executing the if statement and picking up the final beeper! 
		 * 
		 * */
		 
		private void removeFinalBeepers() {
			while(rightIsBlocked()) {
				checkFront();
				
				move();
				if (beepersPresent()) {
					pickBeeper();
				} 
			}
			
		}
		
		private void moveToCenter() {
			while (leftIsBlocked()) {
				move();
				if (beepersPresent()) {
					turnAround();
					
				}
			}
		}
		
}

