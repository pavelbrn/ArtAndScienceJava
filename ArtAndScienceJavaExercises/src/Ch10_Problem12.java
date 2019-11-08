import acm.program.*;
import acm.util.*;
import java.awt.Color;
//import java.util.ArrayList;
import acm.graphics.*;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
/*This is the Magic square:
 * 
 * create a 3x3 array
 * sum each side of array 
 * write boolean to test if all sides add up to 15
 * 
 * 
 * */

public class Ch10_Problem12 extends ConsoleProgram {
	
	
	public void run() {
		//set the font
		setFont("Helvetica-40");
		
		
		//fill the array
		fillArray();
		
		//sum up all sides 
		SumOfSides();
		
		//check if all of the sides in the magic square array equal 15: 
		checkSides(mSqr);
		
		//I used this for debugging purposes only:
		//showSides();
		
	}
	
	//for debugging purposes:
	public void showSides() {
		
		println(sumRight0);
		println(sumRight1);
		
		println(sumRight2);
		println(sumBottom0);
		println(sumBottom1);
		println(sumBottom2);
		println(sumDiagonalUp);
		println(sumDiagonalDown);
		
		
	}
	
	public void SumOfSides() {
		sumRight0 = mSqr[0][0] + mSqr[0][1] + mSqr[0][2];
		sumRight1 = mSqr[1][0] + mSqr[1][1] + mSqr[1][2];
		sumRight2 = mSqr[2][0] + mSqr[2][1] + mSqr[2][2];
		
		sumBottom0 =mSqr[0][0] + mSqr[1][0] + mSqr[2][0];
		sumBottom1 =mSqr[0][1] + mSqr[1][1] + mSqr[2][1];
		sumBottom2 =mSqr[0][2] + mSqr[1][2] + mSqr[2][2];
		
		sumDiagonalUp = mSqr[2][0] + mSqr[1][1]+ mSqr[0][2];
		
		sumDiagonalDown = mSqr[0][0] + mSqr[1][1] + mSqr[2][2];
		
	}
	
	/*This predicate method checks if the sides
	  of the array add up to 15: */
	
	public boolean checkSides(int[][] myArray) {
		
		if (sumRight0 ==15 && sumRight1 ==15&& sumRight2==15 && sumBottom0==15&& sumBottom1==15&&
			 sumBottom2==15&& sumDiagonalUp==15&&sumDiagonalDown==15) {
			println("True, this is a Magic Square");
			return true;
		} else {
			println("False, the sides do not equal 15");
			return false;
		}
		
	}
	
	public void fillArray() {
			
		int num =0;
		for(int row=0; row <3; row++) {
			
			for (int col=0; col<3; col++) {
				num=readInt("");
				mSqr[row][col]=num;
			}
		}
		
		/*Test array values here to see
		 * if they were entered correctly.
		 */
		//println(mSqr[1][2]); //should be 6
		//println(mSqr[2][0]); //should be 7
		
	}
	
	
	//instance variables: 
	int[][] mSqr= new int[3][3];
	
	List<List<Integer>> new1 = new ArrayList<>();
	
	private int sumRight0;
	private int sumRight1;
	private int sumRight2;
	private int sumBottom0;
	private int sumBottom1;
	private int sumBottom2;
	
	private int sumDiagonalUp;
	private int sumDiagonalDown;
	
	
	
}