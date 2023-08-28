package dumy;

public class methods_in_java {
	
//static int logic(int x,int y) {
//int c=0;
//	if(x>y) {
//	
//		c= x+y;
//	
//	}
//	else {
//		
//		c= x*y;
//	}
//	return c;
//	
//}
	
	int logic(int x,int y) {
		int c=0;
		if(x>y) {
			c=x+y;
		}
		else {
			c=x*y;
		}
		return c;
	}
	
		
	
public static void main(String args[]) {
	methods_in_java obj = new methods_in_java ();
int a=5;
int b=6;
//System.out.println(logic(a,b));
System.out.println(obj.logic(a, b));
a=4;
b=1;
System.out.println(obj.logic(a, b));

//System.out.println(logic(a,b));

}
}
