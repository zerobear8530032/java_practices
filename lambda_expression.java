package advance_java;
//@FunctionalInterface
interface newsample{
	void fun1(int a);
}
class fun implements newsample{

	@Override
	public void fun1(int a) {
		System.out.println("this is fun1");
		
	}
	
}

interface sample{
	void meth1();
	void meth2();
	
}
class demo implements  sample{
	
	
	void display() {
		System.out.println("displaying....");
	}

	@Override
	public void meth1() {

		System.out.println("displaying meth1");
	}

	@Override
	public void meth2() {
		System.out.println("displaying meth2");
		}
	
}



public class lambda_expression {
public static void main(String args[]) {
// 1 way 	
//	demo d1 = new demo();
//	d1.display();
//	d1.meth1();
//	d1.meth2();
//	anonamous class: here we created an anonamous class which is not an actual class but work as one
// anonamous classes are created by initializing a object and its overrided method without creating an actaul class
//	this cann be used only one time 
	sample d2 = new sample() {

		@Override
		public void meth1() {
			System.out.println("this is method 1");
		}

		@Override
		public void meth2() {
			System.out.println("this is method 1");
		}
		public void meth3() {
			System.out.println("this is method 3");
		}
		
		
	};
	d2.meth1();
//	d2.meth3();--error
//old way 1:
	fun f = new fun();
	f.fun1(3);
	
//	old way 2:
	newsample ns1 = new fun();
	ns1.fun1(4);
	
	
	newsample ns= new newsample() {

		@Override
		public void fun1(int a) {
			System.out.println("this is fun 1");
			
		}
		
	};
	ns.fun1(4);
	
//	lambda expression: it is way to make your code with less lines:
	
	newsample obj =(int a)->{
		System.out.print("this is fun 1 from lamda"+a);
	};
	
	obj.fun1(6);
	
}
}
