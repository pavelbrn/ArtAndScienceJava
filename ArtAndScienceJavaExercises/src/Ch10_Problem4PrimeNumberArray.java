import acm.program.*;
import acm.util.*;
import java.awt.Color;
import java.awt.List;

import acm.graphics.*;
import java.util.ArrayList;

/*use a dynamic array(ArrayList) because you need to use the remove method
 * 
 * create an array with 1000 elements
 * check each number in array if divisible by n+1
 * remove elements that are not prime
 * print new array.
 * 
 * NOTE:
 * import java.util.ArrayList;
 * otherwise arrays will not work:
 * 
 * 
 * */

public class Ch10_Problem4PrimeNumberArray extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		setElements();
		checkNum();
		checkArray();
		
	}
	
	private void checkArray() {
		
		eratos.remove(0);
		for(int i =0; i<=eratos.size()-1; i++) {
			
			println(eratos.get(i));
			
		}
		
	}
	
	public void checkNum() {
	
		/*the element inside the array can not be equal to n.
		 * Otherwise the array element will be removed.
		 * */
		for (int i=3; i<=eratos.size()-1; i++) {
			if(eratos.get(i)%n==0 && eratos.get(i)!=n) {
				
				//println(eratos.get(i));
				eratos.remove(i);
				
			}		
		}
		//this method calls upon itself to iterate through 
		//ivar n times.
		while(n<eratos.size()) {
			n++;
			checkNum();
			
		}
	
	}
		
	//add 1000 elements to the array eratos:
	public void setElements() {
		
		
		for (int i=0; i<=999; i++) {
			
			//At index i add the same number i;
			eratos.add(i, i+1);
		}
		
	}
	
//declare an ArrayList instance variable:
private ArrayList<Integer> eratos = new ArrayList<>();

//instance variable that begins the iteration of the array set.
private int n=2;	



}


