package object_oreinted;


interface camera{
	void takesnap();
	void recordvideo();
	default void recording4K() {
		System.out.println("4K recording starting ");
	}
//	so we can use private method in interfaces which cannot be accessed by the object of the class implementing it 
//	but we need those method to do small task and need an intermediate method to use them 
	private void greet() {
		System.out.println("good morning");
	}
	default void msg() {
//	 here we use greet method  with the help of another method:
		greet();
		System.out.println("today is a good day");
	}

}
interface wifi{
	String [] getnetworks();
	void connectwithnetworks();
//	we can create abstract or default method in an interfaces default method allow us to create a 
//	method with a body in interface 

}
class cellphone {
	void callnumber(long  num) {
		System.out.println("calling ..."+num);
	}
    void pickcall() {
    	System.out.println("connecting the call to ...");
    }
    void disconnect() {
    	System.out.println("disconnecting call...");
    }
}
class smartphone2 extends cellphone implements wifi,camera{

	@Override
	public void takesnap() {
		System.out.println("taking snap...");
	}

	@Override
	public void recordvideo() {
		System.out.println("recording starting...");
			
	}

	@Override
	public String[] getnetworks() {
		System.out.println("here are the list of connected networks :");
	String [] str= { "POCO M2", "WirelessNet--2"};

		return str;
	}

	@Override
	public void connectwithnetworks() {
		System.out.println("POCO M2: CONNECTED");
	}
	
	
}
class newsmartphone implements camera{

	@Override
	public void takesnap() {
	System.out.println("taking snap in new smart phone");
	}

	@Override
	public void recordvideo() {

		System.out.println("recording in new smart phone");
	}
// 	 here we can also override the default method if required
	public void recording4K(){
		System.out.println("recording in 4k from new smart phone");
	}
	
}

public class interfaces_Example {
public static void main(String args[]) {
	
	smartphone2 ms = new smartphone2();
	ms.callnumber(722398);
	ms.pickcall();
	ms.disconnect();
	for (String str : ms.getnetworks()) {
		System.out.println(str);
	}
	ms.connectwithnetworks();
	ms.recording4K();// here we can use default method without  overriding method 
	newsmartphone nsm = new newsmartphone ();
	nsm.recording4K();// here we can run overrided default method 
	nsm.msg();
//	nsm.greet(); this cannot be access directly
}
}
