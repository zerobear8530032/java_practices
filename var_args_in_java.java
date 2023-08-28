package dumy;

public class var_args_in_java {
	static int  sum(int b,int ...a) { //here var args need to always put at last after single args while this allow to work even if i give no argument var args willw ork
		int sum=b;
		System.out.println("hello var args :");
		for(int e:a) {
			sum=sum+e;
		}
		return sum;
	}

	static int  sum(int a,int b) {
		return a+b;
	}
	static int  sum(int a) {
		return a;
	}	
	static int  sum(int a,int b,int c) {
		return a+b+c;
	}
	static int  sum(int ...a) { // here ...a is var args argument which take n number of argument which got converted into an array 
		int sum=0;
		System.out.println("hello var args :");
		for(int e:a) {
			sum=sum+e;
		}
		return sum;
	}
	
public static void main(String args[]) {
	System.out.println("var args:");
	
	int a=5;
	int b=4;
	int c =1;
	System.out.println("value of a:"+sum(a));

	System.out.println("sum of a + b:"+sum(a,b));


	System.out.println("sum of a + b + c:"+sum(a,b,c));
	
	System.out.println("sum of a + b + c:"+sum(a,b,c));
	

}
}
