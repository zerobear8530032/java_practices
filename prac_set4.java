package exercise;
import java.util.Scanner;
public class prac_set4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
//		question1 :
//		int a=10;
//		if(a==11) {
//			System.out.println("i am 11");
//		}
//		else {
//			System.out.println("i am not eleven");
		//		}
		
//		question 2: write a program  to calculate marks of student in 3 subject and tell if pass or fail if it get less then 33%  in any subject
//		System.out.println("enter the marks of subject 1");
//		float sub1=sc.nextFloat();
//		System.out.println("enter the marks of subject 2");
//		float sub2=sc.nextFloat();
//		System.out.println("enter the marks of subject 3");
//		float sub3=sc.nextFloat();
//		float total = sub1+sub2+sub3;
//		float percentage= total/3.0F;
//		if(sub1 < 33 | sub2<33 | sub3<33) {
//			System.out.println("youn failed the exam");
//		}
//		else if(percentage<40) {
//			System.out.println("you failed the exams");
//		}
//		else {
//			System.out.println("you passed the exams ");
//		}

//		question 3: wap to calculate income tax:
//		System.out.println("enter your earnings (in laks):");
//		float earning=sc.nextFloat();
//		float tax =0;
//		if(earning<2.5) {
//			System.out.println("you need to pay no tax");
//		}
//		else if(earning>=2.5 && earning<5.0F) {
//			System.out.println("you need to pay tax of 5%:");	
//			tax = tax+0.05f*(earning -2.5f);
//			System.out.print(tax);
//		}
//		
//		else if(earning>=5.0F && earning<10.0F) {
//			System.out.println("you need to pay tax of 10%:");	
//			tax = tax+0.05f*(earning -2.5f);
//			tax = tax+0.2f*(earning -5f);
//			System.out.print(tax);
//		}
//		else {
//			System.out.println("you need to pay tax of 30%:");	
//			tax = tax+0.05f*(earning -2.5f);
//			tax = tax+0.2f*(earning -5f);
//			tax = tax+0.3f*(earning -10f);
//			System.out.print(tax);
//		}
		
		
		
//question 4:		wap with switch case statement
//		System.out.println("enter a number from 1 to 7 :");
//		int number=sc.nextInt();	
//		switch(number) {
//		case 1:
//			System.out.print("monday");
//		break;	
//		case 2:
//			System.out.print("tuesday");
//		break;	
//		case 3:
//			System.out.print("wednesday");
//		break;	
//		case 4:
//			System.out.print("thursday");
//		break;	
//		case 5:
//			System.out.print("friday");
//		break;	
//		case 6:
//			System.out.print("saturday");
//		break;	
//		case 7:
//			System.out.print("sunday");
//		break;	
//		default:
//			System.out.println("wrong number");
//		
//	}
		
//		question 6: leap year program 
//		System.out.println("enter a year :");
//		int year=sc.nextInt();
//		if(year%4==0 && year%100==0 && year%400==0 ) {
//			System.out.println("its a leap year");
//		}
//		else {
//			System.out.println("its not a leap year ");
//		}
//		
	
//	question 7: find type of website :
		System.out.println("enter the url :");
		String url= sc.nextLine();
		if(url.endsWith(".org")) {
			System.out.println("organizational website");
		}
		else if(url.endsWith(".in")) {
			System.out.println("indian website");
		}
		else if(url.endsWith(".gov")) {
			System.out.println("government website");
		}
		else {
			System.out.println("idk");
		}
	}
		
}
