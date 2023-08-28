package object_oreinted;
class phone{
	phone(){
		System.out.println("this is  a phone constructor");
	}
	public void on () {
		System.out.println("turning on phone");
	}
	public void showday () {
		System.out.println("todays friday");
	}

}
class smartphone extends phone{
	smartphone(){
		System.out.println("this is  a phone constructor");
	}
@Override

	public void on() {
		System.out.println("turning on smart phone");
	}
public void music() {
	System.out.println("playing music ....");
}


}
public class dynamic_method_dispatch {
public static void main(String args[]) {
//	phone ph= new phone();
//	ph.name();
//	ph.greet();
//	smartphone sm =new smartphone();
	
	phone obj = new smartphone();
//	smartphone obj2= new phone(); not allowed 
//	obj.showday();
//	obj.on();
//	obj.music(); // not allowed because this does not accesse by the phone reference
	
	
}
}
