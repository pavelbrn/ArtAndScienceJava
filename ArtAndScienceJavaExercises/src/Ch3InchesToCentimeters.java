import acm.program.*;

public class Ch3InchesToCentimeters extends ConsoleProgram{
	
	public void run() {
		
		// converts feet to inches then inches to cm
		println("this program converts feet and inches to centimeters");
		
		double feet = readDouble("Enter number of feet: ");
		double inches = readDouble("Enter number of inches: ");
		
		double feetToInches = feet * INCHES_PER_FOOT;
		double FeetToInchesToCM =  (feetToInches * CENTIMETERS_PER_INCH);
		
		//COnverts the entered inches into cm
		double inchesToCM = inches * CENTIMETERS_PER_INCH;
		
		/* Adds up the final total of centimeters from
		converted feet and converted inches */
		
		double totalCM = FeetToInchesToCM + inchesToCM ;
		
		println("cm = " + totalCM);
		
		
		
		
		
		/*
		double cm = readDouble(" Enter number of centimeters: ");
		double totalInches = cm / CENTIMETERS_PER_INCH;
		int feet = (int) (totalInches / INCHES_PER_FOOT);
		double inches = totalInches - INCHES_PER_FOOT * feet;
		
		
		println(cm + "cm= " + feet + "ft + " + inches + "in");
		*/
	}
	
	private static final int INCHES_PER_FOOT = 12;
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	

}
