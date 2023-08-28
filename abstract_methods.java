package object_oreinted;
import java.util.Scanner;
// abstract class

abstract class parent {
	parent(){
		System.out.println("i am a base classs constrcuctor");
	}
	void sayhello() {
		System.out.println("helloo i am zerobear");
	}
	abstract void greet();
	abstract void greet2();
	
}
// when an abstract class will get inherited by an non abstract class the the derived class nedd to be 
// created as abstract class or need to b overriding method of abstract class
abstract class derived extends parent{
	void message(){
		System.out.println("hello ia ma a class");
	}
}

class child extends parent{
//	override greet from parent
void greet(){
	System.out.println("hello....");
		
	}

void greet2(){
	System.out.println("hello.... iam greet 2");
		
	}
}
public class abstract_methods {

//	abstract class is the class  that contian abstract methods if a single method is a class is an abstract  method
//	then whole class is abstract class
	
	//  abstract method are special type of method which is declared only but not contain any body
	
public static void main(String args[]) {
//	parent p= new parent(); this wont work because we cant create a object of abstract class
	child c= new child();
	c.greet();
	c.greet2();
	
}
}
