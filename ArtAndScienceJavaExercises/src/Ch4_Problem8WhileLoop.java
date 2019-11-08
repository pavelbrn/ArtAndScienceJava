import acm.program.*;

/*This program uses a while loop instead of a for loop
 * to do a countdown*/
public class Ch4_Problem8WhileLoop extends ConsoleProgram {

	private static final int START = 10;
	
	public void run() {
		
		int t = START;
		
		while(t>0) {
			t--;
			println(t);
			
		}
		
		//this program worked, its time for a break
		println("Liftoff! Time for coffee");
		
	}
	
	
}
