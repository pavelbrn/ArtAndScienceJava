import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*See problem 1 
 *See Problem 2
 * 
 *
 * 
 * 
 * 
 * */

public class Ch10_Problem2 extends ConsoleProgram {
	
	public void run() {
		setFont("Helvetica-40");
		
		scores();
		lowNumber();
		highNumber();
		meanArray();
		mean(scores);
	}
	
	public double mean(double[] a) {
		double meanArray = 0;
		
		for (int i = 0; i<=a.length-1; i++) {
			meanArray = meanArray + a[i];
			
		}
		meanArray = meanArray/7;
		println(meanArray);
		return meanArray;
	}
	
	private void meanArray(){
		
		double avg = 0;
		for (int i=0; i<=6; i++) {
			avg= avg + scores[i];
		}
		
		//remove the highest number and lowest number from the meanArray:
		avg= (avg - lowestNum-highestNum)/5;
		println("Without the lowest and highest score, the average is: "+avg);
		
	}
	
	private void scores(){
		
		//an array with 7 elements(judges):
		
		
		//input scores into array:
		for (int i = 0; i <=6; i++) {
			double jScore = readDouble("Enter score: ");
			scores[i] = jScore;	
		}
		
	}
	
	private void lowNumber() {
		//initialize the lowestNum variable
		lowestNum = scores[0];
		
		//iterate through each element(score)
		//select the lowest one
		for (int i=0; i<=6; i++) {
			if(lowestNum > scores[i]) {
				lowestNum = scores[i];
			}
		}
		
		println(lowestNum);
	}
	
	
	private void highNumber() {
		highestNum = scores[0];
		
		for (int i= 0; i <= 6; i++) {
			if(highestNum<scores[i]) {
				highestNum = scores[i];
			}
		}
		println(highestNum);
	}
	
	
//declare a scores array as an instance variable:
double[] scores = new double[7];
private double lowestNum;
private double highestNum;
	
}