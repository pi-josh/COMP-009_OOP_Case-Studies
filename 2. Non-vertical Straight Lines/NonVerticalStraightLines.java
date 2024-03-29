/**
 * The NonVerticalStraightLines program implements various calculations
 * using the mathematical models of nonvertical straight lines.
 * It allows user to convert either two-point form
 * or point-slope form into slope-intercept form.
 * This program runs until the user choose to not do another conversion.
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 * @version 29/03/24
 */

import java.util.Scanner;

public class NonVerticalStraightLines {
	/*
	 Scanner method named in to get the input from the user
	 to be used all throughout the program
	*/
	static Scanner in = new Scanner(System.in);


	/**
	 * This method is used to get the problem that will be chosen by the user.
	 * The integer variable choice will be used as the placeholder of the value
	 * that will be chosen by the user. It is initialized with a value of -1
	 * to make sure that there would be a return value.
	 * A try-catch is used to make sure that the program won't stop when the user
	 * inputs an invalid integer.
	 * 
	 * @return int This return the integer value that corresponds to the chosen problem
	 */
	public static int getProblem() {
		int choice = -1; // Variable to store the choice of the user

		// Prompt the user for choices and make sure they give a valid input
		while(true) {
			System.out.print("Select the form that you would like to convert to slope-intercept\n"
					 + "(1) Two-point form (you know the points on the line)\n"
					 + "(2) Point-slope form (you know the line's slope and one point\n"
					 + "=> ");
			try {
				choice = in.nextInt();
				System.out.println();
				break;
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		}
		
		return choice;
	}


	/**
	 * This method prompts the user to enter the data required for Two-point form,
	 * and sends this data back to the calling module via output parameters.
	 * This prompts the user for the x-y coordinates of both points, inputs the four coordinates, 
	 * and returns them to the calling function through output parameters.
	 * 
	 * @return int[][] This return a multidimensional integer array of values: x-y coordinates of both points.
	 */
	public static int[][] getTwoPoints() {
		// Declaring an array
   		int[] point1 = new int[2];
    	int[] point2 = new int[2];

    	while(true) {
			try {
				// Getting value for first point
		    	System.out.println("Enter the x-y coordinates of the first point separated by a space:");
		    	for (int i = 0; i < 2; i++) {
		  			point1[i] = in.nextInt();
		   	 	}
				// Getting value for second point
		    	System.out.println("Enter the x-y coordinates of the second point separated by a space:");
		    	for (int i = 0; i < 2; i++) {
					point2[i] = in.nextInt();
		    	}

		    	// Returning a multidimensional array that contains the array point 1 and 2
		   		return new int[][] {point1, point2};
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		} 
	}


	/**
	 * This method prompts the user to enter the data required for Point-slope form,
	 * and sends this data back to the calling module via output parameters.
	 * This prompts the user for the slope and x-y coordinates of the point, inputs the three 
	 * values and returns them to the calling function through output parameters.
	 * 
	 * @return double[] This return a double array three values: slope, x-coordinate and y-coordinate of a point.
	 */
	public static double[] getPointSlope() {
		while(true) {
			try {
				System.out.print("Enter the slope => ");
				double slope = in.nextDouble();
				System.out.println("Enter the x-y coordinates of the point separated by a space => "); 	
			    double xCoordinate = in.nextDouble();
				double yCoordinate = in.nextDouble();

				return new double[] {slope, xCoordinate, yCoordinate}; // Returning slope and x-y coordinates of the point here
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid double value!");
				System.err.println(err + "\n");
			}
		} 
	}


	/**
	 * This method takes four input parameters, the x-y coordinates of two points, and 
	 * returns through output parameters the slope (m) and y-intercept (b).
	 * 
	 * @param x1 This is the x-coordinate of point 1 and the first parameter for slopeInterceptFromTwoPoints
	 * @param y1 This is the y-coordinate of point 1 and the second parameter for slopeInterceptFromTwoPoints
	 * @param x2 This is the x-coordinate of point 2 and the third parameter for slopeInterceptFromTwoPoints
	 * @param y2 This is the y-coordinate of point 2 and the fourth parameter for slopeInterceptFromTwoPoints
	 * @return double[] This return a double array of two values: slope (m) and y-intercept (b).
	 */
	public static double[] slopeInterceptFromTwoPoints(int x1, int y1, int x2, int y2) {
		// Getting the slope
		double m = (y2 - y1) / (x2 - x1);

		// Getting the y-intercept
		double b = interceptFromPointSlope(x1, y1, m);

		return new double[] {m, b}; // Returning slope and y-intercept here
	}

	// Dom
	/**
	 * This method takes three input parameters, the x-y coordinates of one point and the 
	 * slope, and returns as the function value the y-intercept.
	 * 
	 * @param x This is the x-coordinate of the point and the first parameter for interceptFromPointSlope
	 * @param y This is the y-coordinate of the point and the second parameter for interceptFromPointSlope
	 * @param m This is the slope of the point and the third parameter for interceptFromPointSlope
	 * @return double This return the value for the y-intercept.
	 */
	public static double interceptFromPointSlope(double x, double y, double m) {
		// TODO: Calculate here

		// TODO: Return value here
		return -1; // temporary lang since may error
	}


	/**
	 * This method takes four input parameters, the x-y coordinates of two points, and displays the 
	 * two-point line equation with a heading
	 * 
	 * @param x1 This is the x-coordinate of point 1 and the first parameter for diplayTwoPoints
	 * @param y1 This is the y-coordinate of point 1 and the second parameter for diplayTwoPoints
	 * @param x2 This is the x-coordinate of point 2 and the third parameter for diplayTwoPoints
	 * @param y2 This is the y-coordinate of point 2 and the fourth parameter for diplayTwoPoints
	 */
	public static void diplayTwoPoints(double x1, double y1, double x2, double y2) {
		// Displaying the two-point form
		System.out.println("Two-point form");
		System.out.println("     (" + String.format("%.2f", y2) + " - " + String.format("%.2f", y1) + ")");
		System.out.println("m = ----------------");
		System.out.println("     (" + String.format("%.2f", x2) + " - " + String.format("%.2f", x1) + ")");	
	}

	// Raf
	/**
	 * This method takes three input parameters, the x-y coordinates of one point and the slope, 
	 * and displays the point-slope line equation with a heading.
	 * 
	 * @param x This is the x-coordinate of the point and the first parameter for displayPointSlope
	 * @param y This is the y-coordinate of the point and the second parameter for displayPointSlope
	 * @param m This is the slope of the point and the third parameter for displayPointSlope
	 */
	public static void displayPointSlope(double x, double y, double m) {
		// TODO: Implement the same format as the case study guide here
		/*
			Point-slope form
			y – 1.00 = 4.20 (x – 1.00)
		*/
	}

	// Dom
	/**
	 * This method takes two input parameters, the slope and y-intercept,
	 * and displays the slope-intercept line equation with a heading.
	 * 
	 * @param m This is the slope of the point and the first parameter for displaySlopeIntercept
	 * @param b This is the y-intercept of the point and the second parameter for displaySlopeIntercept
	 */
	public static void displaySlopeIntercept(double m, double b) {
		// TODO: Implement the same format as the case study guide here
		/*
			Slope-intercept form
			y = 0.33x + 1.66
		*/
	}


	/**
	 * This is the main method which run the application
	 */
	public static void main(String[] args) {
		/*
		 Calling the getProblem function
		 and storing the integer value that corresponds to the chosen problem
		 until the user input a valid integer or chooses to exit
		 */
		char answer = 'Y';
		double slope, intercept; // Placeholder for the slope and intercept values since it will be used by two problems

		System.out.println("++++++++++++++++++++ NON-VERTICAL STRAIGHT LINES ++++++++++++++++++++");

		do {
			int choice = getProblem();

			// Calling the function based on the choice of the user
			switch(choice) {
				case 1:
					/*
					 Initial declaration of the variables needed and
					 which will also serve as an actual parameters for slopeInterceptFromTwoPoints method
					*/
					int xOfPoint1, yOfPoint1; // x-y coordinates of point 1
					int xOfPoint2, yOfPoint2; // x-y coordinates of point 2
					int[][] twoPoints = new int [2][2];

					// Getting the values of each variables
					twoPoints = getTwoPoints();	// Calling the getTwoPoints method here
					xOfPoint1 = twoPoints[0][0];
					yOfPoint1 = twoPoints[0][1];
					xOfPoint2 = twoPoints[1][0];
					yOfPoint2 = twoPoints[1][1];

					/*
					 Passing the actual paramaters to the slopeInterceptFromTwoPoints function
					 and storing it in a variable to be used in displaying the result
					*/
					double[] slopeAndIntercept = slopeInterceptFromTwoPoints(xOfPoint1, yOfPoint1, xOfPoint2, yOfPoint1);
					slope = slopeAndIntercept[0];
					intercept = slopeAndIntercept[1];

					// Displaying the results by calling the displayTwoPoints and displaySlopeIntercept methods
					diplayTwoPoints(xOfPoint1, yOfPoint1, xOfPoint2, yOfPoint1);
					displaySlopeIntercept(slope, intercept);
					System.out.println();
					break;
				case 2:
					/*
					 Initial declaration of the variables needed and
					 which will also serve as an actual parameters for interceptFromPointSlope method
					*/
					double xCoordinate, yCoordinate; // Coordinates of the point
					double[] pointAndSlope = new double[3];

					// Getting the values of each variables
					pointAndSlope = getPointSlope();	// Calling the getPointSlope method here
					xCoordinate = pointAndSlope[0];
					yCoordinate = pointAndSlope[1];
					slope = pointAndSlope[2];

					/*
					 Passing the actual paramaters to the interceptFromPointSlope function
					 and storing it in a variable to be used in displaying the result
					*/
					intercept = interceptFromPointSlope(xCoordinate, yCoordinate, slope);

					// Displaying the results by calling the displayPointSlope and displaySlopeIntercept methods
					displayPointSlope(xCoordinate, yCoordinate, slope);
					displaySlopeIntercept(slope, intercept);
					System.out.println();
					break;
				default:
					in.close();		// Closing the Scanner object to avoid resource leak
					System.out.println("Inputted value is not on the choices available!\n");
					continue;
			}

			// Keep prompting the user if they want to do another conversion until they enter a valid input
			while(true) {
				System.out.println("Do another conversion (Y or N) => ");
				answer = in.next().charAt(0);
				answer = Character.toUpperCase(answer);
				if(answer == 'Y') {
					break;
				} else if(answer == 'N') {
					System.out.println("+++++++++++++++++++++++++++++ THANK YOU +++++++++++++++++++++++++++++");
					break;
				} else {
					System.out.println("Please input 'Y' or 'N' only!\n");
				}
			}
		} while(answer != 'N');


	}
}
