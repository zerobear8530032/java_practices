package exercise;
import java.util.Scanner; 
class maxRetries extends Exception{
public String toString() {
return "you exceeded you tryied limit";
	}
public String getMessage() {
	return "you exceeded you tryied limit";
}
	
	
}
public class prac_set14 {
	public static void method() throws maxRetries {
		Scanner sc = new Scanner(System.in);
	int marks []= {12,43,54,34,32,23,51};
	int j=1;
	while(true) {
	try {
			System.out.println("enter the index value");
			int i =sc.nextInt();
			if(marks.length<=i || i<0) {
				throw new maxRetries();
			}
			System.out.println("the index value is : "+marks[i]);
		
	}catch(maxRetries e) {
		if(j==6) {
			System.out.println(e);
			break;
		}else {
			
		System.out.println("try again : ");
		j++;
		}
	}
}
}
static void divide (int a,int b) {
	
	System.out.println(a/b);
	
}
	
public static void main(String args[]) {
//	QUEESTION 1:WRITE A PROGRAM TO DEMONSTRATE SYNTAX,LOGICAL ERROR , AND RUNTIME ERROR:
	Scanner sc = new Scanner(System.in);
//	1 : SYNTAX ERROR
//int a=10
//System.out.println("this is the value of a",a);

//  2 :	logical error :
//	2 wap to get the number is even or odd:
	
//	int a=sc.nextInt();
//	if(a/2==0) {
//		System.out.println("even");
//	}
//	else {
//		System.out.println("odd");
//	}
	
//	3: runtime error:
//	try {
//	System.out.println(10/0);
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
	
//  QUESTION 2: WRITE A JAVA PROGRAM TO PRINT HAHA WHEN AN ARITHMETIC EXCEPTION OCCUR AND HEHE WHEN ILLEGALARGUMENTEXCEPTION OCCUR:
//	try {
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		
//	divide(a,b);
//	}catch(ArithmeticException ae) {
//		System.out.println("HAHA arithmetic exception");
//	}catch(IllegalArgumentException ie) {
//		System.out.println("HEHE illegalArgumentException");
//	}
//	QUESTION 3: CREATE A PROGRAM TAKING INDEX AS INPUT UNTILL A INVALID INDEX IS GIVEN  5 TIMES PRINT ERROR:
//	int marks []= {12,43,54,34,32,23,51};
//	int j=1;
//	while(true) {
//	try {
//			System.out.println("enter the index value");
//			int i =sc.nextInt();
//			System.out.println("the index value is : "+marks[i]);
//		
//	}catch(ArrayIndexOutOfBoundsException e) {
//		if(j==6) {
//			System.out.println("error");
//			break;
//		}else {
//			
//		System.out.println("try again : ");
//		j++;
//		}
//	}
//}
//	System.out.println("exit the code...");

// QUESTION  CREATE CUSTOM EXCEPTION ON QUESTION 3:
//	int marks []= {12,43,54,34,32,23,51};
//	int j=1;
//	while(true) {
//	try {
//			System.out.println("enter the index value");
//			int i =sc.nextInt();
//			if(marks.length<=i || i<0) {
//				throw new maxRetries();
//			}
//			System.out.println("the index value is : "+marks[i]);
//		
//	}catch(maxRetries e) {
//		if(j==6) {
//			System.out.println(e);
//			break;
//		}else {
//			
//		System.out.println("try again : ");
//		j++;
//		}
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("wrong index ");
//	}
//}
//	
//	QUESTION 5: CREATE A METHOD OUT OF QUESTION 3 WHICH GIVE CUSTOM EXCEPTION:
	try {
		method();
	} catch (maxRetries e) {
	System.out.println(e);
		e.printStackTrace();
	}
}
}
