package object_oreinted;
class myemployee{
	private int id;
	private String name;
	private int salary;
//	constructor is a function created within a class which have name same as classs each class have a contrustor 
//	which execute automatically when the class object is created ;
	public myemployee() { // employee class constructor 
//		 initializing value
		this.id =24;
		this.name ="zara";
		
	}
//	constructor overloading
	public myemployee(int id, String name) { // employee class constructor 
//		 initializing value
		this.id = id;
		this.name =name;
	}
	
	public myemployee(int salary) { // employee class constructor 
//		 initializing value
		this.salary = salary;
	}
	
	
	void getdetail() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		
	}
}
public class constructor_in_java {
public static void main(String args[]) {
	
	myemployee emp1 = new myemployee(23,"saboor");
	emp1.getdetail();
	myemployee emp2 = new myemployee();
	emp2.getdetail();
	myemployee emp3 = new myemployee(1200);
	emp3.getdetail();
	
}
}
