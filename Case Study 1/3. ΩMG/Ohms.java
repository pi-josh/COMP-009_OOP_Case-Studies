/**
 * The Ohms program calculate the resistance of a resistor based on the colors of its three bands.
 * Users will be prompted to input the colors of these bands,
 * and the program will map these colors to their corresponding resistance values.
 * Additionally, the program includes a search helper function
 * that allows users to find a target string within a given list of strings.
 * The program aims to provide a straightforward way to determine resistance and assist with string searches.
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 * @version 31/03/24
 */


import java.util.Scanner;

public class Ohms {
	/*
	Scanner method named in to get the input from the user
	to be used all throughout the program
	*/
	static Scanner in = new Scanner(System.in);

	static boolean isInvalidInputExist = false;	// This will check if there is an invalid input and make the user will have a choice to continue or not

	// Dom
	/**
	 * This method is used to get the colors of the resistor's three bands.
	 * The user will be prompted to input the color of each making sure that it is not in CAPS.
	 * It will then call the searchBand method to see if the target band is in the list of color codes.
	 * 
	 * @return String[] This return an array of strings that represent the color the resistor's three bands
	 */
	public static String[] getThreeBands() {
		// List of color codes
		final String[] COLOR_CODES = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
		String[] bandsList = new String[3];

		// Prompting the user for the three bands
    	for(int i = 0; i < 3; i++) {
            System.out.printf("Band %d => ", i + 1);
            bandsList[i] = in.next().toLowerCase();
    	}

    	// Check if the inputted band is in the list of color codes
    	for(int i = 0; i < 3; i++) {
    		int isFound = searchBand(COLOR_CODES, COLOR_CODES.length, bandsList[i]);
    		if(isFound == -1) {
    			isInvalidInputExist = true;
    			System.out.println("Invalid color: " + bandsList[i]);
    		}
    	}
    	System.out.println();
		
    	return bandsList;
	}


	/**
	 * This method is used as a helper function to check
	 * if the band inputted by the user exist in the list.
	 * The method will return the subscript of the element that matches the target,
	 * otherwise returns -1.
	 * 
	 * @param COLOR_CODES This is an array of strings representing the available colors and the first parameter for calculateResistanceValue method
	 * @param size This represent the size of the array COLOR_CODES
	 * @param target This represent the target band that will be searched through the list
	 * 
	 * @return int This return an integer value that will determine if the target band is in the list.
	 */
	public static int searchBand(String[] COLOR_CODES, int size, String target) {
		/*
		 Check if the target band is in the string of color codes
		 then return the subscript of the color code if it matches the target, otherwise return -1
		*/ 
		for (int i = 0; i < size; i++){
			if (COLOR_CODES[i].equals(target)){
				return i;
			}
		}
		return -1;
	}


	/**
	 * This method is used to calculate the resistance value of the resistor's three bands.
	 * 
	 * @param bandsList This is an array of strings representing the color of the resistor's three bands and the first parameter for calculateResistanceValue method
	 * @param size This represent the size of the array bandsList and the second parameter for calculateResistanceValue method
	 * 
	 * @return int This return an integer value representing the resistance value of the three resistor's three bands.
	 */
	public static int calculateResistanceValue(String[] bandsList, int size) {
		// Declarations and initializations
		final String[] COLOR_CODES = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
		int[] index = new int[size];
		for(int i = 0; i < size; i++){
			index[i] = searchBand(COLOR_CODES, COLOR_CODES.length, bandsList[i]);
		}

		//Calculation to get resistance value
		int resistance = (index[0] * 10 + index[1]) * (int) Math.pow(10, index[2]);
		
		// Returning int value
		return resistance / 1000; 	// The resistance value (ohms) is divided by 1000 to convert it into kilo-ohms
	}


	/**
	 * This is the main method which run the application
	 */
	public static void main(String[] args) {
		// Run the program repeatedly until the user chooses to exit
		System.out.println("++++++++++++++++++++ OHMS ++++++++++++++++++++");
		char choice = 'y';
		do {
			// Getting the colors of the resistor's three bands
			String[] threeBands = getThreeBands();

			if(!isInvalidInputExist) {
				// Getting the resistance color value of the resistor's three bands
				int resistanceValue = calculateResistanceValue(threeBands, threeBands.length);

				// Displaying the result
				System.out.printf("Resistance value: %d kilo-ohms\n\n", resistanceValue);

			}
			// Keep prompting the user if they still want to decode until they enter a valid input
			while(true) {
				System.out.println("Do you want to decode another resistor?");
				System.out.print("=> ");
				choice = in.next().charAt(0);
				choice = Character.toLowerCase(choice);		// To make sure that the input will be in lowercase regardless

				if(choice == 'y' || choice == 'n') {
					break;
				} else {
					System.out.println("Please enter 'y' or 'n' only!\n");
				}
			}
		} while(choice != 'n');
		in.close();		// Closing the Scanner object to avoid resource leak
		System.out.println("++++++++++++++++++++ THANK YOU ++++++++++++++++++++");
	}

}

