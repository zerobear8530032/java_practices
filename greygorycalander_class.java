package java_extras;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class greygorycalander_class {
public static void main(String args[]) {
	Calendar c1 = Calendar.getInstance();
	System.out.println(c1.getTime());// get date
	
	System.out.println(c1.get(Calendar.YEAR));// date in no of year
	System.out.println(c1.get(Calendar.MONTH));// date in in month
	System.out.println(c1.get(Calendar.DATE));// day
	System.out.println(c1.get(Calendar.MINUTE));// ninutes
	System.out.println(c1.get(Calendar.SECOND));// SECONDS
	System.out.println(c1.get(Calendar.HOUR));// hours in 12 hrs clock
	System.out.println(c1.get(Calendar.HOUR_OF_DAY));// hours in 24 hr clock
//	 whole time :
	
	System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));// hours in 24 hr clock

//	gregorian calander class is a concrete class:
	
	GregorianCalendar gc1 = new GregorianCalendar();
	
System.out.println(gc1.isLeapYear(1904));
//	printing all time zones:
	for (String e:TimeZone.getAvailableIDs()) {
		System.out.println(e);
	}
	
}
}
