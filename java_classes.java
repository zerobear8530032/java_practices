package object_oreinted;
import java.util.Scanner;
//  used defined class : in java thier can be only a single public class
class custom_class{
	int a;
	String str;
	int salary ;
void printmsg() {
	System.out.println("id :"+a);
	System.out.println("name :"+str);
	System.out.println("salary :"+salary);
	
	
}

}

public class java_classes {

	public static void main(String args[]) {
//	System.out.println("this is a default class");
	custom_class saboor= new custom_class();// object creation of the custome class 
	saboor.a=10;// accessing variable of the custome class with object 
	saboor.str="saboor";// accessing variable of the custome class with object 
	saboor.salary=10000;

//	 printing the values:
//	System.out.println(saboor.a);
//	System.out.println(saboor.str);
	System.out.println("first object:");
	saboor.printmsg();
	custom_class  harry = new custom_class();// object creation of the custome class 
	System.out.println("second object :");
	harry.a=12;
	harry.str="harry";
	harry.salary=15000;
	harry.printmsg();
}
}
