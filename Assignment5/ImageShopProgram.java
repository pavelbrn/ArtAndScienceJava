/*
 * CS 106A ImageShop
 *
 * This instructor-provided file implements the graphical user interface (GUI)
 * for the ImageShop program and allows you to test the behavior of your image algorithms.
 *
 * Author : Nick Troccoli (based on previous versions by Marty Stepp and Eric Roberts)
 * Version: Sun 2017/07/30
 *
 * Your program should work properly with an UNMODIFIED version of this file.
 * If you want to modify this file for testing or for fun, that is your choice,
 * but when we grade your program we will do so with the original unmodified
 * version of this file, so your code must still work properly with that code.
 *
 * This file and its contents are copyright (C) Stanford University and Nick Troccoli,
 * licensed under Creative Commons Attribution 2.5 License.  All rights reserved.
 */

import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

import stanford.cs106.diff.*;
import stanford.cs106.gui.*;

public class ImageShopProgram extends GraphicsProgram {

	/**********************************************************
	 *                       Starter Code                     *
	 *                      --------------                    *
	 * This code is provided with Image Shop. This particular *
	 * file add all the buttons and strings up the program to *
	 * call your ImageShopAlgorithm methods                   * 
	 *   
	 * You don't need to read, nor understand this file,      *
	 * though you are more than welcome to peruse it. You     *
	 * should not change its contents!                        *                     
	 **********************************************************/
	
	// Valid file extensions for image types that we can write.
	private static final String[] SAVE_IMAGE_EXTENSIONS = new String[] { "png", "bmp", "wbmp" };

	// Valid file extensions for images that we can read.
	private static final String[] LOAD_IMAGE_EXTENSIONS = new String[] { "png", "bmp", "wbmp",
			"jpg", "gif", "jpeg" };

	// The general info label displayed at the top of the window
	private JLabel infoLabel;

	// The x/y/r/g/b label displayed at the bottom of the window
	private JLabel statsLabel;

	// The current image displayed on the canvas (or null if no image)
	private GImage currentImage;

	// The image algorithms object that runs the algorithms
	private ImageShopAlgorithms algorithms;

	public void init() {
		addButtons();
		addActionListeners();
		setTitle("CS 106A ImageShop");
		algorithms = new ImageShopAlgorithms();
	}
	
	// Add the interactors to the screen
	private void addButtons() {
		add(new JButton("Load Image"), WEST);
		add(new JButton("Save Image"), WEST);
		add(new JButton("Overlay Image"), WEST);
		add(new JButton("Compare To Image"), WEST);
		add(new JSeparator(), WEST);
		add(new JButton("Negative"), WEST);
		add(new JButton("Green Screen"), WEST);
		add(new JButton("Rotate Left"), WEST);
		add(new JButton("Rotate Right"), WEST);
		add(new JButton("Flip Horizontal"), WEST);
		add(new JButton("Translate"), WEST);
		add(new JButton("Blur"), WEST);
		add(new JButton("Equalize"), WEST);

		infoLabel = new JLabel("Welcome to CS 106A ImageShop!");
		add(infoLabel, NORTH);

		statsLabel = new JLabel(" ");
		add(statsLabel, SOUTH);
	}

