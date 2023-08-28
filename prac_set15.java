package advance_java;
import java.util.Scanner;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class prac_set15 {
public static <GetDate> void main(String args[]) {
//	QUESTION 1:	CREATE A ARRAY LIST WITH 10 NAMES OF STUDENT AND PRINT IT WITH FOREACH LOOP;
//	ArrayList<String> al1= new ArrayList<>();
//	al1.add("saboor");
//	al1.add("zara");
//	al1.add("aman");
//	al1.add("sahu");
//	al1.add("hunaid");
//	al1.add("almas");
//	al1.add("sanidhya");
//	al1.add("gupta");
//	al1.add("almas");
//	al1.add("danish");
//for(String e :al1) {
//	System.out.println(e);
//}

//	QUESTION 2:USE DATE CLASS IN JAVA TO PRINT TIME IN HRS:MINUTES:SECONDS:
	Date d1 = new Date();
System.out.println(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());	
//  QUESTION 3: USE CALANDER CLASS TO DO QUESTION 2:
Calendar c1 = Calendar.getInstance();
System.out.println(Calendar.HOUR+":"+Calendar.MINUTE+":"+Calendar.SECOND);	
//	QUESTION 4: USE JAVA TIME API TO DO QUESTION 2:
LocalDateTime date = LocalDateTime.now();
DateTimeFormatter dft1= DateTimeFormatter.ofPattern("H:m:s");
String d= date.format(dft1);
System.out.println(d);

//	QUESTION 5: CREATE A SET AND TRY TO INSERT A DUPLICATED VALUE:
//	set s an interface so cant create it
}
}

