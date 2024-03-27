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
	 * and make use of ... 
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
					// Initial declaration of the actual parameters
					int mlPerHrRate, dropFactor;

					// Keep prompting until the user input a valid integer
					while(true) {
						try {
							// Prompting the user for the rate in milliliter per hour
							System.out.print("Enter rate in ml/hr => ");
							mlPerHrRate = in.nextInt();

							// Prompting the user for the tubing's drop factor
							System.out.print("Enter tubing's drop factor (drops/ml) => ");
							dropFactor = in.nextInt();

							break;
						} catch (Exception err) {
							in.next(); // string buffer here to avoid infinite loop
							System.err.println("Please input a valid integer!");
							System.err.println(err);
						}
					}

					/*
					 Passing the actual paramaters to the getRateDropFactor function
					 and storing it in a variable to be used in displaying the result
					*/
					int result = getRateDropFactor(mlPerHrRate, dropFactor);
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
	 * This method is used to get the drop rate per minute.
	 * This method will multiply the milliliters per hour rate by tubing's drop factor
	 * and dividing by 60 to convert to get the drop rate per minute
	 * since 1 hour is equivalent to 60 minutes.
	 * 
	 * @param mlPerHrRate is the first parameter for the getRateDropFactor method
	 * @param dropFactor is the second parameter for the getRateDropFactor method
	 * @return int This return the value of drop rate per minute.
	 */
	public static int getRateDropFactor(int mlPerHrRate, int dropFactor) {
		// Using Math.round method to make sure the integer value is rounded off to the nearest tenth
		int dropRatePerMin = (int) Math.round((mlPerHrRate * dropFactor) / 60.0);
		
		return dropRatePerMin;
	}

	// Josh
	public static void getKgRateConc() {

	}

	// Raf
	public static int getUnitsConc() {
		//initializaition and declarations
		int rateph = 0;
		int conc = 0;
		int totalrate;
		
		//user input
		System.out.print("Enter rate in units/hr=> ");
		rateph = in.nextInt();
		System.out.print("Enter concentration in units/ml=> ");
		conc = in.nextInt();
		totalrate = rateph / conc; //calculation
		
		return totalrate; //returning value
	}

	// Cas
	public static double figDropsPerMin(int rate, int drop) {
		return rate * drop / 60.0;           
	}

	// Dom
	public static void figMlPerHour() {

	}

	// Cas
	public static int byWeight(int rate, int weight, int conc) {
		return rate * weight * conc;
	}

	// Dom
	public static void byUnits() {

	}
}
