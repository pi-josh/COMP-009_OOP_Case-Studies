/**
 * Documentation here
 * 
 * 
 * 
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
	public static void getPointSlope() {

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
