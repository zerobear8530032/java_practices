package object_oreinted;
interface camera1{
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
interface wifi1{
	String [] getnetworks();
	void connectwithnetworks();
//	we can create abstract or default method in an interfaces default method allow us to create a 
//	method with a body in interface 

}
class cellphone1 {
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
class smartphone1 extends cellphone1 implements wifi1,camera1{

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
class newsmartphone1 implements camera1{

	public void intro() {
		System.out.println("hello i am a smart phone");
	}
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
class imply
{
	
}
public class polymorsphism_in_java {
public static void main(String args[]) {
//	smartphone1 ms = new smartphone1();
//	ms.callnumber(722398);
//	ms.pickcall();
//	ms.disconnect();
//	for (String str : ms.getnetworks()) {
//		System.out.println(str);
//	}
//	ms.connectwithnetworks();
//	ms.recording4K();// here we can use default method without  overriding method 
//	newsmartphone1 nsm = new newsmartphone1 ();
//	nsm.recording4K();// here we can run overrided default method 
//	nsm.msg();
//	 here these method will work because the are present in camera interface
	camera1 cam1= new smartphone1();
	// here this allow to restrict the use of one object of class
	// to be used as a particular interface method only	
	cam1.takesnap();
	cam1.recordvideo();
//	cam1.getnetworks(); here this does not work because the reference is of camera but object is of smartphone 
	wifi1  wifi= new smartphone1();
//	here we can only use wifi functions which are present in  wifi interface
	wifi.connectwithnetworks();
	wifi.getnetworks();
//	wifi.recording4K(); here this also cant work because the reference is wifi
	
//	 HERE WE CANT EVEN USE FUNCTION WHICH ARE PRESENT EXCLUSIVE TO SMARTPHONE CLASS ALSO 
//	wifi.intro();
//	wifi1 w= new wifi1(); -> we cant create an object of interface 
//	wifi1 w= new imply();-> cant do method dispatch without inhjeritance

}
}
