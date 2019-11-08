import acm.program.*;
import acm.util.*;
import java.awt.Color;

import acm.graphics.*;

/*1. Ask 5 questions w constants that can be changed.
2. Each question randomly adds or subtracts numbers.
3. Answers cant be less than 0
4. program allows 3 tries, if they fail then proceed to next question
5. Offer 5 different encouragement types for correct answers.
* 
* 
* */


public class Ch7_Problem3 extends ConsoleProgram {
		
	//Number Generation:
			//random generate 2 numbers within Interval CONSTANT1 & CONSTANT2
			//Choose greater number
			// use ivars highNum = higher number lowNum= lower number.
			//convert lowNum randomly into negative or positive
		
		//Formula:
			// x = highNum + lowNum
		
		//Student enters Answer = answer;
		//Iterate 3 times for correct answer
		//If 3 iterations incorrect then move to next question
		//If correct choose from 1 of 5 congratulatory messages.
		//    using random Switch method.
		
		//run program 5 times.
		
		
		
		
		//Static variables that give the range of the addition/subtraction.
		public static final int LOW_RANGE = 1;
		public static final int HIGH_RANGE = 20;
		
		
		public void run() {
			setFont("Helvetica-40");
			
			
			println("Welcome to the MathSim!");
			int i=0;
			while (i<10) {
				numGen();
				studentCalculation();
				i++;
			}
			
			
		}
		
		private void studentCalculation(){
			String symbol = "";
			if (lowNum>0){
				symbol = " + ";
			}
			
			String octConvertHigh = Integer.toString(highNum);
			/* This code was part of the debugging process:
			println(highNum);
			println(octConvertHigh); */
			int octHigh = Integer.parseInt(octConvertHigh,8);
			//println(octHigh);
			
			String octConvertLow = Integer.toString(lowNum);
			int octLow = Integer.parseInt(octConvertLow,8);
			
			
			int answer = octHigh + octLow;
			//println("answer1: " +answer);
			String octAnswer1 = Integer.toOctalString(answer);
			//println(octAnswer1);
			
			int octAnswer = Integer.parseInt(octAnswer1);
			
			//int answer = highNum + lowNum;
			int studentAnswer = readInt("What is " + highNum +" " + symbol + lowNum+ " in base 8? ");
			
			int c = 0;
			
			if (studentAnswer == octAnswer) {
				println(correctAnswer());
			}
			
			while (studentAnswer != octAnswer && c<3) {
				c++;
				studentAnswer = readInt("Incorrect - Try again: ");
				if (c==3) {
					println("The correct answer was: " + octAnswer);
				} else if(studentAnswer == octAnswer) {
					println(correctAnswer());
				}
			} 
			
			
			
		}
		
		private String correctAnswer() {
			int correct = rgen.nextInt(1,5);
			switch (correct) {
			case 1: return ("That's right, great job!");
			case 2: return ("Good work, you are right!");
			case 3: return ("Good Answer!");
			case 4: return ("Keep up the good work!");
			case 5: return ("Perfect answer!");
			default: return ("Correct!");
			
			}
		}
		
		//Method numGen
		private void numGen() {
			int n1 = rgen.nextInt(LOW_RANGE,HIGH_RANGE);
			int n2 =rgen.nextInt(LOW_RANGE,HIGH_RANGE);
			
			if (n1>=n2) {
				highNum = n1;
				lowNum  = n2;
			} else {
				highNum= n2;
				lowNum=  n1;
			}
			
			if (subtract()) {
				lowNum= -1 * lowNum;
			}
			
		}
		
		//Predicate method subtract:
		private boolean subtract() {
			return rgen.nextBoolean(0.5);
		}
		
		
		//rgen is a new object and it calls a method.
		RandomGenerator rgen = new RandomGenerator();
		
		//ivars.
		private int highNum;
		private int lowNum;
		
		
		
		
	}
	
	
	
	
