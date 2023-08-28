package exercise;
import java.util.Scanner;
public class prac_set1 {
public static void main( String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
//	question1 : add 3 numbers 
//	
//	System.out.println("enter the number 1 : ");
//	float f1=sc.nextFloat();
//	System.out.println("enter the number 1 : ");
//	float f2=sc.nextFloat();
//	System.out.println("enter the number 1 : ");
//	float f3=sc.nextFloat();
//	
//	System.out.println("the sum of all 3 numbers are :"+(f1+f2+f3));
//	
	
//	question 2: calculate cgpa of student which get marks out of 100;
//	System.out.println("enter the marks of subject 1 : ");
//	float sub1=sc.nextFloat();
//	System.out.println("enter the marks of subject 1 : ");
//	float sub2=sc.nextFloat();
//	System.out.println("enter the marks of subject 1 : ");
//	float sub3=sc.nextFloat();
//	
//	float cgpa=(sub1+sub2+sub3)/30;
//	
//		System.out.println("the cgpa is :"+cgpa );	
	
//question 3 :take a name as input from user and print a msg 
//	
//	System.out.println("enter your name :");
//	String name= sc.nextLine();
//	
//	System.out.format("hello  %s have a good day ",name);

// question 4: km to miles 
//	System.out.println("enter the distance in km :");
//	float km=sc.nextFloat();
//	float miles= km*0.621371F;
//	System.out.println("the "+km+" are in :- "+miles );
	
//	check wheater the number enter by user is a integer or not :
	
	System.out.println("enter a number  :");
	
	boolean b= sc.hasNextInt();
	System.out.println(b);
}
}
