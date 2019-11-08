/*
 * File: MouseReporter.java
 * -----------------------------
 * Output the location of the mouse to a label on the
 * screen. Change the color of the label to red when
 * the mouse touches it.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.program.*;

public class MouseReporter extends GraphicsProgram {

	// A constant for the x value of the label
	private static final int INDENT = 20;
	
	// This variable is visible to the entire program
	// It is called an "instance" variable
	//private GLabel label1 = new GLabel("");
	
	public void run() {	
		// this code already adds the label to the screen!
		// run it to see what it does.

		label1 = new GLabel("");
		label1.setColor(Color.blue);
		label1.setFont("Monospaced-Bold-100");
		
		add(label1,100,100);
	
		 
		addMouseListeners();
		
	 
	 }
	 
	 public void mouseMoved(MouseEvent e) {
		 //lastX=e.getX();
		 //lastY= e.getY();
		 
		 label1.setLabel(e.getX() +","+ e.getY());
		 add(label1,100,100);
		 
		 gobj = getElementAt(e.getX(),e.getY());
		 println(gobj);
		 
		 if (gobj!=null) {
			 label1.setColor(Color.red);
			 
		 } else {
			 label1.setColor(Color.blue);
		 }
		 
		
		 //println(lastX+"  "+lastY);
	 }
	 
//private int lastX;
//private int lastY;
private GObject gobj;
private GLabel label1;

}
