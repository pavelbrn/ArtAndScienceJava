import acm.program.*;

import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*
 * 
 * 
 * */



public class Ch6_Problem7 extends ConsoleProgram {
	
public void run() {
	//This program uses the "Cards" class.
	setFont("Helvetica-40");
	
	println("This program generates a random card");
	
	generateCard();

	
	
	
	
}

private void generateCard() {
	int i=1;
	while(i<100) {
		i++;
		int x =readInt("Generate card? 1=yes 2= exit: ");
		if (x==1) {
		newCard.getSuit();
		newCard.getRank();
		
		println(newCard.toString());
	} else if(x==2) {
		println("Thank you for playing!");
		break;
	}
	}
	
}

Card newCard = new Card(0,0);

	
}