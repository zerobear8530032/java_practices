package exercise;
import java.util.InputMismatchException;
import java.util.Scanner;

class cannotDivideByZeroException extends Exception{
public String toString() {
	return "the number cannot be divided by zero ";
}
public String getMessage() {
	return "the number cannot be divided by zero ";
	
}	
}

class maxInputException extends Exception{
public String toString() {
	return "the number you entered cannot be greater then 100000";
}
public String getMessage() {
	return "the number  you entered cannot be greater then 100000";
	
}	
}
class maxMultiplierReachExeception extends Exception{
public String toString() {
	return "the number  you entered cannot be multiplied by greater then 7000";
}
public String getMessage() {
	return "the number  you entered cannot be multiplied by greater then 7000";	
}	
}

class cannotDividedByZero extends ArithmeticException{
public String toString() {
	return "the number  you entered cannot be divided by zero";
}
public String getMessage() {
	return "the number  you entered cannot be divided by zero";	
}	
}
//create a calculator:

class calculator{
Scanner sc = new Scanner(System.in);
//add
	public float addition () throws maxInputException{
		float a=0;
		float b=0;
		
		while(true) {
		try {
		System.out.println("enter the  number :");
		a=sc.nextFloat();
		
		System.out.println("enter the  number :");
		b=sc.nextFloat();
		if(a>100000|| b>100000) {
			throw new maxInputException();
		}
		break;
		
		}catch(InputMismatchException e) {
			System.out.println("Please enter invalid input ");
		}catch(maxInputException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println("another exception");
		}
	}
		return a+b;
	}
//	sub
	public float substraction() throws InputMismatchException {
		
			float a=0;
			float b=0;
			
			while(true) {
			try {
			System.out.println("enter the  number :");
			a=sc.nextFloat();
			
			System.out.println("enter the  number :");
			b=sc.nextFloat();
			if(a>100000|| b>100000) {
				throw new maxInputException();
			}
			break;
			
			}catch(InputMismatchException e) {
				System.out.println("Please enter valid input ");
			}catch(maxInputException e) {
				System.out.println(e);
			}catch(Exception e) {
				System.out.println("another exception");
			}
		}
			return a-b;
		}
	
//	mul
	public float multiplication () throws maxMultiplierReachExeception,InputMismatchException {
			float a=0;
			float b=0;
			
			while(true) {
			try {
				
			System.out.println("enter the  number :");
			a=sc.nextFloat();
			
			System.out.println("enter the  number :");
			b=sc.nextFloat();
			if(a>7000 || b>7000) {
				throw new maxMultiplierReachExeception() ; 
			}
			
			break;
			
			}catch(InputMismatchException e) {
				System.out.println("Please enter invalid input ");
			}catch(maxMultiplierReachExeception e) {
				System.out.println(e);
			}catch(Exception e) {
				System.out.println("another exception");
			}
		}
			return a*b;
		}
	
//	div
	public float division () {
		float a=0;
		float b=0;
		
		while(true) {
		try {
		System.out.println("enter the  number :");
		a=sc.nextFloat();
		
		System.out.println("enter the  number :");
		b=sc.nextFloat();
		if(a>100000|| b>100000) {
			throw new maxInputException();
		}
		break;
		
		}catch(InputMismatchException e) {
			System.out.println("Please enter valid input ");
		}catch(maxInputException e) {
			System.out.println(e);
		}catch(cannotDividedByZero e) {
			System.out.println("Number cant be divided by zero");
		}catch(Exception e) {
			System.out.println("another exception");
	}
	}
		return (a/b);
}
	}
public class exercise6_exception_handling_calculator {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
calculator c1= new calculator();
while(true) {
	System.out.println("enter your choice :");
	int c = sc.nextInt();
	if(c==0) {
		break;
	}
	if(c==1) {
		try {
			System.out.println(c1.addition());
		} catch (maxInputException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	else if(c==2) {
		try {
			System.out.println(c1.substraction());
		} catch (InputMismatchException e) {
			System.out.println(e);
			e.printStackTrace();
		} 
		}
	else if(c==3) {
		try {
			System.out.println(c1.multiplication());
		} catch (InputMismatchException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (maxMultiplierReachExeception e) {
			System.out.println(e);
			e.printStackTrace();
		}
}
	else if(c==4) {
		try {
		System.out.println(c1.division());
		}catch(cannotDividedByZero e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
System.out.println("thanks for use ");

	
}
}
