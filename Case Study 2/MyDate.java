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
 * @version April 12, 2024
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
	 * A class constructor that will initialize the date
	 */ 
	public MyDate(int year, int month, int day) {
		setDate(year, month, day);	// Calling setDate method here
	}
  
  
	/**
	 * This method is used to check if the year is
	 * a leap year or not. A year is a leap year if it is
	 * divisible by 4 but not by 100, or it is divisible by 400.
	 * 
	 * @param  year  	Represents the year of the date.
	 * @return boolean 	Returns true if the given year is a leap year.
	 * 					Otherwise, returns false.
	 */
	public static boolean isLeapYear(int year) {
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
	 * @return boolean 	Returns true if the given date is valid.
	 * 					Otherwise, returns false.
	 */
	public static boolean isValidDate(int year, int month, int day) {
		// Declaration of variables
		boolean isValidYear, isValidMonth, isValidDay;
		int dayMax;

		// Checking if the given year is in the given range
		if(year >= 1 && year <= 9999) {
			isValidYear = true;
		} else {
			isValidYear = false;
		}

		// Checking if the given month is in the given range
		if(month >= 1 && month <= 9999) {
			isValidMonth = true;
		} else {
			isValidMonth = false;
		}

		// Getting the maximum days that a particular month can have
		if(isLeapYear(year) && month == 2) {
			dayMax = 29;
		} else {
			dayMax = DAYS_IN_MONTHS[month - 1];
		}

		// Checking if the given day is in the given range
		if(day >= 1 && day <= dayMax) {
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


	/**
	 * This method is used to get the corresponding day of the week,
	 * assuming that the given date is already validated.
	 * 
	 * @param  year  Represents the year of the date.
	 * @param  month Represents the month of the year.
	 * @param  day 	 Represents the day of the month.
	 * @return int 	 Returns the day of the week, where 0 for Sun,
	 * 				 1 for Mon, ..., 6 for Sat, for the given date.
	 */
	public static int getDayOfWeek(int year, int month, int day) {
		// Declaration of variables
		int dayOfWeek, m;

		// Lookup table of month offsets where index 0 = Jan, 1 = Feb, ..., 11 = Dec
		final int COMMON_YEAR[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		final int LEAP_YEAR[] = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};

		// Determining the month-related offset m by using the lookup table with month
		if(isLeapYear(year)) {
			m = LEAP_YEAR[month - 1];
		} else {
			m = COMMON_YEAR[month - 1];
		}

		// Determining the day-of-week using Gauss's algorithm based on Gregorian calendar
		dayOfWeek = (day + m + 5 * ((year - 1)%4) + 4 * ((year - 1)%100) + 6 * ((year - 1)%400))%7;

		return dayOfWeek; // returning value here
	}


	/**
	 * This method is used to set the date once validated
	 * by the isValidDate method. Otherwise,
	 * it will throw an exception.
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
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid year, month, or day!");
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
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid year!");
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
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid month!");
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
			dayMax = DAYS_IN_MONTHS[month - 1];
		}

		try{
			if(day >= 1 && day <= dayMax) {
				this.day = day;
			} else {
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid day!");
		}
	}


	/**
	 * This method returns the current value of the year of the date
	 * of the current instance class
	 * 
	 * @return int Returns the year of the date.
	 */
	public int getYear() {
		return this.year;
	}


	/**
	 * This method returns the current value of the month of the year
	 * of the current instance class
	 * 
	 * @return int Returns the month of the year.
	 */
	public int getMonth() {
		return this.month;
	}


	/**
	 * This method returns the current value of the day of the month
	 * of the current instance class
	 * 
	 * @return int Returns the day of the month.
	 */
	public int getDay() {
		return this.day;
	}


	/**
	 * This method formats the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the current date.
	 */
	@Override
	public String toString() {
		// Initialization of variables
		String stringMonth = MONTHS[month - 1];
		String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];	// calling the getDayOfWeek method here

		// Formatting the string here
		String stringDate = String.format("%s %d %s %d", dayOfWeek, day, stringMonth, year);
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a day after the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a day after the current date.
	 */
	public String nextDay() {
		// Getting the maximum day of the current month
		int dayMax;
		if(isLeapYear(year) && month == 2) {
			dayMax = 29;
		} else {
			dayMax = DAYS_IN_MONTHS[month - 1];
		}

		// Getting the next day of the current date
		day += 1;
		if(day > dayMax) {
			day -= dayMax;
			month += 1;
			if(month > 12) {
				month -= 12;
				year += 1;
			}
		}

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a month after the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a month after the current date.
	 */
	public String nextMonth() {
		// Getting the next month of the current date
		month += 1;
		if(month > 12) {
			month -= 12;
			year += 1;
		}

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a year after the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a year after the current date.
	 */
	public String nextYear() {
		// Getting the next year of the current date
		year += 1;

		// Checking if the next year is not a leap year
		if(!isLeapYear(year) && day == 29) {
			day = 28;
		}

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a day before the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a day before the current date.
	 */
	public String previousDay() {
		// Getting the maximum day of the current month
		int dayMax;
		if(isLeapYear(year) && month == 2) {
			dayMax = 29;
		} else {
			dayMax = DAYS_IN_MONTHS[month - 1];
		}

		// Getting the previous day of the current date
		day -= 1;
		if(day == 0) {
			if(isLeapYear(year) && month == 2) {
				dayMax = 29;
			} else {
				dayMax = DAYS_IN_MONTHS[month - 1];
			}
			day = dayMax;
			month -= 1;
			if(month == 0) {
				month = 12;
				year -= 1;
			}
		}

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a month before the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a month before the current date.
	 */
	public String previousMonth() {
		// Getting the previous month of the current date
		month -= 1;
		if(month == 0) {
			month = 12;
			year -= 1;
		}
		day = DAYS_IN_MONTHS[month - 1];

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}


	/**
	 * This method formats the date a year before the current date to return a clean output.
	 * The string is in the format: "xxxday d mmm yyyy", for example, "Tuesday 14 Feb 2012".
	 * 
	 * @return String Returns the formatted string of the date a year before the current date.
	 */
	public String previousYear() {
		// Getting the previous year of the current date
		year -= 1;
		day = DAYS_IN_MONTHS[month - 1];
		
		// Checking if the previous year is not a leap year
		if(!isLeapYear(year) && day == 29) {
			day = 28;
		}

		// Getting the formatted date string
		String stringDate = toString();		// calling the toString method here
		
		return stringDate;	// returning value here
	}
}
