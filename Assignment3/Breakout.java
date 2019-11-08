
import acm.program.*;
import acm.util.*;
import java.awt.Color;
import java.awt.event.*;
import acm.graphics.*;
import java.awt.*;

 public class Breakout extends GraphicsProgram{
	// Dimensions of the canvas, in pixels
		// These should be used when setting up the initial size of the game,
		// but in later calculations you should use getWidth() and getHeight()
		// rather than these constants for accurate size information.
		
		//CHANGES MADE: CANVAS_WIDTH and CANVAS_HEIGHT changed from DOUBLE to INT
		public static final int CANVAS_WIDTH = 1000;
		public static final int CANVAS_HEIGHT = 1200;

		// Number of bricks in each row
		public static final int NBRICK_COLUMNS = 10;

		// Number of rows of bricks
		public static final int NBRICK_ROWS = 10;

		// Separation between neighboring bricks, in pixels
		public static final double BRICK_SEP = 4;

		// Width of each brick, in pixels
		public static final double BRICK_WIDTH = Math.floor(
				(CANVAS_WIDTH - (NBRICK_COLUMNS + 1.0) * BRICK_SEP) / NBRICK_COLUMNS);

		// Height of each brick, in pixels
		public static final double BRICK_HEIGHT = 8;

		// Offset of the top brick row from the top, in pixels
		public static final double BRICK_Y_OFFSET = 70;

		// Dimensions of the paddle
		public static final double PADDLE_WIDTH = 60;
		public static final double PADDLE_HEIGHT = 10;

		// Offset of the paddle up from the bottom 
		public static final double PADDLE_Y_OFFSET = 30;

		// Radius of the ball in pixels
		public static final double BALL_RADIUS = 10;

		// The ball's vertical velocity.
		public static final double VELOCITY_Y = 3.0;

		// The ball's minimum and maximum horizontal velocity; the bounds of the
		// initial random velocity that you should choose (randomly +/-).
		public static final double VELOCITY_X_MIN = 1.0;
		public static final double VELOCITY_X_MAX = 3.0;

		// Animation delay or pause time between ball moves (ms)
		public static final double DELAY = 1000.0 / 60.0;

		// Number of turns 
		public static final int NTURNS = 10;
	 
	 public void run() {
		 
		 setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
		 turns();
		 keepScore();
		 waitForClick();
		 createBricks();
		 add(newPaddle());
		 addMouseListeners();
		 add(newGOval());
		
		 playBall();
		 
		 
		
		
	 }
	 

	 public GObject getCollidingObject() {
		 
		
		 //returns a gobj with the following x,y to the collider when the ball hits the rectangles.
		 if(vy<0) {
			 
			 //gobj becomes the ELEMENT at the ball coordinates.
			 gobj = getElementAt(ball.getX(),ball.getY());
			 return gobj;
		 }
		 else {
		//returns a gobj with the following x and y to the collider when the ball hits the paddle.
			 gobj = getElementAt(ball.getX()+ball.getWidth(),ball.getY()+ball.getHeight());
				
				 return gobj;
		 }
		 
		
		 
	 }
	
	 private void ballCollision() {
		 getCollidingObject();
		 GObject collider = getCollidingObject();
		 if(collider ==paddle ) {
			 vy=-vy;
			 MediaTools.loadAudioClip("bounce.au").play();
		
		 //omits collisions with gameScore and gameTurns labels:
		 } else if (collider==gameScore||collider ==gameTurns) {
			 vy=vy;
			 
		//removes objects that have same coordinates as the ball:
		 } else if(collider !=null) {
			 
			 score++;
			 vy=-vy;
			 remove(gobj);
		 } 
	 }
	 
	 public GLabel keepScore() {
		 gameScore = new GLabel("score: "+score,250,50);
		 gameScore.setFont("Helvetica-35");
		 gameScore.sendBackward();;
		 //gameScore.setLabel("score: "+ score);
		 add(gameScore);
		 return gameScore;
	 }
	 
	 public GLabel turns() {
		 gameTurns = new GLabel("turns: "+turns,50,50);
		 gameTurns.setFont("Helvetica-35");
		 gameTurns.sendBackward();
		// gameTurns.setLabel("turns: "+ turns);
		 add(gameTurns);
		 return gameTurns;
	 }
	 
	 public void playBall() {
		 vx= rgen.nextDouble(1,3);
		 vy= 3;
		 if(rgen.nextBoolean(0.5)) {
			vx=-vx;
		 }
		 turns = NTURNS;
		 while(true) {
			 
			 ballCollision();
			 moveBall();
			 pause(3);
			 gameScore.setLabel("score: "+ score);
			 
			 
			 if (ball.getY()>1300) {
				ball.setLocation(500,500);
				turns--;
				gameTurns.setLabel("turns:" + turns);
				
				
				 //turns = NTURNS;
				 if (turns ==0) {
					 
					
					 pause(200);
					 
					 
					 GLabel gameOver= new GLabel("Game Over! Click to play again!", 200, CANVAS_HEIGHT/2);
					 gameOver.setFont("Helvetica-40");
					 add(gameOver);
					 waitForClick();
					 
					 turns= NTURNS;
					 score=0;
					 removeAll();
					 run();
				 }
				 
				
				
			 } 
			 if(score == 100) {
				 
				 GLabel gameWon= new GLabel("You Win! Click to play again!", 200, CANVAS_HEIGHT/2);
				 gameWon.setFont("Helvetica-40");
				 add(gameWon);
				 waitForClick();
				 
				 score=0;
				 removeAll();
				 run();
			 }
			 
		 } 
		 
	 }

	 
	 public void moveBall() {
		 ball.move(vx, vy);
		 
		 //bounce ball off the sides:
		 if(ball.getX()>=60+CANVAS_WIDTH-4*ball.getWidth()&&vx>0||ball.getX()<=0&&vx<0) {
			 vx=-vx;
			 //vy=-vy;
		 }
		 //bounce ball from the top of screen.
		 if(ball.getY()<=0&&vy<0) {
			 vy=-vy;
		 }
		
	 }
	 
	 
	 
	 public GOval newGOval() {
		 ball = new GOval(400,400, 3*BALL_RADIUS, 3*BALL_RADIUS);
		 ball.setFilled(true);

		 return ball;
	 }
	 
	 
	 public void createBricks() {
		 for (int i = 0; i< NBRICK_COLUMNS; i++) {
			 
			 for (int j = 0; j< NBRICK_ROWS; j++ ) {
				 
				 if(j==1 || j==2) rect.setFillColor(Color.red);
				 if(j==3 || j==4) rect.setFillColor(Color.orange);
				 if(j==5 || j==6) rect.setFillColor(Color.yellow);
				 if(j==7 || j==8) rect.setFillColor(Color.green);
				 add(addRect(BRICK_WIDTH*i + i*BRICK_SEP, j*NBRICK_ROWS + BRICK_Y_OFFSET));
			 }
			 
		 }
	 }
	 
	 public void mousePressed(MouseEvent e) {
		
		 lastX= e.getX();
		 lastY = e.getY();
		 gobj2 = getElementAt(lastX,lastY);
	 }
	 

	 public void mouseMoved(MouseEvent e) {
		 		if (gobj2 !=null && e.getX()<870 && e.getX()>50) {
				 gobj2.move(e.getX()-lastX, 0);
						 lastX=e.getX();
						 lastY=e.getY();
		 } //println(gobj);
	 }
	 
	 
	 
	 public GRect newPaddle() {
		 
		 paddle = new GRect(500, getHeight() - PADDLE_Y_OFFSET, 3*PADDLE_WIDTH, 4*PADDLE_HEIGHT);
		 paddle.setFilled(true);
		 paddle.setColor(Color.black);
		 
		 return paddle;
	 }
	 
	 public GRect addRect(double x, double y) {
		 
		 //rect.setBounds(x, y,BRICK_WIDTH,BRICK_HEIGHT);
		 
		 rect = new GRect(x, y,BRICK_WIDTH,BRICK_HEIGHT);
		 rect.setFilled(true);
		 rect.setColor(Color.white);
		 rect.setFillColor(Color.CYAN);
		 return rect;
		 
	 }

	
	
	 private GRect rect;
	 private GObject gobj;
	 private GObject gobj2;
	 private GObject gobj3;
	 private GOval ball;
	 private int lastX;
	 private int lastY;
	 
	 private GRect paddle;
	 
	 private GLabel gameScore;
	 private GLabel gameTurns;
	 private int score;
	 private int turns = NTURNS;
	 private double vx;
	 private double vy;
	 RandomGenerator rgen = new RandomGenerator();
}
 
 
 
 
 
 
 /*
public void mouseMoved(MouseEvent e) {
	 gobj = getElementAt(e.getX(),e.getY());
	 println(gobj);
	 
	 if (gobj!=null) {
		remove(gobj);
	 } 
 }
 */
 
 //private GObject gobj;
