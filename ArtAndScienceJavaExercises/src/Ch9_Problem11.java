import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*enter large number
 * convert number into string
 * count 3 indeces from last index and set coma. 
 * repeat until all commas set. 
 * 
 * 
 * NOTE: Perhaps this program is too convoluted
 * and arrays would work better once we learn about them
 * in a later chapter?
 * 
 * */

public class Ch9_Problem11 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		num = readInt("Enter number: ");
		if (num>2000000000) {
			println("enter a number unter 1 000 000 000");
			run();
		}
		addCommas();
		run();
	
	}
	
	private void addCommas() {
		
		String stringNum= Integer.toString(num);
		
		
		
		int i=0;
		while (i<=stringNum.length()) {
				if (stringNum.length()==4) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(0,1); 
					 //temp2= stringNum.substring(0,);
					String tempComma = ",";
					 comma = temp2.concat(tempComma).concat(temp1);
							 //tempComma.concat(temp1);
					 
				} else if (stringNum.length()==5) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(0,2); 
					 //temp2= stringNum.substring(0,);
					String tempComma = ",";
					 comma = temp2.concat(tempComma).concat(temp1);
							 //tempComma.concat(temp1);
				}  else if (stringNum.length()==6) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(0,3); 
					 //temp2= stringNum.substring(0,);
					String tempComma = ",";
					 comma = temp2.concat(tempComma).concat(temp1);
							 //tempComma.concat(temp1);
				}
				
				else if (stringNum.length()==7) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(1,4); 
					String temp3= stringNum.substring(0,1);
					 
					String tempComma = ",";
					comma = temp3.concat(tempComma).concat(temp2).concat(tempComma).concat(temp1);
				
					 
				} else if (stringNum.length()==8) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(2,5); 
					String temp3= stringNum.substring(0,2);
					 
					String tempComma = ",";
					comma = temp3.concat(tempComma).concat(temp2).concat(tempComma).concat(temp1);
				
					 
				} else if (stringNum.length()==9) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(3,6); 
					String temp3= stringNum.substring(0,3);
					 
					String tempComma = ",";
					comma = temp3.concat(tempComma).concat(temp2).concat(tempComma).concat(temp1);
				
					 
				}
				else if(stringNum.length()==10) {
					String temp1= stringNum.substring(stringNum.length()-3,stringNum.length());
					String temp2 = stringNum.substring(1,4); 
					String temp4 = stringNum.substring(4,7);
					String temp3= stringNum.substring(0,1);
					
					String tempComma = ",";
					comma = temp3.concat(tempComma).concat(temp2).concat(tempComma).concat(temp4).concat(tempComma).concat(temp1);
					
				}
				 
				 
				 
			
			
			
			i++;
		}
		println(comma);
	}
	
	private int num;
	private String comma;
}