/**
 * The NonVerticalStraightLines program implements various calculations
 * using the mathematical models of nonvertical straight lines.
 * It allows user to convert either two-point form
 * or point-slope form into slope-intercept form.
 * This program runs until the user choose to not do another conversion.
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 */

// Note: Functions name and return type are subject to change later

public class NonVerticalStraightLines {
	public static void main(String[] args) {
		System.out.println("Testing");
	}

	// Josh
	public static void getProblem() {
		
	}

	// Raf
	public static int[][] getTwoPoints() {
		//Declaring an array
       		int[] point1 = new int[2];
        	int[] point2 = new int[2];

		//Getting value for first points
        	System.out.println("Enter the x-y coordinates of the first point separated by a space:");
        	for (int i = 0; i < 2; i++) {
          		point1[i] = in.nextInt();
       	 	}
		//Getting value for second points
        	System.out.println("Enter the x-y coordinates of the second point separated by a space:");
        	for (int i = 0; i < 2; i++) {
            		point2[i] = in.nextInt();
        	}

        	// returning an array that contains the array point 1 and 2
       		return new int[][] {point1, point2};
	}

	// Cas
	public static void getPointSlope(Scanner scanner, double[] pointSlope) {
		System.out.print("Enter the slope= ");
		pointSlope[0] = scanner.nextDouble();
		System.out.println("Enter the x-y coordinates of the point separated by a space=> "); 	
	    pointSlope[1] = scanner.nextDouble();
		pointSlope[2] = scanner.nextDouble();
	}

	// Josh
	public static void slopeInterceptFromTwoPoints() {

	}

	// Dom
	public static void interceptFromPointSlope() {

	}

	// Cas
	public static void diplayTwoPoints() {

	}

	// Raf
	public static void displayPointSlope() {

	}

	// Dom
	public static void displaySlopeIntercept() {
		
	}
}
