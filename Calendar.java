/** 
 * Prints the calendar of a given year.
 */
public class Calendar {	
	// Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars the given year.
	 */
	public static void main(String args[]) {
		int inputYear = Integer.parseInt(args[0]);
		// Advances the date and the day-of-the-week from 1/1/1900 till the given year.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
		while (year < inputYear) {
			advance();
		}


		// Starting to print the calendar of the given year
	 	while (year == inputYear) {
			if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
			advance();
		}
        }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfWeek < 7) dayOfWeek++;
		else if (dayOfWeek == 7) dayOfWeek = 1;
		if (dayOfMonth < nDaysInMonth) dayOfMonth++;
		else if (dayOfMonth == nDaysInMonth) {
			dayOfMonth = 1;
			if (month < 12) {
				month++;
				nDaysInMonth = nDaysInMonth(month, year);
			}
			else if (month == 12) {
				month = 1;
				nDaysInMonth = nDaysInMonth(month, year);
				year++;
			}
		}
	} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                return 31;

            case 4: 
            case 6: 
            case 9: 
            case 11: 
                return 30;

            case 2:
                if (isLeapYear(year)) return 29;
				else return 28;
			
			default:
				return -1;
		}
	}
}
