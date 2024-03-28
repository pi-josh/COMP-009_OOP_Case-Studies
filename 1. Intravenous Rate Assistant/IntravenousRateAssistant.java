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
		int result; // Placeholder for the resulting values
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
					result = figDropsPerMin(mlPerHrRate, dropFactor);
					System.out.printf("The drop rate per minute is %d.\n\n", result);

					break;
				case 2:
					break;
				case 3:
					/*
					 Initial declaration of the variables needed for problem 3
					 which will also serve as an actual parameters
					*/
					double rate, patientWeight, drugConc;
					double[] ratePatientWeightAndDrugConc = new double[3];

					// Getting the values of each variables
					ratePatientWeightAndDrugConc = getKgRateConc();
					rate = ratePatientWeightAndDrugConc[0];
					patientWeight = ratePatientWeightAndDrugConc[1];
					drugConc = ratePatientWeightAndDrugConc[2];

					/*
					 Passing the actual paramaters to the figDropMin function
					 and storing it in a variable to be used in displaying the result
					*/
					result = byWeight(rate, patientWeight, drugConc);
					System.out.printf("The rate in milliliters per hour is %d.\n\n", result);
					break;
				case 4:
					break;
				case 5:
					break;
			}
		} while(choice != 5);
	}


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
			System.err.println("\nPlease input a valid integer!");
			System.err.println(err + "\n");
		}
		
		return choice;
	}


	/**
	 * This method prompts the user to enter the data required for problem 1,
	 * and sends this data back to the calling module via output parameters.
	 * 
	 * @return int[] This return an integer array of two values: rate in ml/hr and tubing's drop factor.
	 */
	public static int[] getRateDropFactor() {
		/*
		 Prompting the user for the rate in milliliter per hour 
		 and tubing's drop factor until they input a valid integer
		*/
		while(true) {
			try {
				System.out.print("Enter rate in ml/hr => ");
				int mlPerHrRate = in.nextInt();

				System.out.print("Enter tubing's drop factor (drops/ml) => ");
				int dropFactor = in.nextInt();

				return new int[] {mlPerHrRate, dropFactor};
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		} 
	}

	// Josh
	/**
	 * This method prompts the user to enter the data required for problem 3
	 * and sends this data back to the calling module via output parameters.
	 * 
	 * @return double[] This return a double array of three values: rate in mg/kg/hr, patient weight in kg,
	 * and concentration of drug in mg/ml
	 */
	public static double[] getKgRateConc() {
		/*
		 Prompting the user for the rate in milliliter per hour 
		 and tubing's drop factor until they input a valid double value
		*/
		while(true) {
			try {
				System.out.print("Enter rate in mg/kg/hr => ");
				double rate = in.nextDouble();

				System.out.print("Enter patient weight in kg => ");
				double patientWeight = in.nextDouble();

				System.out.print("Enter concentration in mg/ml => ");
				double drugConc = in.nextDouble();

				return new double[] {rate, patientWeight, drugConc};
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		} 
	}


  /**
	 * This method prompts the user to enter the data required for problem 4
	 * and sends this data back to the calling module via output parameters.
	 * 
	 * @return int[] This return a integer array of two values: rate in units/hr
	 * and concentration of concentration in units/ml.
	 */
	public static int[] getUnitsConc() {
  /*
		Prompting the user for the rate in units per hour
		and concentration in units per milliliters until they input a valid integer value
	*/
    while(true) {
			try {
				System.out.print("Enter rate in units/hr => ");
        ratePerHr = in.nextInt();
        System.out.print("Enter concentration in units/ml => ");
        concentration = in.nextInt();

				return new int[] {ratePerHr, concentration};
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		} 
	}


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


	/**
	 * This method is used to get the milliliter per hour.
	 * It takes rate in mg/kg/hr, patient weight in kg, and concentration
	 * of drug in mg/ml as a formal parameters
	 * and returns ml/hr (rounded) as function value.
	 * The paramaters will be multiplied by each other to get the return value.
	 * 
	 * @param rate is the first parameter for the rate in mg/kg/hr
	 * @param patientWeight is the second parameter for the patient weight in kg
	 * @param drugConc is the third paramater for the concentration of drug in mg/ml
	 * @return int This return the value of the ml/hr.
	 */
	public static int byWeight(double rate, double patientWeight, double drugConc) {
		int mlPerHrRate = (int)Math.round(rate * patientWeight * drugConc);

	  	return mlPerHrRate;
	}

	// Dom
	public static void byUnits() {

	}
}
