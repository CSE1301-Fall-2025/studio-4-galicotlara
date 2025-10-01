package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		System.out.println(shape);
		int redC = in.nextInt();
		int greenC = in.nextInt();
		int blueC = in.nextInt();
		boolean filled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		StdDraw.setPenColor(redC, greenC, blueC);
		StdDraw.setPenRadius(0.05);

		if (shape.equals("rectangle")  && filled == true){
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		} else if (shape.equals("ellipse") && filled == true){
			StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		} else if (shape.equals("rectangle") && filled == false){
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		} else if (shape.equals("ellipse") && filled == false){
			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		} 

	
	
	}
}
