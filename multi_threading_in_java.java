package multi_Threading;
import java.util.Scanner;
class mythread1 extends Thread{
	Scanner sc =  new Scanner(System.in);
	@Override
	public void run() {
		while(true) {
		System.out.println("my cooking threads running");

		System.out.println("i a happy :) thanks");
		
		}
		}
}

class mythread2 extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("i am chatting ");
//		System.out.println("i a sad now :(");
		
	}
		}
}
public class multi_threading_in_java {
public static void main(String args[]) {
//	muti threading is a way in which we can divide a process into smaller no.of processes which can execute at the same time 

	mythread1 t1= new mythread1 ();
	mythread2 t2= new mythread2 ();
	
	t1.start();
	t2.start();
	
}
}
