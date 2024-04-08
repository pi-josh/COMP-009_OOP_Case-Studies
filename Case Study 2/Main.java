/**
 * This Main program creates MyData instances and utilize its methods and attributes.
 * This serves as a test program that will check the efficiency of MyDate class. 
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 * @version April 8, 2024
 */

public class Main {
	/*
	 * Documentation here
	 */
	public static void main(String[] args) {

		// lorem ipsum
		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);
		System.out.println(d1.nextDay());
		System.out.println(d1.nextDay());
		System.out.println(d1.nextMonth());
		System.out.println(d1.nextYear());

		// lorem ipsum
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);
		System.out.println(d2.previousDay());
		System.out.println(d2.previousDay());
		System.out.println(d2.previousMonth());
		System.out.println(d2.previousYear());

		// lorem ipsum
		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());

		// MyDate d4 = new MyDate(2099, 11, 31);
		// MyDate d5 = new MyDate(2011, 2, 29);
	}
}