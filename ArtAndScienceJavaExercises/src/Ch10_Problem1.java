import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*declare an array with 7 indexes
 * input score into all 7 indexes
 * 
 * check each index if its smaller than the next one
 * if smaller then save into IVAR
 * if larger, then save the smaller index in IVAR
 * 
 * check each index if its larger than the next one
 * if larger then save into IVAR
 * if smaller, then save the larger index in IVAR
 * 
 * remove smallest score and largest score.
 * 
 * calculate average of all leftover scores.
 * 
 * */

public class Ch10_Problem1 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		
		scores();
		lowNumber();
		highNumber();
		average();
	}
	
	private void average(){
		
		double avg = 0;
		for (int i=0; i<=6; i++) {
			avg= avg + scores[i];
		}
		
		//remove the highest number and lowest number from the average:
		avg= (avg - lowestNum-highestNum)/5;
		println(avg);
		
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