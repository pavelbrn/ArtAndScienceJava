
import acm.program.*;
import acm.util.*;
import java.awt.Color;
import java.util.*;
import acm.graphics.*;

 public class Ch8_Problem1_TriangleBricks extends GraphicsProgram{
	 
	 public void run() {
		 
		 //rect(50,50);
		
		 //int x= 0;
		 //int y= 0;
		// int n = 50;
		 for (int i = 0; i < 10; i++) {
			 
			
			 for (int j = 0; j<i; j++ ) {
				 
				int middleX = getWidth()/2;
				int middleY = getHeight()/2; 
					
				 rect(middleX+30*j -i*15, middleY+ 15*i);
				 
				// GRect rect = new GRect( middleX + 30*j - 15*i , middleY + 12*i, 50, 20);
					//add (rect);
			 }
		 }
		 
		 
	 } 
	 

	 
	 private GRect rect(int x,int y) {
		 GRect rect = new GRect(x,y, 30, 13);
		 add(rect);
		 return rect;
	 }
	
}
