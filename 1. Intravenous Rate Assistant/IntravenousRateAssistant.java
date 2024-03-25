/**
 * Documentation here
 * 
 * 
 * 
 * 
 */

// Note: Functions name and return type are subject to change later

public class IntravenousRateAssistant {
	public static void main(String[] args) {
		System.out.println("Testing");
	}

	// Raf
	public static void getProblem() {

	}

	// Josh
	public static void getRateDropFactor() {

	}

	// Josh
	public static void getKgRateConc() {

	}

	// Raf
	public static void getUnitsConc() {
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
