/**
 * The IntravenousRateAssistant program implements an application that
 * assist with the calculation of intravenous rates. It allows user
 * interaction with the command line interface to ask the assistant
 * in solving various problems limited to the choices prompted.
 * 
 *  @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 */

// Note: Functions name and return type are subject to change later

import java.util.Scanner;

public class IntravenousRateAssistant {
	/*
	 Scanner method named in to get the input from the user
	 all throughout the program
	*/
	static Scanner in = new Scanner(System.in);

	/**
	 * This is the main method which run the application
	 */
	public static void main(String[] args) {

		/*
		 Calling the getProblem function
		 and storing the integer value that corresponds to the chosen problem
		 until the user input a valid integer or chooses to exit
		 */
		int choice = -1;
		do {
			choice = getProblem();

			// Calling the function based on the choice of the user
			switch(choice) {
				case 1:
					/*
					 Initial declaration of the variables needed for problem 1
					 which will also serve as an actual parameters
					*/
					int mlPerHrRate, dropFactor;
					int[] rateAndDropFactor = new int[2];

					// Getting the values of each variables
					rateAndDropFactor = getRateDropFactor();
					mlPerHrRate = rateAndDropFactor[0];
					dropFactor = rateAndDropFactor[1];

					/*
					 Passing the actual paramaters to the figDropMin function
					 and storing it in a variable to be used in displaying the result
					*/
					int result = figDropsPerMin(mlPerHrRate, dropFactor);
					System.out.printf("The drop rate per minute is %d.\n\n", result);

					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
			}
		} while(choice != 5);
	}

	// Raf
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
		System.out.print("Enter the number of the problem you wish to solve.\n"
					 + "\tGIVEN A MEDICAL ORDER IN\t\tCALCULATE RATE IN\n"
					 + "(1)\tml/hr & tubing drop factor\t\tdrops / min\n"
					 + "(2)\t1L for n hr\t\t\t\tml / hr\n"
					 + "(3)\tmg/kg/hr & concentration in mg/ml\tml / hr\n"
					 + "(4)\tunits/hr & concentration in units\tml / hr\n"
					 + "(5)\tQUIT\n"
					 + "Problem => ");
		try {
			choice = in.nextInt();
			System.out.println();
		} catch (Exception err) {
			in.next(); // string buffer here to avoid infinite loop
			System.err.println("Please input a valid integer!");
			System.err.println(err);
		}
		
		return choice;
	}

	// Josh
	/**
	 * This method is prompts the user to enter the data required for problem 1,
	 * and sends this data back to the calling module via output parameters.
	 * 
	 * @return int This return an array of two values: rate and drop factor.
	 */
	public static int[] getRateDropFactor() {
		// Prompting the user for the tubing's drop factor until they input a valid integer
		while(true) {
			try {
				System.out.print("Enter rate in ml/hr => ");
				int mlPerHrRate = in.nextInt();

				System.out.print("Enter tubing's drop factor (drops/ml) => ");
				int dropFactor = in.nextInt();

				return new int[] {mlPerHrRate, dropFactor};
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("Please input a valid integer!");
				System.err.println(err);
			}
		} 
	}

	// Josh
	public static void getKgRateConc() {

	}

	// Raf
	public static int getUnitsConc() {
		// Initialization and declarations of variable
		int ratePh = 0;
		int concentration = 0;
		int totalRate;
		
		//user input
		System.out.print("Enter rate in units/hr=> ");
		ratePh = in.nextInt();
		System.out.print("Enter concentration in units/ml=> ");
		concentration = in.nextInt();
		totalRate = ratePh / concentration; //calculation
		
		return totalRate; //returning value
	}

	// Cas
	/**
	 * This method is used to get the drop rate per minute.
	 * This method will multiply the milliliters per hour rate by tubing's drop factor
	 * and dividing by 60 to convert to get the drop rate per minute
	 * since 1 hour is equivalent to 60 minutes.
	 * 
	 * @param mlPerHrRate is the first parameter for the getRateDropFactor method
	 * @param dropFactor is the second parameter for the getRateDropFactor method
	 * @return int This return the value of drop rate per minute.
	 */
	public static int figDropsPerMin(int mlPerHrRate, int dropFactor) {
		int dropRatePerMin = (int)Math.round(mlPerHrRate * dropFactor / 60.0);

		return dropRatePerMin;           
	}

	// Dom
	public static int figMlPerHour() {
		return 1;
	}

	// Cas
	public static int byWeight(int mlPerHrRate, int weight, int concentration) {
		return Math.ceil(mlPerHrRate * weight * concentration);
	}

	// Dom
	public static void byUnits() {

	}
}
