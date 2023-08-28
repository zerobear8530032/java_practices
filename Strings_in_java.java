package dumy;
import java.util.Scanner;
public class Strings_in_java {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
//	 string is the array of characters :it is enclosed into double inverted commas 
//	in java strings are immutable and cannot be changed
//	in java string is a java class but can also be used as a data type
	
//	two ways to create a string :
//	first way :
	String str1= "abdul";
	System.out.println("First way :"+str1);
// second way 
	String str2= new String("saboor");

	System.out.println("Second  way :"+str2);
	
//different ways to print in java:
	
//1:System.out.print("one line")-> this will print a line 
	System.out.print("first line");
	System.out.print("second line\n");
//2: System.out.println("msg")-> this will print the msg and the cursor will get on next line:
	System.out.println("first line");
	System.out.println("second line");
//3: System.out.printf("line")-> this printf is work exactly same as printf() in c which use format specifiers
	int a=345;
	float f=2.354F;
	double d=2.3534566d;
	char c='a';
	String str= "saboor";
	
	
	
	System.out.printf("\nvalue of a : %d",a);// here %d (integer)are format specifiers used to print the variable
	System.out.printf("\nvalue of f : %f",f);// here %f (float)are format specifiers used to print the variable 
	System.out.printf("\nvalue of d : %f",d);// here %f (double)are format specifiers used to print the variable
	System.out.printf("\nvalue of c : %c",c);// here %c (char)are format specifiers used to print the variable
	System.out.printf("\nvalue of a : %s",str);// here %s(string) are format specifiers used to print the variable
//4: Syste.out.format("line")-> same as printf()
	System.out.format("\nvalue of a : %d",a);
	System.out.format("\nvalue of f : %f",f);
	System.out.format("\nvalue of d : %f",d);
	System.out.format("\nvalue of c : %c",c);
	System.out.format("\nvalue of a : %s",str);
	
//	extra format specification:
	System.out.printf("\nvalue of f : %.2f",f);// here %.2f (float)print 2 decimal places 
	System.out.printf("\nvalue of f : %.5f",f);// here %.5f (float)print 5 decimal places	
	System.out.printf("\nvalue of f : %10f",f);// here %10f (float)print value in 10 blank places only
	System.out.printf("\nvalue of f : %10.2f",f);// here %10.2f (float)this leave 10 blank space and  2 decimal places

    String s= "abdul saboor";
	System.out.printf("\nvalue of s : %10.2s",s);// here %10.2f (float)this leave 10 blank space and  2 decimal places

    
	
	
	
	
	
	
	
	
}
}
