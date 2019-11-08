/* 
 * Note: these methods are public in order for them to be used by other files
 * in this assignment; DO NOT change them to private.  You may add additional
 * private methods to implement required functionality if you would like.
 * 
 * You should remove the stub lines from each method and replace them with your
 * implementation that returns an updated image.
 */

// TODO: comment this file explaining its behavior

import java.util.*;
import acm.graphics.*;

public class ImageShopAlgorithms implements ImageShopAlgorithmsInterface {

	public GImage flipHorizontal(GImage source) {
		int[][] pixels = source.getPixelArray();
		//create a copy of the pixel array but with r and c reversed:
		//"results" is an empty array:
		int[][] result = new int[pixels.length][pixels[0].length];
		
		//for every row and column in result, fill data from pixels array:
		 for (int r =0; r<result.length; r++) {
			 for (int c=0; c< result[0].length;c++) {
				
				 //rows stay the same
				 //REMEMBER: Here you equate the coordinates as a whole with each other, NOT individual
				 // rows to columns!
				 result[r][c] = pixels[r][pixels[0].length-1-c];		
				
				 
		 }
	}
		 source = new GImage(result); 
			return source;
		 
		 
	
	}

	  //pixels.length is the number of rows
	   //pixels[0].length is Number of columns in that row
	 public GImage rotateLeft(GImage source) {
			int[][] pixels = source.getPixelArray();
			//create a copy of the pixel array but with r and c reversed:
			//"results" is an empty array:
			int[][] result = new int[pixels[0].length][pixels.length];
			
			//for every row and column in result, fill data from pixels array:
			 for (int r =0; r<result.length; r++) {
				 for (int c=0; c< result[0].length;c++) {
					
					 //REMEMBER: Here you equate the coordinates as a whole with each other, NOT individual
					 // rows to columns!
					 result[r][c] = pixels[c][pixels[0].length-1-r];		
				 }
			 }
			 source = new GImage(result); 
				return source;
			 
	}

	public GImage rotateRight(GImage source) {
		int[][] pixels = source.getPixelArray();
		//create a copy of the pixel array but with r and c reversed:
		//"results" is an empty array:
		int[][] result = new int[pixels[0].length][pixels.length];
		
		//for every row and column in result, fill data from pixels array:
		 for (int r =0; r<result.length; r++) {
			 for (int c=0; c< result[0].length;c++) {
				
				 //column in original image = row in new image
				 //REMEMBER: Here you equate the coordinates as a whole with each other, NOT individual
				 // rows to columns!
				 result[r][c] = pixels[pixels.length-1-c][r];		
				
				 // 
		 }
	}
		 source = new GImage(result); 
			return source;
		 
		
	}

	public GImage greenScreen(GImage source) {
		int[][] pixels = source.getPixelArray();
		 
		 for (int r =0; r<pixels.length; r++) {
			 for (int c=0; c< pixels[r].length;c++) {
				 int px = pixels[r][c];
				 int red = GImage.getRed(px);
				 int green = GImage.getGreen(px);
				 int blue = GImage.getBlue(px);
				 int greenPix = Math.max(red, blue);
				
				 
				if (green >= 2*greenPix) {
					pixels[r][c]= GImage.createRGBPixel(red, green, blue,0);
				} 
				
				 
			 }
		 }
		
		source = new GImage(pixels); 
		return source;
	}
	
	
	
	//compute luminosity histogram of image
	//compute cumulative luminosity of image
	//use cumulative luminosity to modify each pixel to increase contrast
	
	
	public GImage equalize(GImage source) {
		int[][] pixels = source.getPixelArray();
		
		int[] luminosityHistogram = new int[256];
		int[] cumulativeHistogram = new int[256];
		
		ArrayList<Integer> lum = new ArrayList<>();
		//"results" is an empty array:
		int[][] result = new int[pixels.length][pixels[0].length];
	
		//for every row and column in result, fill data from pixels array:
		 for ( int r =0; r<result.length; r++) {
			 for ( int c=0; c< result[0].length;c++) {
			
							//int origin = pixels[r][c];
				 int px = pixels[r][c];
				 int red = GImage.getRed(px);
				 int green = GImage.getGreen(px);
				 int blue = GImage.getBlue(px);
				 
				 //calculate luminosity of pixel at r and c.
				 int pixLumin = computeLuminosity(red, green, blue);
				 
				 //input pixel luminosity into new Array
				 //called luminosityHistogram
				 //input pixel luminosity i(i.e 255), output: add 1 into index i(add 1 into index 255) to count ho many pisels have that luminosity.
				
				 //due to pass by reference, the luminosityHistogramm will be updated using this method.
				 createLuminosityHistogram(pixLumin, luminosityHistogram);
				 
				 
				 //input: take i from luminostyHistogram and add i-1 to it
				 //repeat until you reach the end.
				 //output: cumulative luminosoty histogramm.
				 createCumulativeHistogram(luminosityHistogram, cumulativeHistogram);
				 
				 //use cumul. histogram array
				 //calculate new RBG Value
				 //pixLumin is the starting pixel value
				  int rbg = (255*cumulativeHistogram[pixLumin]) / cumulativeHistogram[255];
				 
				  red = rbg;
				  green= rbg;
				  blue= rbg;
				 
									
				 result[r][c]= GImage.createRGBPixel(red, green, blue);
			 }

		 }
			source = new GImage(result); 
			return source;
		
	
	}
 
