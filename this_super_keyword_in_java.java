package object_oreinted;
class firstclass1{
	public int a;
//	 this is a keyword to pass an object of a class 
	firstclass1 (int a){
		this.a=a;
	System.out.println("i ama first class cosntrutor :");
	}
	
	int getx() {
		return a;
	}
	public int returnone() {
		return 1;
	}

}
class secondclass1 extends firstclass1{
	int c;
	secondclass1(int c){
		
		super(c);
		System.out.println("i ama secodn clas cosntrutor");
		
	}
	
	
}
public class this_super_keyword_in_java {
public static void main(String args[]) {
	firstclass1 c1 = new firstclass1(5);
//	System.out.println(c1.returnone());
//	System.out.println(c1.getx());
secondclass1 s1= new secondclass1(3);
}
}
