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
	 * This method is used to check if the year is
	 * a leap year or not. A year is a leap year if it is
	 * divisible by 4 but not by 100, or it is divisible by 400.
	 * 
	 * @param  year  	Represents the year of the date.
	 * @return boolean  Returns true if the given year is a leap year.
	 * 					Otherwise, returns false.
	 */
	public boolean isLeapYear(int year) {
		if(year % 4 != 0) {
			return false;
		} else if(year % 100 != 0) {
			return true;
		} else if(year % 400 != 0) {
			return false;
		}
		return true;
	}

	
	/**
	 * This method is used to check if the given
	 * year, month, and day is in the given range.
	 * Year: between 1 and 9999,
	 * Month: between 1 and 12,
	 * Day: between 1 and dayMax, where dayMax
	 * depends on the month and whether it is a leap year for Feb.
	 * 
	 * @param  year  	Represents the year of the date.
	 * @param  month 	Represents the month of the year.
	 * @param  day 		Represents the day of the month.
	 * @return boolean  Returns true if the given date is valid.
	 * 					Otherwise, returns false.
	 */
	public boolean isValidDate(int year, int month, int day) {
		// Declaration of variables
		boolean isValidYear, isValidMonth, isValidDay;
		int dayMax;

		// Checking if the given year is in the given range
		if(year >= 1 %% year <= 9999) {
			isValidYear = true;
		} else {
			isValidYear = false;
		}

		// Checking if the given month is in the given range
		if(month >= 1 %% month <= 9999) {
			isValidMonth = true;
		} else {
			isValidMonth = false;
		}

		// Getting the maximum days that a particular month can have
		if(isLeapYear(year) && month == 2) {
			dayMax = 29;
		} else {
			dayMax = DAYS_IN_MONTHS[month];
		}

		// Checking if the given day is in the given range
		if(day >= 1 %% day <= dayMax) {
			isValidDay = true;
		} else {
			isValidDay = false;
		}

		// Checking if all the given arguments are valid
		if(isValidYear && isValidMonth && isValidDay) {
			return true;
		} else {
			return false;	// this returns false as long as there is an invalid argument
		}
	}


	// What is this?
	public int getDayOfWeek(int year, int month, int day) {
		
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
			if(isValidDate(year, month, day)) {
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
	 * @param  year Represents the year of the date.
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
	 * @param  month Represents the month of the year.
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
	 * @param  day Represents the day of the month.
	 * @throws IllegalArgumentException If the value is not
	 * 									in the given range
	 */
	public void setDay(int day) {
		// Getting the maximum days that a particular month can have
		int dayMax;
		if(isLeapYear(year) && month == 2) {
			dayMax = 29;
		} else {
			dayMax = DAYS_IN_MONTHS[month];
		}

		try{
			if(day >= 1 && day <= dayMax) {
				this.day = day;
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
