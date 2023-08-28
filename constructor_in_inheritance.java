package object_oreinted;
//  construtor in inheritance work in an hearchy where each constructor run from the child class and checks if the paent class have a constrcut
//if it exisat then the constructor of base class will execute first before child class
class base2{

	base2(){ 
		System.out.println("hello i am a base class constructor ");
	}
//	 over loaded constructor 
	base2(String str){
		System.out.println("hello "+str+" i am a base class constructor");
	}
}
class derived2 extends base2{
	
	derived2(){
//		 here super keyword use to initialize parameter for the base class constructpr to run
		super("saboor"); 
		System.out.println("hello i am a derived class constuctor ");
	}
	
	derived2(String str,int a){
//		 here super keyword use to initialize parameter for the base class constructpr to run
		super(str); 
		System.out.println("hello "+a+" i am a derived class constuctor ");
	}
	
	
}
class child_of_derived2 extends derived2{
child_of_derived2(){
		System.out.println("hello i am a child of dervied constructor");
	}
	child_of_derived2(int a ,int b,String str){
		super(str,a);
		System.out.println("hello "+b+" i am a child of dervied constructor");
			
	}
}
public class constructor_in_inheritance {
public static void main(String args[]) {
//	 base class object 
//	base2 b= new base2();
	child_of_derived2 d= new child_of_derived2(2,4,"saboor");
}
}
