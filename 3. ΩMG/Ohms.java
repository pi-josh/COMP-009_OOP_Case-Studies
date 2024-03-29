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
 */

import java.util.Scanner;

public class Ohms {
	/*
	 Scanner method named in to get the input from the user
	 to be used all throughout the program
	*/
	static Scanner in = new Scanner(System.in);

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

			// Getting the resistance color value of the resistor's three bands
			int resistanceValue = calculateResistanceValue(threeBands, threeBands.length);

			// Displaying the result
			System.out.printf("Resistance value: %d kilo-ohms\n\n", resistanceValue);

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
		System.out.println("++++++++++++++++++++ THANK YOU ++++++++++++++++++++");
	}

	// Dom
	/**
	 * This method is used to get the colors of the resistor's three bands.
	 * The user will be prompted to input the color of each making sure that it is not in CAPS.
	 * It will then call the searchBand method to 
	 * 
	 * @return String[] This return an array of strings that represent the color the resistor's three bands
	 */
	public static String[] getThreeBands() {
		// List of color codes
		final String[] COLOR_CODES = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

		// TODO: Prompt the user to input the colors of the three bands

		// TODO: Check if each color inputted exist in the available color codes

		// TODO: Return the array of the colors of the resistor's three bands here
		return new String[] {"this", "is", "temporary"};
	}

	// Cas
	/**
	 * This method is used as a helper function to check
	 * if the band inputted by the user exist in the list.
	 * The method will return the subscript of the element that matches the target,
	 * otherwise returns -1.
	 * 
	 * @param COLOR_CODES This is an array of strings representing the available colors and the first parameter for calculateResistanceValue method
	 * @param size This represent the size of the array bandsList
	 * @param target This represent the target band that will be searched through the list
	 * 
	 * @return int This return an integer value that will determine if the target band is in the list.
	 */
	public static int searchBand(String[] COLOR_CODES, int size, int target) {
		// TODO: Check if the target band is in the string of color codes (you can use a for loop here)
		// then return the subscript of the color code if it matches the target, otherwise return -1

		return -1;
	}

	// Raf
	/**
	 * This method is used to calculate the resistance value of the resistor's three bands.
	 * 
	 * @param bandsList This is an array of strings representing the color of the resistor's three bands and the first parameter for calculateResistanceValue method
	 * @param size This represent the size of the array bandsListand the second parameter for calculateResistanceValue method
	 * 
	 * @return int This return an integer value representing the resistance value of the three resistor's three bands.
	 */
	public static int calculateResistanceValue(String[] bandsList, int size) {
		// TODO: Calculate here (you can comment/explain on how you come up with the solution in solving it)

		// TODO: Return the value here
		return -1; // temporary lang
	}

}
