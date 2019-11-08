import acm.program.*;

import acm.graphics.*;

/*This program draws a Calendar*
 *
 */
public class Ch4_Problem12Calendar extends GraphicsProgram {

	//shows the days in a month
	
	
	/*Shows the day when a month starts,
	 * for example 0=sunday 1=monday 2= Tuesday etc.
	 *  */
	private static final int DAY_MONTH_STARTS=5;
	
	private static final int DAYS_IN_MONTH = 31;
	
	//These constants define the calendar day with and hight
	private static final int DAY_WIDTH = 40;
	private static final int DAY_HEIGHT = 30;
	
	
	//This creates our Calendar, see previous exercise for details.
	public void run() {
		
		int day= 0;
		
		for (int i=0; i<6; i++) {
			
			for (int j=0; j< 7; j++) {
				
				int x= j*DAY_WIDTH;
				int y= i*DAY_HEIGHT;
				add(new GRect(x, y, DAY_WIDTH, DAY_HEIGHT));
				
				/*neat trick!!!!
				 * 
				 * DAY_MONTH_STARTS*i+j>=9
				 * 
				 * i,j means: going direction x=j and going direction y=i
				 * The above statement just means that 
				 * when the first row j is being compiled
				 * j goes in x direction, it is first = 1, then = 2 then = 3 then 4 then 5 then 6 then 7(X has to change for the next square in row to be created)
				 * i is constant and is = 0 then =1
				 * Therefore for the compiler you have the values:
				 * 5x0 + 0, 5x1+1, 5x1+2, 5x1+3, 5x1+4
				 * When the compiler sees that the coordinate 5x1+4=9 THEN
				 * it executes the "day++" variable. 
				 * 
				 * 
				 * */
				if (DAY_MONTH_STARTS*i+j>=9 && day < DAYS_IN_MONTH) {
					
					day++;
					
					add(new GLabel(""+day), x, y);
				}	
			}	
		}	
	}	
}