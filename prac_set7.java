package exercise;
import java.util.Scanner ;
public class prac_set7 {
static void multiplication_table(int a) {
	for(int i =1;i<=10;i++) {
		
		System.out.format("\n%d X %2d =  %d",a,i,a*i);
	}
}
static void pyramid (int a) {
	for(int i=0;i<=a;i++) {
	for(int j=0;j<i;j++) {
		System.out.print("*");
	}
	System.out.println("");
	
}
}

static int recursiveSum(int n) {
	int sum=n;
	if(n==1) {
		return 1;
	}
	return n+recursiveSum(n-1);	
}
static void rev_pyramid(int n) {
	
	for( int i=0;i<n;i++) {
		for(int j=0;j<(n-i);j++) {
			
		System.out.print("x");
		}
		System.out.println("");
		
	}
}

static int fabonacci(int n) {
	
	if(n==1) {
		return 0;
	}
	else if(n==2) {
		return 1;
	}
	else {
		return fabonacci(n-1)+fabonacci(n-2);
	}
}
static float avg(int ...arr) {
	float avg;
	float sum=0;
	for(int e:arr) {
		sum=sum+e;
	}
	avg=sum/arr.length;
	return avg;
}
static void pyramid_rec(int n) {
	if(n>0) {
		pyramid_rec(n-1);
		for(int i=0;i<n;i++) {
		System.out.print("*");
	}
		System.out.println();
	}

}

static void rev_pyramid_rec(int n) {
	if(n>0) {
		
		for(int i=0;i<n;i++) {
		System.out.print("*");
	}
		System.out.println();
	}
	pyramid_rec(n-1);
	

}

static void convertion (float a) {
	float fer= 32.0F+(a*(9.0F/5.0F));
	System.out.println("ferenhiet is :"+fer);
}
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
//	System.out.println("enter the number :");
//	 QUESTION 1: CREATE A METHOD TO PRINT TABLE
//	int a=sc.nextInt();	
//	multiplication_table(a);
	
// QUESTON 2: CREATE A PYRAMID PATTER
//	System.out.println("enter the number :");
//	int n=sc.nextInt();
//	pyramid(n);

// QUESTION 3:FIND THE SUM OF FIRST N NATURAL NUMBERS	WITH RECURSION;
//	System.out.println("enter the number :");
//	int n=sc.nextInt();
//	System.out.println(recursiveSum(n));

// QUESTION 4 : PRINT REVERSE PYRAMID:
//	System.out.println("enter the number :");
//	int n=sc.nextInt();
//	rev_pyramid(n);

// QUESTION 5: FIND N TH TERM IN FABOCACCI SERIES:
	
//	System.out.println("enter the number :");
//	int n=sc.nextInt();
//	System.out.println(fabonacci(n));

//	QUESTION 6: FIND THE AVG OF ARGUMNET PASSED IN A METHOD:
	
//	System.out.println("the average of the numbers :"+avg(1,34,56,32,56,5));

//	QUESTION 7: CREATE PYRAMID USING RECURSION:
//	System.out.println("enter a number:");
//	int n=sc.nextInt();
//	pyramid_rec(n);


//	QUESTION 8: CREATE REVERSE PYRAMID USING RECURSION:
//	System.out.println("enter a number:");
//	int n=sc.nextInt();
//	rev_pyramid_rec(n);
	
	
//	QUESTION 9: FIND CELCIUS TO FEHRENHITE:
	System.out.println("enter the temp in celcius:");
	float c=sc.nextFloat();
	convertion(c);
}
}

