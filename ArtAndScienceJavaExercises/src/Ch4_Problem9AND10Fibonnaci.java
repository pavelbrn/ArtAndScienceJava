import acm.program.*;

/* This program counts the Fibonnaci sequence.
Fn = F(n-1) + F(n-2) = previous number + pre-previous number
*/


public class Ch4_Problem9AND10Fibonnaci extends ConsoleProgram {

	public void run() {
		
	int n0= 0;
	int n1= 1;
	int sequence= 0;
	println(n0);
	println(n1);
	
	for(int i = 0; i<100; i++) {
		
		sequence = n0 + n1;
		n0 = n1;
		n1=sequence;
		
		println(n1);
		
	}
		
		
		 
		 
		
	}
	
	
	
}

//


