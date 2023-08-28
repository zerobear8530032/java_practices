package advance_java;
//anotations are the special statement which are 
//give to compiler to maake sure the program is working correctly


class first{
	
	void print(String s) {
		System.out.println(s);
	}
	
}
class second extends first{
//1. @Override : 
//	this is to ensure the method is overrided if by mistake the
//	method is not override the error will display
@Override
	void print(String s) {
		System.out.println(s);
	}

	
}
//
//@FunctionalInterface : used to declare functional interface
@FunctionalInterface 
 interface functionalinterface{
//	functional interface is an interface which have only one single abstract function
void sum(int a,int b);
//void sum(int a);-- error
}
public class java_anotations {
	//3. @Deprecated: show the method is deprecated

	@Deprecated

	static int sum(int a,int b) {
		return a+b;
	}
//	@SuppressWarnings -> use to supress compiler warning
	@SuppressWarnings( "deprecation" ) 
public static void main(String args[]) {
System.out.println(sum(2,4));

}
}