 public void createCumulativeHistogram(int[] inputArray, int[] outputArray ) {
	 //outputArray[0] = inputArray[0];
	for (int i=1; i<outputArray.length; i++) {
		
			outputArray[i]= inputArray[i]+outputArray[i-1];
		
		
	}
	 
	 
	 
 }
 
 public void createLuminosityHistogram(int pixel, int[] histogram) {
	 
	 histogram[pixel] += 1;
	 
 }
 
	
	

	

	public GImage negative(GImage source) {
		
		
		int[][] pixels = source.getPixelArray();
		 
		 for (int r =0; r<pixels.length; r++) {
			 for (int c=0; c< pixels[r].length;c++) {
				 int px = pixels[r][c];
				 int red = GImage.getRed(px);
				 int green = GImage.getGreen(px);
				 int blue = GImage.getBlue(px);
				 green = 255-green;
				 blue=255-blue;
				 red = 255 - red;
				 pixels[r][c]= GImage.createRGBPixel(red, green, blue);
				 
			 }
		 }
		 source = new GImage(pixels);
		 
		return source;
	}

	public GImage translate(GImage source, int dx, int dy) {
		int[][] pixels = source.getPixelArray();
		dx = -dx;
		dy= - dy;
		
		//"results" is an empty array:
		int[][] result = new int[pixels.length][pixels[0].length];
		
		 //cFinal and rFinal are the calculated coordinates
		 //of the pixels needed to be translated into the new array of "result".
		
		int rFinal=0;
		int cFinal=0;
		//for every row and column in result, fill data from pixels array:
		 for ( int r =0; r<result.length; r++) {
			 for ( int c=0; c< result[0].length;c++) {
				
				
			
				 
				
				 
				 if ((dx+c)%result[0].length < result[0].length && dx >=0) {
					 
					 cFinal = (c+dx)%result[0].length;
					 
				 } else if ( (dx+c)%result[0].length >= result[0].length ) {
					 
					 cFinal = (c+dx)%result[0].length-result[0].length;
					 
				 } else if (dx<0 && dx%result[0].length+c > 0) {
					 
					 cFinal = dx%result[0].length+c;
				
				 } else if ( dx%result[0].length+c <0) {
				
					 cFinal = c+dx%result[0].length+result[0].length;
				 }
				 
				 
				 
				 if ( (dy+r)%result.length < result.length && dy>=0) {
					
					 rFinal= (dy+r)%result.length;
					 
				 } else if ( (dy+r)%result.length >=result.length) {
					
					 rFinal= (dy+r)%result.length-result.length;
				
				 } else if (dy<0 && dy%result.length+r>0) {
				
					 rFinal = dy%result.length+r;
				 
				 } else if ( dy%result.length+r<0) {
				
					 rFinal = r+ dy%result.length+result.length;
				 }
				 
				 
				 result[r][c]=pixels[rFinal][cFinal]; 
				
		 }
	}
		
		 
		 	source = new GImage(result);
		 
			return source;
		 
		
	}

