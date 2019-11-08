import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * To finish the checkers program replace the null values in the array
 * otherwise program is complete. 
 */


public class Ch10_Problem10 extends ConsoleProgram {
	
	
public void run() {
		setFont("Helvetica-40");
    
		displayCheckerboard(setBoard());	
		
	}
	
	private String[][] setBoard() {
		
		
		for (int row = 0; row<8; row++) {
				
			for (int col =0; col<8; col++) {
				
				if (row == 0 && col %2 ==0) {
					
					cBoard[row][col]= "  ";
					
				} else if (row==0 && col%2!=0) {
					cBoard[row][col]= "b";
				
				}else if (row==1 && col %2!=0) {
					cBoard[row][col]= "  ";
				}  else if (row==1 && col%2==0) {
					cBoard[row][col]= "b";
				
				} else if (row ==2&& col%2 !=0) {
					cBoard[row][col]= "b";
				} else if( row == 2 && col%2 ==0) {
					cBoard[row][col]= "  ";
				} else if (row ==3&& col%2 ==0) {
					cBoard[row][col]= " -";
				} else if( row == 3 && col%2!=0) {
					cBoard[row][col]= "  ";
				}
				//....continue here...
			}
			
		}
		return cBoard;
	}
	
	private void displayCheckerboard(String board[][]) {

		for (int row=0; row<8; row++) {
			for (int col=0;col<8; col++) {
				print(board[row][col]);
				//println("");
			}
			println();
		}

	}
	
	String cBoard[][] = new String[8][8];

}