import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*create an array readData
 * enter a set of numbers
 * 
 * tally the entered numbers into readData
 *
 *create histogramm array
 *print the combination of the two arrays: histo+readData on every line.
 *
 * 
 * */

public class Ch10_Problem6Histogram extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		enterNumbers();
		
		
	}
	
	private void ranges() {
		
				 
		String[] histo1= 
			{"0-9    |",    //i=0
			 "10-19  |",	//i=1	
			 "20-29  |",    //i=2
			 "30-39  |",	//i=3
			 "40-49  |",
			 "50-59  |",
			 "60-69  |",
			 "70-79  |",
			 "80-89  |",
			 "90-99  |",    //...
			 "100    |"		//i=10
			};
		
		histo = histo1;
		
		
	}
	
	
	private void enterNumbers(){
		
		/*
		int tally1=0;
		int tally2=0;
		int tally3=0;
		int tally4=0;
		int tally5=0;
		int tally6=0;
		int tally7=0;
		int tally8=0;
		int tally9=0;
		int tally10=0;  */
		
		//Instead of writing the above tally, just create an array of tally.
		int[] tally= new int[11];
		//int temp = 0;
		for(int i=0; i<=10; i++) {
			int num= readInt("Enter Number: ");
			if(num>=0 && num<=9) {
				tally[0] = tally[0] + 1;
				readData[0]=tally[0];
			}
			if(num>=10 && num<=19) {
				tally[1] = tally[1] + 1;
				readData[1]=tally[1];
			}
			if(num>=20 && num<=29) {
				tally[2] = tally[2] + 1;
				readData[2]=tally[2];
			}
			if(num>=30 && num<=39) {
				tally[3] = tally[3] + 1;
				readData[3]=tally[3];
			}
			if(num>=40 && num<=49) {
				tally[4] = tally[4] + 1;
				readData[4]=tally[4];
			}
			if(num>=50 && num<=59) {
				tally[5] = tally[5] + 1;
				readData[5]=tally[5];
			}
			if(num>=60 && num<=69) {
				tally[6] = tally[6] + 1;
				readData[6]=tally[6];
			}
			if(num>=70 && num<=79) {
				tally[7] = tally[7] + 1;
				readData[7]=tally[7];
			}
			if(num>=80 && num<=89) {
				tally[8] = tally[8] + 1;
				readData[8]=tally[8];
			}
			if(num>=90 && num<=99) {
				tally[9] = tally[9] + 1;
				readData[9]=tally[9];
			}
			if(num==100) {
				tally[10] = tally[10] + 1;
				readData[10]=tally[10];
			}
		}
		
		ranges();
		 for (int i = 0; i<=10;i++) {
			 println(histo[i]+readData[i]);
		 }
	
		
	}
	
private String[] histo = new String[11];
private int[] readData=new int[11];
}