	// Respond to one of the buttons on the left side being clicked
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Load Image")) {
			loadImage();
		} else if (command.equals("Save Image")) {
			saveImage();
		} else if (command.equals("Overlay Image")) {
			overlayImage();
		} else if (command.equals("Compare To Image")) {
			diffImage();
		} else if (currentImage == null) {
			showErrorPopup("please load an image.");
		} else if (command.equals("Flip Horizontal")) {
			GImage newImage = algorithms.flipHorizontal(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Rotate Left")) {
			GImage newImage = algorithms.rotateLeft(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Rotate Right")) {
			GImage newImage = algorithms.rotateRight(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Green Screen")) {
			GImage newImage = algorithms.greenScreen(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Equalize")) {
			GImage newImage = algorithms.equalize(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Negative")) {
			GImage newImage = algorithms.negative(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Translate")) {
			int dx = readInteger("dx?");
			int dy = readInteger("dy?");
			GImage newImage = algorithms.translate(currentImage, dx, dy);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else if (command.equals("Blur")) {
			GImage newImage = algorithms.blur(currentImage);
			setImage(newImage);
			infoLabel.setText(command + " filter applied.");
		} else {
			infoLabel.setText("Unknown command " + command + ".");
		}
	}

	// When the mouse moves in the image, update the info label at the bottom
	public void mouseMoved(MouseEvent e) {
		if (inImageBounds(e.getX(), e.getY())) {
			String status = "(x=" + e.getX() + ", y=" + e.getY() + ")";
			int pixel = currentImage.getPixelArray()[e.getY()][e.getX()];
			status += " (R=" + GImage.getRed(pixel) + ", G=" + GImage.getGreen(pixel) + ", B="
					+ GImage.getBlue(pixel) + ")";
			statsLabel.setText(status);
		} else {
			statsLabel.setText(" ");
		}
	}

	// Returns whether or not the given coordinate is in the current image
	private boolean inImageBounds(int x, int y) {
		if (currentImage == null) {
			return false;
		} else {
			double height = currentImage.getHeight();
			double width = height <= 0 ? 0 : currentImage.getWidth();
			return x >= 0 && x < width && y >= 0 && y < height;
		}
	}

	/*
	 * Pops up dialog boxes asking the user to type an integer repeatedly until
	 * the user types a valid integer.
	 */
	private int readInteger(String prompt) {
		while (true) {
			try {
				String result = JOptionPane.showInputDialog(prompt);
				int num = Integer.parseInt(result);
				return num;
			} catch (NumberFormatException e) {
				// empty; re-prompt
			} catch (NullPointerException e) {
				// empty; re-prompt
			}
		}
	}

	// Sets the given image as the current image on the canvas, and resizes canvas.
	private void setImage(GImage image) {
		if (currentImage != null) {
			remove(currentImage);
		}

		setBackground(new Color(238, 238, 238));
		setCanvasSize(image.getWidth(), image.getHeight());
		add(image);
		currentImage = image;
	}

	/* Returns a File representing the image directory, which is either the res/
	 * directory or the user directory.
	 */
	private File getImageDirectory() {
		File dir = new File(System.getProperty("user.dir") + "/res");
		if (!dir.isDirectory()) {
			dir = new File(System.getProperty("user.dir"));
		}
		return dir;
	}
	
	/* Returns a File representing the output directory, which is either the output/
	 * directory or the user directory.
	 */
	private File getOutputDirectory() {
		File dir = new File(System.getProperty("user.dir") + "/output");
		if (!dir.isDirectory()) {
			dir = new File(System.getProperty("user.dir"));
		}
		return dir;
	}

	// Shows a file prompt to load in a new image, and displays the chosen image onscreen.
	private void loadImage() {
		// Initialize the file chooser prompt
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(GuiUtils.getExtensionFileFilter("Image files", LOAD_IMAGE_EXTENSIONS));
		chooser.setCurrentDirectory(getImageDirectory());

		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			// Load the image and add it to the canvas
			File currentFile = chooser.getSelectedFile();
			GImage image = new GImage(currentFile.getAbsolutePath());
			setImage(image);
			infoLabel.setText("Loaded image " + currentFile.getName() + ".");
		}
	}

	// Shows a file prompt to save the current image (if any) to a file.
	private void saveImage() {
		if (currentImage == null) {
			showErrorPopup("no image to save.");
			return;
		}

		// Initialize the file chooser prompt
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(GuiUtils.getExtensionFileFilter(".png, .bmp, and .wbmp files", SAVE_IMAGE_EXTENSIONS));
		chooser.setCurrentDirectory(getImageDirectory());

		if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {	
			// If they are overwriting and made a mistake, cancel
			if (chooser.getSelectedFile().exists()) {
				if (JOptionPane.showConfirmDialog(this,
								"File already exists. Overwrite?\n(You probably shouldn't overwrite the instructor-provided images; save them with a different name)",
								"Overwrite?", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
					return;
				}
			}
			
			// Save the image to file
			try {
				currentImage.saveImage(chooser.getSelectedFile());
				infoLabel.setText("Saved image to " + chooser.getSelectedFile().getName() + ".");
			} catch (ErrorException e) {
				showErrorPopup("Invalid filename (make sure to include a file extension (.png, etc.).");
			}
		}
	}

	// Overlays a selected image on top of the currently-loaded image.
	private void overlayImage() {
		if (currentImage == null) {
			showErrorPopup("no image on which to overlay.  Please load an image.");
			return;
		}

		// Initialize the file chooser prompt
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(GuiUtils.getExtensionFileFilter("Image files", LOAD_IMAGE_EXTENSIONS));
		chooser.setCurrentDirectory(getImageDirectory());

		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			// Create an Image from the current image
			Image oldImage = currentImage.getImage();
			int width = oldImage.getWidth(getGCanvas());
			int height = oldImage.getHeight(getGCanvas());

			// Create a new Image for the loaded overlay image
			Image newImage = getGCanvas().createImage(width, height);
			Graphics g = newImage.getGraphics();
			g.drawImage(oldImage, 0, 0, getGCanvas());
			File file = chooser.getSelectedFile();
			Image overlay = new GImage(file.getAbsolutePath()).getImage();
			int x0 = (width - overlay.getWidth(getGCanvas())) / 2;
			int y0 = (height - overlay.getHeight(getGCanvas())) / 2;
			g.drawImage(overlay, x0, y0, getGCanvas());

			currentImage.setImage(newImage);
			infoLabel.setText("Overlayed image " + file.getName() + ".");
		}
	}

	//Shows a "Diff Image" window to compare the pixels of two images.
	private void diffImage() {
		if (currentImage == null) {
			showErrorPopup("no image currently displayed.");
			return;
		}
		
		// Initialize the file chooser prompt
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(GuiUtils.getExtensionFileFilter("Image files", LOAD_IMAGE_EXTENSIONS));
		chooser.setCurrentDirectory(getOutputDirectory());
		
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			File imageFile2 = chooser.getSelectedFile();
			try {
				Image image2 = ImageIO.read(imageFile2);
				Image image1 = currentImage.getImage();
				new DiffImage(image1, image2);
			} catch (IOException ioe) {
				showErrorPopup("could not read diff image data from " + imageFile2.getName() + ": " + ioe.getMessage());
			}
		}
	}
	
	/*
	 * Displays a popup message dialog box to display the given error message.
	 * Also puts the error message into the top info label.
	 */
	private void showErrorPopup(String text) {
		JOptionPane.showMessageDialog(this, "Error: " + text, "Error", JOptionPane.ERROR_MESSAGE);
		infoLabel.setText("Error: " + text);
	}
}

