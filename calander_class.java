package java_extras;

import java.util.Calendar;
import java.util.TimeZone;

public class calander_class {
	
public static void main(String args[]) {
Calendar c1 = Calendar.getInstance();// here we can get the instance pf the calnderclass because its an abstract class we cant create its object 
System.out.println(c1.getCalendarType());// to get which type of calander is using
System.out.println(c1.getTimeZone());// to get current time zone
System.out.println(c1.getTimeZone().getID());// to get current time zone id

//here we set a time zone 
Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
System.out.println(c2.getTimeZone());// to get current time zone
// when we does not enter correct time zone id :
Calendar c3 = Calendar.getInstance(TimeZone.getTimeZone("qfewfw"));
System.out.println(c3.getTimeZone());// to get current time zone

}
}
