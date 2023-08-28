package dumy;
import java.util.Scanner;
public class switchcase_in_java {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("enter your age :");
//	int age=sc.nextInt();
//	
//	if(age>=50) {
//		System.out.println("you are experienced ");
//	}
//	else if(age>=45){
//		System.out.println("you are semi-experienced ");
//	}
//	else if(age>=35) {
//		System.out.println("you are semi-semi-experinced");
//	}
//	else {
//		System.out.println("you need more experinced");
//		
//	}
	
	// SWITCH CASE
	System.out.println("enter a number from 1 to 7 :");
	int number=sc.nextInt();	
	switch(number) {
	case 1:
		System.out.print("monday");
	break;	
	case 2:
		System.out.print("tuesday");
	break;	
	case 3:
		System.out.print("wednesday");
	break;	
	case 4:
		System.out.print("thursday");
	break;	
	case 5:
		System.out.print("friday");
	break;	
	case 6:
		System.out.print("saturday");
	break;	
	case 7:
		System.out.print("sunday");
	break;	
	default:
		System.out.println("wrong number");
	
	
	
	
	
	
	
	
	}
}
}
