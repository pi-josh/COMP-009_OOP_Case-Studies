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
		int choice = getProblem();
	}

	// Raf
	public static int getProblem() {
		int choice;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of the problem you wish to solve.\n"
						 + "\tGIVEN A MEDICAL ORDER IN\t\tCALCULATE RATE IN\n"
						 + "(1)\tml/hr & tubing drop factor\t\t\tdrops / min\n"
						 + "(2)\t1L for n hr\t\t\tml / hr\n"
						 + "(3)\tmg/kg/hr & concentration in mg/ml\t\t\tml / hr\n"
						 + "(4)\tunits/hr & concentration in units\t\t\tml / hr\n"
						 + "(5)\t QUIT"
						 + "Problem => ");
		choice = in.nextInt();

		return choice;
	}

	// Josh
	public static void getRateDropFactor() {

	}

	// Josh
	public static void getKgRateConc() {

	}

	// Raf
	public static void getUnitsConc() {

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