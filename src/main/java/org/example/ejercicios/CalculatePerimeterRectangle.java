package org.example.ejercicios;

import java.util.List;

public class CalculatePerimeterRectangle {
	public static void main(String[] args) {

		List<rectangle> rectangleList=
				List.of( new rectangle(4.0D, 8.0D),
						 new rectangle(5.0D, 9.0D),
						 new rectangle(3.0D, 5.0D),
						 new rectangle(2.0D,4.0D)
				);

		int counter=0;
		for(rectangle Rectangle:rectangleList)
		{
			double perimeter = (Rectangle.sides1 * 2) + (Rectangle.sides2 * 2);
			counter++;
			System.out.println("The perimeter of the rectangle N°"+counter+" is: " + perimeter);

		}


	}

	record rectangle(double sides1, double sides2) {}
}
