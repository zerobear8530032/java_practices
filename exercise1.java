//create a program to calculate the percentage of the
//given student in CBSE board his marks from 5 subject must be taken as input from the keyboard (marks are out of 100)
package exercise;
import java.util.Scanner;
public class exercise1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		byte sub1,sub2,sub3,sub4,sub5;
		
		System.out.println("enter the marks of subject 1:");
		sub1=sc.nextByte();
		System.out.println("enter the marks of subject 2:");
		sub2=sc.nextByte();
		System.out.println("enter the marks of subject 3:");
		sub3=sc.nextByte();
		System.out.println("enter the marks of subject 4:");
		sub4=sc.nextByte();
		System.out.println("enter the marks of subject 5:");
	    sub5=sc.nextByte();
	    System.out.println("enter the maximum marks of the subject :");
		float maxmarks=sc.nextFloat();
		
	    float percentage=((sub1+sub2+sub3+sub4+sub5)/(5*maxmarks))*100;
	    System.out.println("the total percentage of the student is :"+percentage);
		
	}

}
