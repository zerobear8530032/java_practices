package advance_java;
import java.util.LinkedList;
public class linked_list_in_java {
public static void main(String args[]) {
//	linked list is a data structure similar to array list only difference is the 
//	function to add or remove elemnts in linked list is faster compare to the array list :
	
	LinkedList <Integer> linkedlist1 = new LinkedList<>();
	linkedlist1.add(1);
	linkedlist1.add(4);
	linkedlist1.add(5);
	linkedlist1.add(2);
	linkedlist1.addLast(6);// add the element at the end 
	linkedlist1.addFirst(9);// add the element at the first place
	
//	printing the linked list :
	System.out.println(linkedlist1);
	System.out.println("array list with for each loop : ");
	for(int i=0;i<linkedlist1.size();i++) {
		
//		l1.get(index) will give the object present in the i index where index 0 is first and 1 is second
		System.out.print(linkedlist1.get(i)+",");
	}
}
}
