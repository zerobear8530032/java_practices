package javaDoc;


public class doc_methods_tags {
//	@parm args these are the argument supplied to coommand line
	
/**
 * this is a addition method
 * @param a
 * @param b
 * @throws Exception if value is 0
 * @deprecated its depricated and used + operator
 */
	public void add(int a,int b) throws ArithmeticException {
		if(a==0 || b==0) {
			try {
				System.out.println(a+b);
				throw new ArithmeticException();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
public static void main(String args[]) {
	System.out.println("this is main method");
}
}
