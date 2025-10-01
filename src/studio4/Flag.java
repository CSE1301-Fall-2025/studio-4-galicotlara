package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledRectangle(0, 0, 1, 2);
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledEllipse(0.2, 0.8, 0.08, 0.08);
		StdDraw.filledEllipse(0.8, 0.8, 0.08, 0.08);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(0.23, 0.78, 0.04, 0.04);
		StdDraw.filledEllipse(0.77, 0.78, 0.04, 0.04);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledEllipse(0.5, 0.3, 0.23, 0.09);

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(0.5, 0.3, 0.2, 0.06);

		StdDraw.setPenColor(StdDraw.BLUE);
		//StdDraw.filledEllipse(0.5, 0.3, 0.1, 0.04);
		StdDraw.filledRectangle(0.5, 0.2, 0.1, 0.1);
		StdDraw.filledEllipse(0.5, 0.1, 0.1, 0.04);

		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledRectangle(0.2, 0.95, 0.12, 0.04);
		StdDraw.filledRectangle(0.8, 0.95, 0.12, 0.04);

		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledEllipse(0.5, 0.55, 0.13, 0.06);

		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(0.45, 0.535, 0.015, 0.032);
		StdDraw.filledEllipse(0.55, 0.535, 0.015, 0.032);
	}
}