/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;

	public void run() {
		/* You fill this in. */
		//setCanvasSize(200,200);
		
		GRect rect = new GRect( 100, 200, 75,50);
		add(rect);
		GLabel label = new GLabel("CS106A", rect.getX()+15, rect.getY()+30);
		add(label); 
		
		GRect rect2 = new GRect( 175+ TILE_SPACE, 200, 75,50);
		add(rect2);
		GLabel label2 = new GLabel("CS106A", rect.getX()+90 + TILE_SPACE, rect.getY()+30);
		add(label2); 
		
		
		GRect rect3 = new GRect( 100, 250 +TILE_SPACE , 75,50);
		add(rect3);
		GLabel label3 = new GLabel("CS106A", rect.getX()+15, rect.getY()+80 + TILE_SPACE);
		add(label3); 
		
		GRect rect4 = new GRect( 175+ TILE_SPACE, 250 +TILE_SPACE , 75,50);
		add(rect4);
		GLabel label4 = new GLabel("CS106A", rect.getX()+90+ TILE_SPACE, rect.getY()+80 + TILE_SPACE);
		add(label4); 
		
		
		
		
	}
	
	

	
}

