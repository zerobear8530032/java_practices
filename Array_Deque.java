package advance_java;
import java.util.*;
public class Array_Deque {
public static void main(String args[]) {	
//	 array deque is a double ended queue where an array is created which allow to insert or delet element from
//	both ends 
	ArrayDeque<Integer> ad1= new ArrayDeque<>();

	ad1.add(5);
	ad1.add(4);
	ad1.add(3);
	ad1.add(9);	
	ad1.addFirst(34);
	ad1.addFirst(45);
//	 printing:
	for(int e:ad1) {
		System.out.print(e+",");
	}
	System.out.println(ad1.getFirst());
	System.out.println(ad1.getLast());
	ad1.removeFirst();
	ad1.removeLast();
	for(int e:ad1) {
		System.out.print(e+",");
	}
	
	
	
}
}
