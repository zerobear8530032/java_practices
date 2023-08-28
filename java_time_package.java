package java_extras;
import java.time.*;
public class java_time_package {
public static void main(String args[]) {
//	here the date objects are immutable
	
	LocalDate lc1= LocalDate.now();// printing date creating object instance
System.out.println("local date "+lc1);
LocalTime lt1= LocalTime.now();// printing time creating object instance
System.out.println("local time"+lt1);
LocalDateTime ldt1= LocalDateTime.now();
System.out.println("local date time : "+ldt1);
}
}
