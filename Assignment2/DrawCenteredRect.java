/*
 * File: DrawCenteredRect.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the DrawCenteredRect problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawCenteredRect extends GraphicsProgram {
	
	/** This program draws a blu rectangle
	 * at the center of the screen. */
	private static final int WIDTH = 350;
	private static final int HEIGHT = 270;

	public void run() {
		/* You fill this in. */
		
		
		
		
		
		
		double x = 0;
		double y= 0 ;
		
		GRect rect = new GRect(x,y, WIDTH, HEIGHT);
		x= (getWidth() + rect.getWidth())/2;
		y = (getHeight() + rect.getHeight())/2;
		
		rect.setFilled(true);
		
		
		rect.setColor(Color.BLUE);
		
		
		
		add(rect, x,y );
		
		
		
		
		
		
	}
}

