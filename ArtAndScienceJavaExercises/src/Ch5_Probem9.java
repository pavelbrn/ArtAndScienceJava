import acm.program.*;
import acm.graphics.*;

public class Ch5_Probem9 extends GraphicsProgram {

	/*This program 
	 * 
	 * */

	public void run() {
		
		
		
		
		GLabel label = new GLabel(""+combi(0,0));
		label.setFont("Helvetica-40");
		add(label, 100, 75);
		
		GLabel label2 = new GLabel(""+combi(1,0));
		label2.setFont("Helvetica-40");
		add(label2, 222, 85);
		
		
		
		
	}
	
	
	
	private int combi(int n, int k ) {
		return factorial(n)/(factorial(k)*factorial(n-k));
		
		
	}
	
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i<=n; i++) {
			result = result*i;
			
		}
		return result;
		
	}
	
}

/*print GLabel in x direction as x
 * print GLabel in y direction y++
 * 
 * 
 * 
 * */
 