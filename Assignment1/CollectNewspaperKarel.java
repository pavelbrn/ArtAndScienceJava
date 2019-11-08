/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	// You fill in this part
	
public void run() {
		goToNews();
		pickUpNews();
		goToStart();
		
	}
	

		// GO TO NEWS
		private void goToNews() {
		
			while (leftIsBlocked()){
			move();
					if (frontIsBlocked()) {
						turnRight();
						}
			} 
		
		
		}
	
		
		
	//PICK UP NEWS
		
			private void pickUpNews() {
			
				turnLeft();
				move();
				pickBeeper();
				turnAround();
				move();
				
			}
		
	//GO TO START
			private void goToStart() {
					
				while (leftIsClear()) {
					move();
					
					if (frontIsBlocked()) {
						turnRight();
					}
							
					}
			while (frontIsClear()) {
				move();
				
			}
					
				turnRight();
				
			}
			
			
			
}
