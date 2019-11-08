import acm.program.*;

public class Ch3_AreaOfCircle extends ConsoleProgram {

	public void run() {
		
		double circleRadius = readDouble ("Enter radius of circle: ");
		
		double areaOfCircle = PI*circleRadius*circleRadius;
		
		println ("The area of the circle is: " + areaOfCircle);
		
		
	}
	
	private static final double PI = 3.14;
	
}
