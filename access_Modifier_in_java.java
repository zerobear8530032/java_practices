package object_oreinted;
// ACCESS MODIFIER  ARE THE RANGE OR REACH / ACCESS OF A METHOD OR CLASS BY THE OTHER 
//CLASS WITH THE HELP OF ACCESS MODIFIER WE CAN ALLOW OR RESTICT USE OF CLASS DATA TO GLOBAL OR AT PARTICULAR CLASS
import custom_package.adding_two_numbers;
class c1{
	public int x1=5;
	protected int x2=45;
	 int x3=56;// default 
	private int x4=445;
	
	public void meth1() {// here we can see all access modifier allow to use the data in their class
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
	}
}
class c2 extends c1{
	
	public void meth1() {// here we can see all access modifier allow to use the data in their class
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
	
}
class c3{
	
}
public class access_Modifier_in_java {
public static void main(String args[]) {
	int p1=23;
	 int p2=34;
	c1 c = new c1();
	c.meth1();
//	here we can see we can acces public,protected,default in the same package 
	// here we can also use them in another file in same package
	System.out.println("accessing public x1:"+c.x1);
	System.out.println("accessing public x1:"+c.x2);
	System.out.println("accessing public x1:"+c.x3);
//	here we cant use the private variable in same package 
//	System.out.println("accessing public x1:"+c.x4); -- error
	
	
//	the default modifier does not allow to use the variable outside of its own package
//	 here we can also import a class form another package when its public and use it
	adding_two_numbers add = new adding_two_numbers();
	System.out.println(add.x1);
}
}
