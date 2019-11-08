import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*Problem 3 builds on problem 1 and 2.
 * 
 *Standard deviation:
 * square of(difference between each data value and mean).
 * sum these vaules
 * 
 * take the sum and divide it by number of elements
 * 
 * take the square root of the above result.
 * 
 * 
 * 
 * 
 * */

public class Ch10_Problem3StandardDeviation extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		scores();
		lowNumber();
		highNumber();
		meanArray();
		mean(scores);
		stdev(scores);
	}
	
	public double stdev(double[] b) {
		
		
		double sum = 0;
		for (int i=0; i<= b.length - 1; i++) {
			sum = sum+ Math.pow(meanArray-scores[i], 2);
		}
		double standardDeviation = Math.sqrt(sum/scores.length); 
		println("The standard Deviation is: "+standardDeviation);
		return standardDeviation;
	}
	
	
	//enter an array of int
	//calcutes the mean of that array.
	public double mean(double[] a) {
		meanArray = 0;
		
		for (int i = 0; i<=a.length-1; i++) {
			meanArray = meanArray + a[i];
			
		}
		meanArray = meanArray/7;
		println("The mean is: "+meanArray);
		return meanArray;
	}
	
	//calculates the mean of an array without the highest and lowest score
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
		
		//scores is an IVAR array with 7 elements(judges):
		
		
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
	
	
//declare a scores array as an instance variable with 7 elements(judges):
double[] scores = new double[7];
private double lowestNum;
private double highestNum;
private double meanArray;
}