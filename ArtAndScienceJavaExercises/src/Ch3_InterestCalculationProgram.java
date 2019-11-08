import acm.program.*;

public class Ch3_InterestCalculationProgram extends ConsoleProgram{

	public void run() {
		
		println ("Interest calculation program");
		
		/*User enters starting balance and annual interest rate. 
		 * the user enters annual interest in percent,
		 * this is then converted.
		 * */
		double startingBalance = readDouble("Enter starting balance: ");
		double annualInterestPercent = readDouble(" Enter annual interest rate in percent: ");
		
		double annualInterest = annualInterestPercent/100;
		
		/* Calculation of balance after one year using 
		*the simple interest formula A = P(1 + rt)
		*where: 
		*P = principal amount of money, 
		*r = interest rate
		*t = period of time, which is 1 or 2 years in this program
		
		*/
		
		double totalBalanceOneYear = startingBalance*(1+annualInterest*1);
		double totalBalanceTwoYears= totalBalanceOneYear*(1+annualInterest*1);
		
		
		println ("Balance after one year = " + totalBalanceOneYear + "  Balance after two years = " + totalBalanceTwoYears);
		
		
		
		
		
		
	}
	
}
