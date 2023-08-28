package exercise;
//	QUESTION 1: CREATE 2 THREADS WITH PRINTING A MSG 
class practicethread1 extends Thread{
	public practicethread1(String name) {
		super(name);
	}
	
	public void run() {
while(true) {
	
		System.out.println("good morning ");
		System.out.println(" priority of t1 :"+getPriority());
		System.out.println(getState());
		
		
		try {
			Thread.sleep(200);
	}catch(Exception e) {
		System.out.println("thread not working ");
	}
}
	}
	
}

class practicethread2 extends Thread{
//	 QUESTION 2: ADD 200 MS DELAY IN WELCOME THREAD
	public practicethread2(String name) {
		super(name);
	}
	
	public void run() {
		while(true) {
			System.out.println("welcome ");
			System.out.println(" priority of t2 :"+getPriority());
//		QUESTION 4: HOW TO A STATE OF A THREAD:
			System.out.println(getState());
						
			try {
			Thread.sleep(200);
	}catch(Exception e) {
		System.out.println("thread not working ");
	}
			
			}
	}
	
}
public class prac_set13 {
public static void main(String args[]) {

	practicethread1 t1 = new practicethread1("good morning");
	practicethread2 t2 = new practicethread2("welcome");
//	QUESTION 3: GET PRIORITY AND SET PRIORITY :
	t1.setPriority(10);
	t2.setPriority(Thread.NORM_PRIORITY);
	
//	t1.start();
//	t2.start();
		System.out.println(" priority of t1 :"+t1.getPriority());
		System.out.println(" priority of t2 :"+t2.getPriority());
//	QUESTION 5: HOW TO CREATE A REFERENCE OF THREAD INN JAVA
		System.out.println(" REFERENCE OF t1 :"+t1.currentThread());
		System.out.println(" REFERENCE OF t2 :"+t2.currentThread());
		
}
}