	public GImage blur(GImage source) {
		int[][] pixels = source.getPixelArray();
		
		//"results" is an empty array:
		int[][] result = new int[pixels.length][pixels[0].length];
	
		//for every row and column in result, fill data from pixels array:
		 for ( int r =0; r<result.length; r++) {
			 for ( int c=0; c< result[0].length;c++) {
				 /*	   check top left
					 * check top,
					 * check top right
					 * check right
					 * check bottom right
					 * check bottom
					 * chek bottomLeft
					 * check left
					 * */
							//int origin = pixels[r][c];
							   
						int  red = getAllRed(r,c,pixels);
									   
						int green = getAllGreen(r,c,pixels);
							   
						int blue = getAllBlue(r,c,pixels);
							  		
									
							 result[r][c]= GImage.createRGBPixel(red, green, blue);
			 }

		 }
			source = new GImage(result);
			 
			return source;
		 
	}
 
 
 //get red average of pixels around the origin pixel in clockwise rotation:
 public int getAllRed(int r, int c, int[][] originPix) {
	 int count =1;
	
	 int red= GImage.getRed(originPix[r][c]);
	
	 
	 //top left
	 if (r-1>=0 && c-1>=0) {
		 red +=GImage.getRed(originPix[r-1][c-1]);
		 
		 count++;
	 }
	 
	 //top
	 if (r-1 >=0) {
		 red = red+GImage.getRed(originPix[r-1][c]);
		 
		 count++;
	 }
	 
	 //top right
	 if (r-1>=0 && c+1<=originPix[0].length-1) {
		
		 red = red+GImage.getRed(originPix[r-1][c+1]);
		 
		 count++;
	 }
	 
	 //right
	 if (c+1<=originPix[0].length-1) {
			
		 red = red+GImage.getRed(originPix[r][c+1]);
		 
		 count++;
	 }
	 
	 //Bottom Right
	 if (r+1 <= originPix.length-1 &&c+1<=originPix[0].length-1) {
			
		 red = red+GImage.getRed(originPix[r+1][c+1]);
		 
		 count++;
	 }
	 
	 //bottom 
	 
	 if (r+1 <= originPix.length-1) {
			
		 red = red+GImage.getRed(originPix[r+1][c]);
		 
		 count++;
	 }
	 
	 
	 //bottom left
	 
	 if (r+1 <= originPix.length-1 && c-1 >=0) {
			
		 red = red+GImage.getRed(originPix[r+1][c-1]);
		 
		 count++;
	 }
	 
	 if (c-1>=0) {
		 red = red+GImage.getRed(originPix[r][c-1]);
		 
		 count++;
	 }
	 
	 return red/count;
	 
 }

 
 //Get green average:
 public int getAllGreen(int r, int c, int[][] originPix) {
	 int count =1;

	 int green = GImage.getRed(originPix[r][c]);
	
	 if (r-1>=0 && c-1>=0) {
		 green = green+GImage.getGreen(originPix[r-1][c-1]);
		 
		 count++;
	 }
	 
	 //top
	 if (r-1 >=0) {
		 green = green+GImage.getGreen(originPix[r-1][c]);
		 
		 count++;
	 }
	 
	 //top right
	 if (r-1>=0 && c+1<=originPix[0].length-1) {
		
		 green = green+GImage.getGreen(originPix[r-1][c+1]);
		 
		 count++;
	 }
	 
	 //right
	 if (c+1<=originPix[0].length-1) {
			
		 green = green+GImage.getGreen(originPix[r][c+1]);
		 
		 count++;
	 }
	 
	 //Bottom Right
	 if (r+1 <= originPix.length-1 &&c+1<=originPix[0].length-1) {
			
		 green =green+GImage.getGreen(originPix[r+1][c+1]);
		 
		 count++;
	 }
	 
	 //bottom 
	 
	 if (r+1 <= originPix.length-1) {
			
		 green = green+GImage.getGreen(originPix[r+1][c]);
		 
		 count++;
	 }
	 
	 
	 //bottom left
	 
	 if (r+1 <= originPix.length-1 && c-1 >=0) {
			
		 green = green+GImage.getGreen(originPix[r+1][c-1]);
		 
		 count++;
	 }
	 
	 //left side
	 if( c-1 >=0) {
		 green = green+GImage.getGreen(originPix[r][c-1]);
		 
		 count++;
	 }
	 return green/count;
	 
 }
 
 
 //get blue average in clockwise direcition:
 public int getAllBlue(int r, int c, int[][] originPix) {
	 int count =1;

	 int blue= GImage.getBlue(originPix[r][c]);
	 
	 //top left
	 if (r-1>=0 && c-1>=0) {
		 blue = blue+GImage.getBlue(originPix[r-1][c-1]);
		 
		 count++;
	 }
	 
	 //top
	 if (r-1 >=0) {
		 blue = blue+GImage.getBlue(originPix[r-1][c]);
		 
		 count++;
	 }
	 
	 //top right
	 if (r-1>=0 && c+1<=originPix[0].length-1) {
		
		 blue =blue+GImage.getBlue(originPix[r-1][c+1]);
		 
		 count++;
	 }
	 
	 //right
	 if (c+1<=originPix[0].length-1) {
			
		 blue = blue+GImage.getBlue(originPix[r][c+1]);
		 
		 count++;
	 }
	 
	 //Bottom Right
	 if (r+1 <= originPix.length-1 &&c+1<=originPix[0].length-1) {
			
		 blue = blue+GImage.getBlue(originPix[r+1][c+1]);
		 
		 count++;
	 }
	 
	 //bottom 
	 
	 if (r+1 <= originPix.length-1) {
			
		 blue = blue+GImage.getBlue(originPix[r+1][c]);
		 
		 count++;
	 }
	 
	 
	 //bottom left
	 
	 if (r+1 <= originPix.length-1 && c-1 >=0) {
			
		 blue = blue+GImage.getBlue(originPix[r+1][c-1]);
		 
		 count++;
	 }
	 
	 if (c-1>=0) {
		 blue = blue+GImage.getBlue(originPix[r][c-1]);
		 
		 count++;
	 }
	 
	 return blue/count;
	 
 }
 
 
	}

