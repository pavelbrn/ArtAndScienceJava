import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/* generate random number between -100 and 100 called x
 * generate a random number between -100 and 100 called y
 * if x^2+y^2 <10,000 then the point is inside the circle
 * print this point as a blue dot.
 * 
 * if x^2+y^2 >10,000 then print this point as a red dot.
 * 
 * repeat this process 10,000 times
 * 
*
*
*/

public class Ch6_Problem3MonteCarloIntergration extends GraphicsProgram {
	
public void run() {
	
	int i = 0;
	//Simulate 60,000 points inside and outside the circle.
	while(i<60000) {
		i++;
		int x = random.nextInt(-100, 100);
		int y = random.nextInt(-100, 100);
		
		double circle = Math.pow(x, 2) + Math.pow(y, 2);
		
		
		
		
		if (circle<10000) {
			//draw blue dot.
			GOval oval = new GOval(x +200 ,y+ 200, 1,1);
			oval.setFilled(true);
			oval.setColor(Color.BLUE);
			add(oval);
			
			
		} else if(circle >10000) {
			//draw red dot.
			GOval oval2 = new GOval(x+200,y+200, 1,1);
			oval2.setFilled(true);
			oval2.setColor(Color.RED);
			add(oval2);
			
			
		}
	}
	
	
	
	
}
	

RandomGenerator random = new RandomGenerator();

	
}