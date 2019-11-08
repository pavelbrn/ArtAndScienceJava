import acm.program.*;
import acm.graphics.*;

public class Ch2DrawSnowman extends GraphicsProgram {

	public void run() {
		
		
		add(new GLabel("v"), 140,50);
		
		add(new GOval(120,20,40,40));
		add(new GOval(110,60,60,60));
		add(new GOval(100,120, 80, 80));
		
		
	}
	

}
