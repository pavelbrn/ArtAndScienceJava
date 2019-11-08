import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*create method DrawLineGraph
 * this generates a line graph
 * 
 * use an array for x coordinates
 * use an array for y coordinates
 * 
 * use: new GLine(0, getHeight(), getWidth(), 0)

 * 
 * */

public class Ch10_Problem8 extends GraphicsProgram {
	
	
	public void run() {
		//setFont("Helvetica-40");
		
		
		inputArrayInformation();
		drawLineGraph();

	}
	
	//draw the graph:
	public void drawLineGraph() {
		
		for (int i=0; i<9; i++) {
			drawLine(x[i],y[i],x[i+1],y[i+1]);
		}
		
		
	}
	
	//input coordinates
	//draw line
	public GLine drawLine(double x1, double y1, double x2, double y2) {
		
		GLine line = new GLine(x1,y1,x2,y2);
		add(line);
		return line;
		
	}
	
	//initializes the arrays
	public void inputArrayInformation(){
		
		int[] tempX = {0,40,80,120,160,200,240,280,320,360};
		int[] tempY = {67,68,71,86, 86, 104, 130,181,146,186}; 
		x=tempX;
		y=tempY;
	}
	
	
	//Instance variable arrays:
private int[] x =new int[10];

private int[] y = new int[10];
	
}



/*
 * x    y
 * (0, 67)  xi,    yi 
 * (40, 68) xi+1,  yi+i
 * (80, 71) xi+2,  yi+2
 * (120, 86) ...    ...
 * (160, 86)  
 * (200, 104) 
 * (240, 130) 
 * (280, 181) 
 * (320, 146) 
 * (360, 186)
 * 
 * */
 