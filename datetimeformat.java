package java_extras;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class datetimeformat {
public static void main(String args[]) {
	LocalDateTime ldt1 = LocalDateTime.now();// date
	System.out.println(ldt1);// 
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	DateTimeFormatter dtf2= DateTimeFormatter.ISO_LOCAL_DATE;
	DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd:mm:yyy --- E  am: a");// here 'E' is for day of week
//	'a' : for am pm
	// fromat
	System.out.println(dtf1);
	String date1=ldt1.format(dtf2);// here custome fromater;
	String date2=ldt1.format(dtf2);// here custome fromater;
	String date3=ldt1.format(dtf3);// here custome fromater;
	
	
	System.out.println("date :"+date1);
	System.out.println("date :"+date2);	
	System.out.println("date :"+date3);
}
}
