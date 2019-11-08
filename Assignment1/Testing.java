/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;


public class Testing extends GraphicsProgram {

	private GImage image;
		 public void run() {
			// this.setFont("Helvetica-30");
			
		image = new GImage("testImage.jpg");
		add(image);
		setSize(1000,800);
		addMouseListeners();
			}
			
		 public void mouseClicked(MouseEvent e) {
			 int[][] pixels = image.getPixelArray();
			 
			 for (int r =0; r<pixels.length; r++) {
				 for (int c=0; c< pixels[r].length;c++) {
					 int px = pixels[r][c];
					 int red = GImage.getRed(px);
					 int green = GImage.getGreen(px);
					 int blue = GImage.getBlue(px);
					 green =0;
					 blue=0;
					 
					 //putting stuff into this array of pixels:
					 pixels[r][c]= GImage.createRGBPixel(red, green, blue);
					 
				 }
				 
			 }
			 image.setPixelArray(pixels);
		
			 
		 }
			
		}

		



