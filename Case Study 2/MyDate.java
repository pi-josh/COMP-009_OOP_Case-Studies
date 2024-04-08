/**
 * This class serves as a template for creating new MyDate instances.
 * It provides a basic structure and functionality
 * to be able to customize and manipulate dates.
 * 
 * @author Cassidy Fernandez, Dominic Syd Aldas, Joshua Macatunao, Rafael Lafuente
 * 
 * @version April 8, 2024
 */

public class MyDate {
	// What is this?
	private int year;
	private int month;
	private int day;

	// What is this?
	public static final String MONTHS[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
										   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String DAYS[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
									     "Thursday", "Friday", "Saturday"};
	public static final int DAYS_IN_MONTHS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	@constructor
	public MyDate(year, month, day) {
		setDate(year, month, day);
	}


	// What is this?
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
		}
	}


	// What is this?
	public void setYear(int year) {
		try{
			if() {

			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid year!");
		}
	}


	// What is this?
	public void setMonth(int month) {
		try{
			if() {

			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid month!");
		}
	}


	// What is this?
	public void setDay(int day) {
		try{
			if() {

			} else {
				throw IllegalArgumentException;
			}
		} catch {
			System.err.println("Invalid day!");
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