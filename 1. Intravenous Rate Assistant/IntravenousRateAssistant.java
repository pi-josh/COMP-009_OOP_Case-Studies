/**
 * Documentation here
 * 
 * 
 * 
 * 
 */

// Note: Functions name and return type are subject to change later

import java.util.Scanner;

public class IntravenousRateAssistant {
	public static void main(String[] args) {
		/*
		 Calling the getProblem function
		 and storing the integer value that corresponds to the chosen problem
		 until the user chooses to exit
		 */
		int choice = -1;
		do {
			choice = getProblem();

			// Calling the function based on the choice of the user
			switch(choice) {
				case 1:
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
	public static int getProblem() {
		int choice = -1; // Variable to store the choice of the user
		Scanner in = new Scanner(System.in); // Scanner method named in to get the input from the user

		// Keep prompting the user for choices until they give a valid input
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
		} catch (Exception e) {
			System.err.println("Please input a valid integer!" + e);
		}
		
		return choice;
	}

	// Josh
	public static void getRateDropFactor() {

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
		Scanner in = new Scanner(System.in);
		
		//user input
		System.out.print("Enter rate in units/hr=> ");
		rateph = in.nextInt();
		System.out.print("Enter concentration in units/ml=> ");
		conc = in.nextInt();
		totalrate = rateph / conc; //calculation
		
		return totalrate; //returning value
	}

	// Cas
	public static void figDropsPerMin() {

	}

	// Dom
	public static void figMlPerHour() {

	}

	// Cas
	public static void byWeight() {

	}

	// Dom
	public static void byUnits() {

	}
}
