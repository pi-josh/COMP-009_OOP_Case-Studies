/**
 * The IntravenousRateAssistant program implements an application that
 * assist with the calculation of intravenous rates. It allows user
 * interaction with the command line interface to ask the assistant
 * in solving various problems limited to the choices prompted.
 * This program runs until the user chooses to exit.
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 * @version 29/03/24
 */

import java.util.Scanner;

public class IntravenousRateAssistant {
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

				return new int[] {mlPerHrRate, dropFactor}; 	// returning values
			} catch (Exception err) {
				in.next(); // string buffer here to avoid infinite loop
				System.err.println("\nPlease input a valid integer!");
				System.err.println(err + "\n");
			}
		} 
	}


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

				return new double[] {rate, patientWeight, drugConc}; 	// returning values
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
		        int unitsPerHrRate = in.nextInt();
		        System.out.print("Enter concentration in units/ml => ");
		        int concentration = in.nextInt();

				return new int[] {unitsPerHrRate, concentration}; 	// returning values
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
	 * @param mlPerHrRate is the milliliter per hour rate and the first parameter for the figDropsPerMin method
	 * @param dropFactor is the tubing's drop factor and the second parameter for the figDropsPerMin method
	 * @return int This return the value of drop rate per minute.
	 */
	public static int figDropsPerMin(int mlPerHrRate, int dropFactor) {
		int dropRatePerMin = (int)Math.round(mlPerHrRate * dropFactor / 60.0);

		return dropRatePerMin;           
	}


	/**
	 * This method is used to get the mililiters per number of hours.
	 * Calculates the user inputted hours into ml by dividing 1000 (converted 1Liter to mililiters)
	 * to the number of hours inputted (result/ quotient will be stored to 'rate')
	 * 
	 * @param hours is the number of hours inputted and the only parameter for figMlPerHour method
	 */
	public static int figMlPerHour(int hours) {
		int rate = 1000 / hours;
		
		return rate;
	}


	/**
	 * This method is used to get the milliliter per hour.
	 * It takes rate in mg/kg/hr, patient weight in kg, and concentration
	 * of drug in mg/ml as a formal parameters
	 * and returns ml/hr (rounded) as function value.
	 * The paramaters will be multiplied by each other to get the return value.
	 * 
	 * @param rate is the rate in mg/kg/hr and the first parameter for the byWeight method
	 * @param patientWeight is the patient weight in kg and the second parameter for the byWeight method 
	 * @param drugConc is the concentration of drug in mg/ml and the third paramater for the byWeight method 
	 * @return int This return the value of the ml/hr.
	 */
	public static int byWeight(double rate, double patientWeight, double drugConc) {
		int mlPerHrRate = (int)Math.round(rate * patientWeight * drugConc);

	  	return mlPerHrRate;
	}


	/**
	 * This method takes input parameters rate in units/hr and concentration in units/ml
	 * Calculates the total rate in mililiters per hour by
	 * dividing units/hr('unitsPerHrRate') to units/ml(concentration)
	 * 
	 * @param unitsPerHrRate is the rate in units/hr and first parameter for the byUnits method
	 * @param concentration is the concentration in units and second parameter for the byUnits method
	 * @return int This returns ml/hr (rounded).
	 */
	public static int byUnits(int unitsPerHrRate, int concentration) {
		int totalRate = (int)Math.round(unitsPerHrRate / concentration);
		
		return totalRate;
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
		int choice = -1;
		int result; // Placeholder for the returning values 

		System.out.println("++++++++++++++++++++ INTRAVENOUS RATE ASSISTANT ++++++++++++++++++++");

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
					/*
					 Prompting the user for the number of hours until they input a valid integer
					 and will be used as the actual parameter for figMlPerHour method
					*/
					int hours;
					while(true) {
						try {
							System.out.print("Enter number of hours => ");
	                		hours = in.nextInt();

	                		break;
						} catch (Exception err) {
							in.next(); // string buffer here to avoid infinite loop
							System.err.println("\nPlease input a valid integer!");
							System.err.println(err + "\n");
						}
					}

                	/*
					 Passing the actual paramaters to the figDropMin function
					 and storing it in a variable to be used in displaying the result
					*/
                	result = figMlPerHour(hours);
                	System.out.printf("The rate in milliliters per hour is %d.\n\n", result);
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
					 Passing the actual paramaters to the byWeight function
					 and storing it in a variable to be used in displaying the result
					*/
					result = byWeight(rate, patientWeight, drugConc);
					System.out.printf("The rate in milliliters per hour is %d.\n\n", result);
					break;
				case 4:
					/*
					 Initial declaration of the variables needed for problem 4
					 which will also serve as an actual parameters
					*/
					int unitsPerHrRate, concentration;
					int[] unitsAndConc = new int[2];

					// Getting the values of each variables
					unitsAndConc = getUnitsConc();
					unitsPerHrRate = unitsAndConc[0];
					concentration = unitsAndConc[1];

					/*
					 Passing the actual paramaters to the byUnits function
					 and storing it in a variable to be used in displaying the result
					*/
					result = byUnits(unitsPerHrRate, concentration);
					System.out.printf("The rate in milliliters per hour is %d.\n\n", result);
					break;
				case 5:
					System.out.println("++++++++++++++++++++++++ THANK YOU FOR USING +++++++++++++++++++++++");
					in.close();		// Closing the Scanner object to avoid resource leak
					break;
				default:
					System.out.println("Inputted value is not on the choices available!\n");
					continue;
			}
		} while(choice != 5);
	}
}

