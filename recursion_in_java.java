package dumy;

public class recursion_in_java {
//	recursion  is the function calling it self 
	static int recursion_fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*recursion_fact(n-1);
		}
	}
	
	static int factorial(int n) {
		int product=1;
		
		if(n==0 || n==1) {
			return 1;
		}
		else {
			for(int i=1;i<=n;i++) {
				product=product*i;
			}
		}
		return product;
	}
	
public static void main(String args[]) {
	
	System.out.println("factorial with recursion :"+recursion_fact(5));
	System.out.println("factorial with loop :"+factorial(5));
}
}
