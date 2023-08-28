package multi_Threading;
class mythreadrunble1 implements Runnable{

	@Override
	public void run() {
		while(true) {
		System.out.println("i ama thread 1");
		}
	}
	
}
class mythreadrunble2 implements Runnable{

	@Override
	
	public void run() {
		while(true) {
		System.out.println("i ama thread 2");
		}
	}
	
	
	
}
public class thread_with_runable_interface_in_java {
public static void main(String args[]) {
	
	mythreadrunble1 bullet1 = new mythreadrunble1();
	Thread gun1 = new Thread(bullet1);
	mythreadrunble2 bullet2 = new mythreadrunble2();
	Thread gun2 = new Thread(bullet2);
	
	gun1.start();
	gun2.start();
	
	
}
}
