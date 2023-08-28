package object_oreinted;
interface one{
	void A ();
}
interface two{
	void B ();
	
}
//  here the interface can support mutiple inheritance where a single interface can be inherited by more then one interface:
interface three extends one,two{
	void C ();
	
}
// this is not valid as we cant inherit interface with class with extends keyword
//class three extends one{
//	
//}
interface parentinterface {
	
	void method1();
	void method2();
	
	
}
interface childinterface extends parentinterface{
	//  here we can use extends keyword to use inheritance in interface
	
	void method3();
	void method4();
	
	
}
//  now when we implement the inherited iterface we need to implement all the method present in parent and child interfaces



class baseclass implements childinterface,three{
	// here when implement ing an interface we can use 
//	more then one interface iplemented at a single class

	@Override
	public void method1() {
	System.out.println("hello i am method 1");
	}

	@Override
	public void method2() {

		System.out.println("hello i am method 2");
	}

	@Override
	public void method3() {

		System.out.println("hello i am method 3");
	}

	@Override
	public void method4() {

		System.out.println("hello i am method 4");
	}
	@Override
	public void A() {
	System.out.println("A");
	}
	@Override
	public void B() {
	System.out.println("B");
	}
	@Override
	public void C() {
	System.out.println("C");
	}

	
}
public class inheritance_In_Interfaces {
public static void main(String args[]) {
	
	baseclass bc= new baseclass();
	bc.method1();
	bc.method2();
	bc.method3();
	bc.method4();
	bc.A();
	bc.B();
	bc.C();
	
	
}
}
