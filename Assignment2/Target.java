/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		
		GOval oval = new GOval(getWidth()/2,getHeight()/2, 200, 200);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		
		GOval oval2 = new GOval(getWidth()/2 + 50,getHeight()/2 + 50,100, 100);
		oval2.setFilled(true);
		oval2.setColor(Color.WHITE);
		
		add(oval2);
		
		GOval oval3 = new GOval(getWidth()/2 + 75,getHeight()/2 + 75, 50, 50);
		oval3.setFilled(true);
		oval3.setColor(Color.RED);
		add(oval3);
	}
}
