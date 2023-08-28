package object_oreinted;
class base3{
	
	public void method1() {
		System.out.println("hello i am a method 1 from base ");
	}
	
	public void method2() {
		System.out.println("hello i am a method 2 from base");

	}
	
}
class derived3 extends base3{
//	 method over ridding when we inherit the method from parent class but want 
//	to do any thing else with that method we can pver ride the method
	@Override 
//here it is a notation use to say the method is over ride it is just to emsure the method 
//	overiding is done or not but its not compulsory
	
	public void method2() {
		System.out.println("hello i am a method 2 from derived");

	}
	
	public void method3() {
		System.out.println("hello i am a method 3 from derived");
		}
}
public class overriding_in_java {
public static void main(String args[]) {
//  creating object	
	base3 b= new base3();
	derived3 d= new derived3();
//	executing method 
	b.method1();
	b.method2();
//	using method 2 from derived 
	d.method2();
	
}
}
