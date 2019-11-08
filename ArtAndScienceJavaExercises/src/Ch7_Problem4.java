import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */

public class Ch7_Problem4 extends ConsoleProgram {
	
	
	public void run() {
	this.setFont("Helvetica-30");
		
		
		println(myRuntime.freeMemory());
		
		myRuntime.gc();
		
		
	}
	
	Runtime myRuntime = Runtime.getRuntime();
	
	
	
	
}