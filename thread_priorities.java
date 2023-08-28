package multi_Threading;
class priority extends Thread{
	public priority(String name) {
		super(name);
	}
	public void run() {
		int i=0;
while(i<100) {
		System.out.println("this is a thread"+getName());
		i++;
	}
System.out.println("finish"+getName());

	}
}
public class thread_priorities {
public static void main(String args[]) {
//	here when the thread run :
//	in jvm there are several threads at a time to run which are in runnable state means they are not running but 
//	in a state where they can run
//	thread priority is the importance we want to give to a thread  while executing this will decide which thread and when it can be executed
	priority th1= new priority("th 1");
	priority th2= new priority("th 2");
	priority th3= new priority("th 3");
	priority th4= new priority("th 4");
	priority th5= new priority("th 5");
	priority th6= new priority("th 6");
	priority th7= new priority("th 7 most imp");
//	 here we can set priority to the thread:
//	here the priority ranges from 1 to 10 where higher the priority the more time it will get to use the processor to finisht the work
//	this is not always reliable 
	th1.setPriority(Thread.MIN_PRIORITY);
	th2.setPriority(4);
	th3.setPriority(2);
	th4.setPriority(5);
	th6.setPriority(6);
	th5.setPriority(7);
	th7.setPriority(Thread.MAX_PRIORITY);
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	th5.start();
	th6.start();
	th7.start();

}
}
