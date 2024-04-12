/**
 * This Test2 program tests the nextDay() in a loop, by printing the dates from 28 Dec 2011
 * to 2 Mar 2012.
 * 
 * @author Cassidy Fernandez
 * @author Dominic Syd Aldas
 * @author Joshua Macatunao
 * @author Rafael Lafuente
 * 
 * @version April 12, 2024
 */

public class Test2 {
	public static void main(String[] args) {
		// Instantiating a MyDate class
		MyDate d1 = new MyDate(2011, 12, 28);

		// Printing the dates in a loop from 28 Dec 2011 to 2 Mar 2012
		System.out.println("Printing the dates:");
		System.out.println(d1);
		while(d1.getYear() != 2012 || d1.getMonth() != 3 || d1.getDay() != 2) {
			System.out.println(d1.nextDay());
		}
	}
}