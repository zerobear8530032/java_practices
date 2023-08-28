package dumy;

public class methods_overloadinginjava {
//static void tell_joke() {
//	System.out.println("hello idk a joke ");	
//	}
	
	static void change(int a) {
		a=34;
		
	}
	
	static void change2(int [] a ) {
		a[0]=98;
		
	}
	static void foo() {// created a method
		System.out.println("good morning");
	}
	static void foo(int a) {// overloaded a method with 1 parameter
		System.out.println("value of a:"+a);
	}
	static void foo(String str ) {// overloaded with changed type of argumnet
		System.out.println("the string you gave is :"+str);
	}
	
	static void foo(int a,int b ) {// overloaded with more number of parameter 
		System.out.println("sum of 2 numbers :"+(a+b));
	}
	
//	static int foo(int a,int b ) { //here this does not work
//		System.out.println("sum of 2 numbers :"+(a+b));
//		return a+b;
//	}
	
	public static void main (String args[]) {
////	tell_joke();
//	int [] marks= {56,89,34,89,42,45};
////	 changing the integer: when we try to change an integer an copy of that integer passed to the function thats why it deos not changed 
//	int a=3;
//	change(a);
//	System.out.println(a);
////	changing the array: when we try to pass an array an copy of its reference is passed thats why it changed
//	System.out.println("before change marks[0]:"+marks[0]);
//	change2(marks);
//	System.out.println("after change marks[0]:"+marks[0]);

//	method overloading; when we create one function in one class more then one time with different parameter thats called function overloading;
		
	foo();// no param
	foo(17);// int param
	foo("hello");// string param
	foo(10,24);// 2 int param
		

	}
}
