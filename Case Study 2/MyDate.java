/**
 * This class serves as a template for creating new MyDate instances.
 * It provides a basic structure and functionality
 * to be able to customize and manipulate dates.
 * 
 * @author Cassidy Fernandez
 * @author Dominic Syd Aldas
 * @author Joshua Macatunao
 * @author Rafael Lafuente
 * 
 * @version April 8, 2024
 */

public class MyDate {
	// Declaration of private instance variables
	private int year;
	private int month;
	private int day;

	// Declaration and initialization of array of constant variables
	public static final String MONTHS[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
										   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String DAYS[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
									     "Thursday", "Friday", "Saturday"};
	public static final int DAYS_IN_MONTHS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * A class constructor that will set the date
	 */ 
	@constructor
	public MyDate(year, month, day) {
		setDate(year, month, day);	// Calling setDate method here
	}


	/**
	 * This method is used to set the date once validated
	 * by the isValidDate method. Otherwise,
	 * it willthrow an exception.
	 * 
	 * @param year  Represents the year of the date.
	 * @param month Represents the month of the year.
	 * @param day 	Represents the day of the month.
	 * @throws IllegalArgumentException If one of the
	 * 									parameter is invalidated
	 */
	public void setDate(int year, int month, int day) {
		try {
			if(isValidDate()) {
				this.year = year;
				this.month = month;
				this.day = day;
			} else {
				throw IllegalArgumentException;
			}
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid year, month, or day!");
			System.err.println(e + "\n");
		}
	}


	/**
	 * This method changes the value of year instance variable
	 * if the given year is between 1 and 9999. Otherwise,
	 * it shall throw an exception with a message
	 * 
	 * @param year Represents the year of the date.
	 * @throws IllegalArgumentException If the value is not
	 * 									in the given range
	 */
	public void setYear(int year) {
		try{
			if(year >= 1 && year <= 9999) {
				this.year = year;
			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid year!");
			System.err.println(e + "\n");
		}
	}


	/**
	 * This method changes the value of month instance variable
	 * if the given month is between 1 and 12. Otherwise,
	 * it shall throw an exception with a message
	 * 
	 * @param month Represents the month of the year.
	 * @throws IllegalArgumentException If the value is not
	 * 									in the given range
	 */
	public void setMonth(int month) {
		try{
			if(month >= 1 && month <= 12) {
				this.month = month;
			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid month!");
			System.err.println(e + "\n");
		}
	}


	/**
	 * This method changes the value of day instance variable
	 * if the given day is between 1 and dayMax, where dayMax
	 * depends on the month and whether it is a leap year for Feb.
	 * Otherwise, it shall throw an exception with a message
	 * 
	 * @param day Represents the day of the month.
	 * @throws IllegalArgumentException If the value is not
	 * 									in the given range
	 */
	// may kulang pa rito
	public void setDay(int day) {
		try{
			if() {

			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid day!");
			System.err.println(e + "\n");
		}
	}


	// What is this?
	public int getYear() {
		return year;
	}


	// What is this?
	public int getMonth() {
		return month;
	}


	// What is this?
	public int getDay() {
		return day;
	}


	// What is this?
	public String toString() {
		// Format something here

		// Return something here
	}


	// What is this?
	public String nextDay() {
		// toString() method will be used here(?)

		// Return something here
	}


	// What is this?
	public String nextMonth() {
		// toString() method will be used here(?)

		// Return something here
	}


	// What is this?
	public String nextYear() {
		// toString() method will be used here(?)

		// Return something here
	}


	// What is this?
	public String previousDay() {
		// toString() method will be used here(?)

		// Return something here
	}


	// What is this?
	public String previousMonth() {
		// toString() method will be used here(?)

		// Return something here
	}


	// What is this?
	public String previousYear() {
		// toString() method will be used here(?)

		// Return something here
	}
}