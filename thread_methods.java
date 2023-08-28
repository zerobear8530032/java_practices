package multi_Threading;
class newthread1 extends Thread{
	
 public  newthread1(String name) {
	super(name);
}

 public void run() {
	for(int i=0;i<100;i++) {
		System.out.println("this is a thread "+getName());
	}
	System.out.println("finish "+getName());
 }
}
class newthread2 extends Thread{
	 public  newthread2(String name) {
			super(name);
		}
	

	 public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("this is a thread "+getName());
		}
		System.out.println("finish "+getName());
	 }
	}

class sleepythread extends Thread{
	 public  sleepythread(String name) {
			super(name);
		}
	

	 public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("this is a thread "+getName());
			try {
			Thread.sleep(1);//here we can give time for a thred to intrup and not work for some time
						
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("finish "+getName());
	 }
	}
public class thread_methods {
public static void main(String args[]) {
	
	newthread2 t1 =new  newthread2("1");
	newthread2 t2 =new  newthread2("2");
	newthread2 t3 =new  newthread2("3");
	newthread2 t4 =new  newthread2("4");
	
	sleepythread st= new sleepythread("sleepy ");
	
	
	t1.start();
	try {
//		here when we try to use join() we can get exception which needs to be handle in order to run it
//		 in java join allows one thread to do its work first then only next thread will start its work
		t1.join();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	t2.start();
	st.start();
	t3.start();
	t4.start();
	

}
}
