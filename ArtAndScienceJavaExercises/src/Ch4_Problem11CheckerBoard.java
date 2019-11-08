import acm.program.*;
import acm.graphics.*;

/*This program draws a checker board*
 *
 */
public class Ch4_Problem11CheckerBoard extends GraphicsProgram {

	public void run() {
		
		/*i sets up rows
		 *j sets up columns
		 *multiply j and i with 50 accordingly
		 *to set the COORDINATES.
		 *
		 *The square size will stay constant throughout
		 * the 'i' "for" loop draws the rows
		 * the 'j' "for" loop draws the columns
		 * */
		for (int i=0; i<8; i++) {
			for (int j=0; j< 8; j++) {
				int x= j*50;
				int y= i*50;
				add(new GRect(x, y, 50, 50));
				add(new GOval(x,y, 50,50));
				
				
			}
			
		}
		
		
		
		/*for (int i=0; x<450; x=x+50) {
			
			
			for (int h=0; y<450 ; y= y+ 50) {
				add(new GRect(0,0, x, 50 ));
				add(new GRect(0,0,50, y ));
							
					
					//add(new GRect(z,0, 50, y));
					//add(new GRect(50,0, 50, y));
					//add(new GRect(100,0, 50, y));
					  
					  }
				
				
			
			
			
		} */
		
		
	}
	
	
}
