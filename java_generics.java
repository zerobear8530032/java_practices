package advance_java;
import java.util.*;
class mygeneric <T1>{
	
	
	int v;
	private  T1 t1;// here we created a generic class to decide by the used on which type of the argument need to be passed 
public	mygeneric(int a,T1 b){
			v=a;
			t1=b;
	}
	
void setv(int v) {
	this.v=v;
}
int  getv() {
	return v;
}
void sett1(T1 t1) {
	this.t1=t1;
}
T1  gett1() {
	return t1;
}	
}
public class java_generics {
//GENERICS ARE SPECIAL STATEMENTS WHICH ARE NOT ALWAYS REQUIRED BUT CAN BE USED IN ORDER TO MAKE SURE THE 
//	EXECUTION PROCEDURE IS PERFORMED WITHOUT ERRORS
public static void main(String args[]) {
	ArrayList  al1 = new ArrayList<>();
	al1.add("str");
	al1.add(12);
	al1.add(45);
	int a =(int)al1.get(1);// here we need to type cast to get the int type element from arraylist
//	if we create an array list with default type defination:

	ArrayList <Integer> al2 = new ArrayList<>();
//	ArrayList <int> al2 = new ArrayList<>()-->errror;
//		here <Integer> is generic
//		al2.add("str");-->error
		al2.add(12);
		al2.add(45);
		int b=al2.get(1);
System.out.println(b);	

mygeneric<String> g1 = new mygeneric(23,"name");

String str=g1.gett1();
System.out.println(str);
mygeneric g2 = new mygeneric(23,34);

System.out.println(g2.gett1());


}
}
