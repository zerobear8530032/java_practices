package object_oreinted;
import java.util.Scanner;
class employee{
	// these private access modifier not allow to access data directly with object 
	private int id; 
	private String name;
	
	void setid(int id) {
		this.id=id;
		
	}
	void setname(String name) {
		this.name=name;
		
	}
	
	int  getid() {
		return id;
		
	}
	String getname() {
		return name;
		
	}
//	 but to access such data we can use methods
}
public class access_modifier {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	employee emp = new employee();
//  cant access private data:
//	emp.id=10; 
//	emp.name="saboor";
	
	System.out.println ("enter the value of id :");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println ("enter the value of name :");
	String name =sc.nextLine();
	
	emp.setid(id);
	emp.setname(name);
	System.out.println("getter :"+emp.getname());
	System.out.println("getter :"+emp.getid());
}
}
