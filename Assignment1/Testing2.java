import stanford.karel.*;

public class Testing2 extends SuperKarel {
	
	
	
	
	
	public void run() {
	
		evenBeeperRow1();
		midRows();
		checkFrontRight();
		evenBeeperRow2();
		turnLeft();
		midRows();
		
		
	
	}
		
		

	private void evenBeeperRow2() {
		while (rightIsClear()) {
			evenBeeper2();
			   	
		}
	}
	
	private void evenBeeper2() {
		
		for (int i = 0; i < 1 ; i++) {
			checkFrontLeft2();
			move();
			//checkFrontLeft();
			putBeeper();
			checkFrontLeft2();
			move();
			checkFrontLeft2();
			
	
		}
		
	}
	
	
	private void checkFrontLeft2() {
		
		if (frontIsBlocked()) {
			turnLeft();
			
		}
		
	}
	private void checkFrontRight() {
		if (frontIsBlocked()) {
			checkBeeper();
			turnRight();
			move();
			turnRight();
			
		}
	}
	
	private void checkBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
			
		}
	}

	private void midRows() {
		
		while (frontIsClear()) {
			oddBeeper();
			
		}
		
		
		
	}
	
	private void oddBeeper() {
		
		for (int i = 0 ; i < 1 ; i++) {
			checkFrontRight();
			putBeeper();
			checkFrontRight();
			move();
			checkFrontRight();
			move();
			
			
		}
	}
	
	// Puts down a beeper very second place for an entire row
	
	private void evenBeeperRow1() {
		
		while (rightIsBlocked()) {
			evenBeeper();
			
			
		}
		
		
	}
	
	// Check the front then turn LEft
	
	private void checkFrontLeft() {
		if (frontIsBlocked()) {
			turnLeft();
			move();
			turnLeft();
			
			
			
		}
	}
	
	// Puts beeer every second space
		private void evenBeeper() {
			
			for (int i = 0; i < 1 ; i++) {
				checkFrontLeft();
				move();
				//checkFrontLeft();
				putBeeper();
				checkFrontLeft();
				move();
				checkFrontLeft();
				
				
			}
			
			
			
		}
	
			
		
		
		
	
	
}