import acm.program.*;

public class Ch5_Probem10 extends ConsoleProgram{

	
	public void run() {
		
	
		setFont("Helvetica-40");
		
		int n = readInt("Enter number: ");
			
		
		
		if (isPrime2(n)) {
			println("Number is Prime.");
		} else {
			int i= 2;
			while(i<n) {
				int x = n/i;
				
				if (n%i ==0) println("Not prime because " +n+ " is divisible by: "+x);
				i++;
			}
			
		}
			
			
					
		run();
		
		
	}
	
	 private boolean isPrime(int n) {
		
		if (n==2) return true;
		if (n%2 ==0) return false;
		
		int i=3;
		
		while(i<(n-1)) {
			
			if (n%i==0) return false;
			i+=2;
			
		}
		
		return true;
	}
	
	 private boolean isPrime2(int n) {
		 if (n==2) return true;
		 
		 int i=2;
		 while (i<n) {
			 
			 if (n%i ==0) return false;
			 
//SOURCE OF BUG WAS NOT PUTTING i++ AFTER if statement!
			 i++;
			
		 }
		 return true;
		 
	 }
	
	
	
	/*private boolean isPrime(int n) {
		
		if (n==2) return true;
		if (n%2 ==0) return false;
		
		for (int i = 3; i < (n-1); i+=2) {
			
			if (n%i == 0) {
			
				return false;
			}
			
			
		} 
		return true; 
		
		
	} */
	
		
		
				
				
				
		
		
		
}
	
				

		
	