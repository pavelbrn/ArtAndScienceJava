import acm.program.*;


public class Ch4_Problem2ThisOldMan extends ConsoleProgram {

	/* This is a song
	 * that is repeated 10 times
	 * It has 2 modified lines, one is an integer variable "i"
	 * and the other is a string variable "rhyme", 
	 * the string depends on the integer.*/
	
	
	
	String rhyme = "thumb";
	//IF you leave the rhyme variable  empty "", then "null" will be automatically printed instead! 
	
	public void run() {
		
		//for Loop with 10 numbers: The for loop contains the song lyrics and is repeated 10  times
		
		for (int i = 1 ; i < 11; i++) {
		
			/*I put the IF statements initially 
			 * BEHIND the println statements and the poem
			 * was off by 1. */
			if (i==2) {
				rhyme = "shoe";
			} else if (i==3) {
				rhyme = "knee";	
			} else if (i==4) {
				rhyme = "door";
			} else if (i==5) {
				rhyme = "hive";
			} else if (i == 6) {
				rhyme = "sticks";
			} else if (i == 7) {
				rhyme = "up to heaven";
			} else if (i == 8) {
				rhyme = "pate";
			} else if (i == 9) {
				rhyme = "spine";
			}else if (i == 10) {
				rhyme = "shin";
				
			}
			
			println("This old man, he played " + i) ;
			println("He played knick-knack on my " + rhyme );
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old myn came rolling home.");
			println("");
			
			
		/*Depending on the number in the first verse,
		 * the rhyming word in the string variable "rhyme" 
		 * will change accordingly */	
			
			
			
					
			
			
			
			
		}
		
	}
	
	
}
