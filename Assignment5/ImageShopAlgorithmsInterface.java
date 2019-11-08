/*
 * CS 106A ImageShop
 *
 * This instructor-provided file contains several methods that you must write in your
 * ImageShopAlgorithms code.  This file is here to make sure that your class
 * has all of the methods that we asked for in the spec; else it will not
 * compile.  It also contains helper code for calculating the luminosity of a pixel.
 *
 * You should not modify the contents of this file in any way.
 * Your program should work properly with an UNMODIFIED version of this file.
 * 
 * author: Nick Troccoli
 * version: 2017/07/30
 */

import acm.graphics.GImage;
import acm.graphics.GMath;

public interface ImageShopAlgorithmsInterface {
	
	/**********************************************************
	 *                       Starter Code                     *
	 *                      --------------                    *
	 * This code is provided with Image Shop. This particular *
	 * file says which methods ImageShopAlgorithms has to     *
	 * implement, and defines a method computeLuminosity.     *
	 * 
	 * You don't need to read, nor understand this file,      *
	 * though you are more than welcome to peruse it. You     *
	 * should not change its contents!                        *                       
	 **********************************************************/
	
	// The methods that must be implemented in ImageShopAlgorithms.java
	public GImage flipHorizontal(GImage source);
	public GImage rotateLeft(GImage source);
	public GImage rotateRight(GImage source);
	public GImage greenScreen(GImage source);
	public GImage equalize(GImage source);
	public GImage negative(GImage source);
	public GImage translate(GImage source, int dx, int dy);
	public GImage blur(GImage source);
	
	/* Helper method to compute the luminosity of an RGB pixel (from 11.7 in the book) */
	public default int computeLuminosity(int r, int g, int b) {
		return GMath.round(0.299 * r + 0.587 * g + 0.114 * b);
	}
}
