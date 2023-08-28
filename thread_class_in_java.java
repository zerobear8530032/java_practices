package multi_Threading;
class myrunablethread implements Runnable{
	
	
	public void run() {
		System.out.println("hello thiss  is thread from runnable");
	}
}
class mythreadclass extends Thread{
	
//	constructors in thread;
// here we can use several threads function

	public mythreadclass(String name) {
		super(name);// here this will send the name to the thread class constructor 
//		System.out.println(name);
	}
	
	public void run() {
		while(true) {			
		System.out.println("hello i a m thread 1:");
		}
	}
}
public class thread_class_in_java {
public static void main(String args[]) {
	mythreadclass mythr1 = new mythreadclass("zero");
	mythreadclass mythr2 = new mythreadclass("bear");
	
	System.out.println("the id of this thread :"+mythr1.getId());
	System.out.println("the name of this thread :"+mythr1.getName());
	System.out.println("the priority of this thread :"+mythr1.getPriority());
	
	System.out.println("the id of this thread :"+mythr2.getId());
	System.out.println("the name of this thread :"+mythr2.getName());
	System.out.println("the priority of this thread :"+mythr2.getPriority());
	
//	using thread extend method 
//	mythr.start();
//	using runnable method:
	
	myrunablethread run1 = new myrunablethread();
	Thread th1 = new Thread(run1);
	th1.run();
	System.out.println("this is runnable thread id :"+th1.getId());
	System.out.println("this is runnable thread name :"+th1.getName());
	Thread th2 = new Thread (run1,"runnable thread");
	System.out.println("this is runnable thread id :"+th2.getId());
	System.out.println("this is runnable thread name :"+th2.getName());	
	th2.setName("run");// changing name of thread

	System.out.println("this is runnable thread name :"+th2.getName());	
	
}
}
