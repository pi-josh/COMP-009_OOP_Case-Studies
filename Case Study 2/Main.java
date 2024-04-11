/**
 * This Main program creates MyData instances and utilize its methods and attributes.
 * This serves as a test program that will check the efficiency of MyDate class. 
 * 
 * @author Cassidy Fernandez
 * @author Dominic Syd Aldas
 * @author Joshua Macatunao
 * @author Rafael Lafuente
 * 
 * @version April 8, 2024
 */

public class Main {
	public static void main(String[] args) {
		// First instance of the MyDate class
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);
		System.out.println(d1.nextDay());
		System.out.println(d1.nextDay());
		System.out.println(d1.nextMonth());
		System.out.println(d1.nextYear());

		// Second instance of the MyDate class
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);
		System.out.println(d2.previousDay());
		System.out.println(d2.previousDay());
		System.out.println(d2.previousMonth());
		System.out.println(d2.previousYear());

		// Third instance of the MyDate class
		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());

		/*
		 For checking the exception handling when instantiating with an invalid date.
		 Just remove the "//" to run the line of code.
		*/
		// MyDate d4 = new MyDate(2099, 11, 31);
		// MyDate d5 = new MyDate(2011, 2, 29);
	}
}