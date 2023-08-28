package dumy;
import java.util.Scanner;
public class if_else_conditionals {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int age;
	
	System.out.println("enter your age :");
	age=sc.nextInt();
	
	if(age>18) {
		System.out.println("you can drive car");
		
	}
	else {
		System.out.println("no sorry you cant drive car ");
	}
}
}
