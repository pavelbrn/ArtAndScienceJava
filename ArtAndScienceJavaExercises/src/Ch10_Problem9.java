import acm.program.*;
import acm.util.*;
import java.awt.Color;
import java.util.ArrayList;
import acm.graphics.*;
import java.awt.List;
/*How to initialize 2d arrays:
 * 
 * String[][] names = { 
				{"Sam", "Smith"}, 
				{"Robert", "Delgro"}, 
				{"James", "Gosling"}, 
				};
		
		int[][] num = { 
				{1,2,3}, 
				{1,2,3}, 
				{1,2,3}
				};
	
 * 
 * 
 * */

public class Ch10_Problem9 extends ConsoleProgram {
	
	
	public void run() {
		setFont("Helvetica-40");
		fillArray();
		checkWinner();
		run();
	}
	
	//fill array:
	public void fillArray() {
		
		
		
		for(int row = 0; row<3; row++) {
			//checkWinner();
			String fill = readLine("");
			for(int col=0; col<3;col++) {
				char xo = fill.charAt(col);
				String xoString = Character.toString(xo);
				
				//this line places an x or o at the coordinate ticTac[x][y] in the 2d array!
				ticTac[row][col] = xoString;
				
				//println(ticTac[row][col]);
			}
		}
	
		
	}
	
	public boolean checkWinner() {
		
		// array[row][col]
		
		if( ticTac[0][0].equals("x") &&  ticTac[0][1].equals("x") && ticTac[0][2].equals("x")) {
			println("Player X wins!");
			return true;
			//row 1: XXX
		} 	else if(ticTac[1][0].equals("x")&&ticTac[1][1].equals("x") && ticTac[1][2].equals("x")) {
			println("Player X wins!");
			return true;
			//row 2: XXX
			} else if(ticTac[2][0].equals("x")&&ticTac[2][1].equals("x") && ticTac[2][2].equals("x")) {
			println("Player X wins!");
			return true;

			//X				x
			//X				x
			//X				x
			//column 0		column 1
			} else if(ticTac[0][0].equals("x")&&ticTac[1][0].equals("x") && ticTac[2][0].equals("x")) {
			println("Player X wins!");
			return true;
			} else if(ticTac[0][1].equals("x")&&ticTac[1][1].equals("x") && ticTac[2][1].equals("x")) {
			println("Player X wins!");
			return true;
			}  else if(ticTac[0][2].equals("x")&&ticTac[1][2].equals("x") && ticTac[2][2].equals("x")) {
			println("Player X wins!");
			return true;
			}  
			//diagonal X:
			else if(ticTac[0][0].equals("x")&&ticTac[1][1].equals("x") && ticTac[2][2].equals("x")) {
			println("Player X wins!");
			return true;
			}  else if(ticTac[2][0].equals("x")&&ticTac[1][1].equals("x") && ticTac[0][2].equals("x")) {
			println("Player X wins!");
			return true;
			}
		
		
		
		
		else 
		
		println("no x");
		return false;
		
		
	}

	
	//method to check array for winning combinations:
	
	

//create 2d array as an instance variabel with 3x3 Elements.
	String[][] ticTac = new String[3][3]; 
	String x = "x";
	char ex = 'x';
}

