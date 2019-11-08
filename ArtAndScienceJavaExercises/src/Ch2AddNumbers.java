import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class Ch2AddNumbers extends ConsoleProgram {

	public void run() {
		
		println("this program adds two integers.");
		println("this program adds two integers.");
		double FirstNumber = readInt(" Enter First Number: ");
		double SecondNumber = readInt("Enter second Number: ");
		double ThirdNumber = readInt("Enter third number: ");
		
		double total = FirstNumber + SecondNumber + ThirdNumber;
		
		println("The total is " + total + ".");
		
	}
	

}
