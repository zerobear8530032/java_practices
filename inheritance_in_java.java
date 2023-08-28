package object_oreinted;
import java.util.Scanner;
// inheritance is the property of class which allow to use function of one class to another class which help in code reusability
class base1{
	int x;
void setx(int a) {
	x=a;
}
int getx() {
	return x;
}
	
}
class derived1 extends base1{ // here base is parent class and derived is child class which allow dervied to acees all element from base 
//	 we use extends keyword for inhertance; 
	int y;
	
	
	void sety(int a) {
		y=a;
	}
	int gety() {
		return y;
	}
}
class animal{
	
	void voice() {
		System.out.println("animal voice");
	}
	
}
class dog extends animal{
	void dogvoice() {
		System.out.println("bark..");
		}
}
public class inheritance_in_java {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
//	 base clas object
	base1 b1 = new base1();
	
	b1.setx(12);
	System.out.println("getting x from base 1: "+b1.getx());
//	we cant access child class function from parent class
//	b1.sety(23);
//	System.out.println("getting y : "+b1.gety());
//	 we  cam access parent calss function from child class
//   derived class object	
	derived1 d1= new derived1();
	
	d1.setx(12);
	System.out.println("getting x from derived 1 : "+d1.getx());
	d1.sety(23);
	System.out.println("getting y from derived 1 : "+d1.gety());
	
//	 quiz: 
	dog dog = new dog();
	dog.voice();
	dog.dogvoice();
	
}
}
