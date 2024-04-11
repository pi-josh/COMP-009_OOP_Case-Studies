/**
 * This Main program creates MyData instances and utilize its methods and attributes.
 * This serves as a test program that will check the efficiency of MyDate class. 
 * 
 * @author Cassidy Fernandez
 * @author Dominic Syd Aldas
 * @author Joshua Macatunao
 * @author Rafael Lafuente
 * 
 * @version April 12, 2024
 */

public class Main {
	public static void main(String[] args) {
		// First instance of the MyDate class
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);				// Tuesday 28 Feb 2012
		System.out.println(d1.nextDay());	// Wednesday 29 Feb 2012
		System.out.println(d1.nextDay());	// Thursday 1 Mar 2012
		System.out.println(d1.nextMonth());	// Sunday 1 Apr 2012
		System.out.println(d1.nextYear());	// Monday 1 Apr 2013
		System.out.println();

		// Second instance of the MyDate class
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);					// Monday 2 Jan 2012
		System.out.println(d2.previousDay());	// Sunday 1 Jan 2012
		System.out.println(d2.previousDay());	// Saturday 31 Dec 2011
		System.out.println(d2.previousMonth());	// Wednesday 30 Nov 2011
		System.out.println(d2.previousYear());	// Tuesday 30 Nov 2010
		System.out.println();

		// Third instance of the MyDate class
		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());	// Monday 28 Feb 2011
		System.out.println();

		/*
		 For checking the exception handling when instantiating with an invalid date.
		 Just remove the first "//" to run the line of code.
		*/
		// MyDate d4 = new MyDate(2099, 11, 31);	// Invalid year, month, or day!
		// MyDate d5 = new MyDate(2011, 2, 29);		// Invalid year, month, or day!
		System.out.println();
	}
}