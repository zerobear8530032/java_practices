package advance_java;
import java.util.*;
import java.lang.reflect.*;
public class array_list {
public static void main(String args[]) {
//	 array list is an advance version of array which is a dynamic array which can resize it self and 
//	adding or removing method can be used very easily and its very verstile  
	// here by this we can create an array list object to create an array list:
//	<> is used  to determine which tyoe of data will it store
	ArrayList<Integer> l1 = new ArrayList<>();
	ArrayList l2 = new ArrayList(5);// here by giving an argument in the array list constructor to
//	 define the size of array list when its created :

	
	// adding new elements to the array list 
	l1.add(3);
	l1.add(33);
	l1.add(43);
	
	l1.add(35);
	l1.add(35);
	
//	printing aray list 
	System.out.println("array list with for each loop : ");
	for(int elements : l1) {
		System.out.println(elements);
	}
//	 iterating array list with the for loop

	System.out.println("array list with for each loop : ");
	for(int i=0;i<l1.size();i++) {
		
//		l1.get(index) will give the object present in the i index where index 0 is first and 1 is second
		System.out.println(l1.get(i));
	}
	// here we xan add a number or object with the specific index :
	l1.add(0,100);
	System.out.println("array list with for each loop : ");
for(int i=0;i<l1.size();i++) {
		
//		l1.get(index) will give the object present in the i index where index 0 is first and 1 is second
		System.out.println(l1.get(i));
	}
	l2.add(345);
	l2.add(564);
	l2.add(324);
	l2.add(245);
	l1.addAll(l2);// by the help of add we can add 2 array list where it add all elements from the end
	l1.addAll(2,l2);// by the help of add we can add 2 array list with 2 argument we can give index of where to start adding
	
	System.out.println("array list with for each loop : ");
	for(int i=0;i<l1.size();i++) {
			
//			l1.get(index) will give the object present in the i index where index 0 is first and 1 is second
			System.out.println(l1.get(i));
		}

l2.clear();// remove all elments
System.out.println("l2  empty :"+l2);
System.out.println(l1.contains(245));// it is used to check elemnt present in the array list
System.out.println(l1.indexOf(245));// it is used to check index of the elment present in the array list
System.out.println(l1.indexOf(24534));// it is used to check index of the elment present in the array list
//-1 means the elment does not exist
System.out.println(l1.indexOf(24534));// it is used to check index of the elment present in the array list and give the first occurence of the elemnt from 0 to length
System.out.println(l1.lastIndexOf(2453));// it is used to check index of the elment present in the array list and give the last occurence of the element from length to 0
l1.set(3,33);// this will insert a element on the index 
for(int i=0;i<l1.size();i++) {
	
//	l1.get(index) will give the object present in the i index where index 0 is first and 1 is second
	System.out.print(" ,"+ l1.get(i));
}

System.out.println(l1.subList(2,5));// this will extract out a sub list pf array from index 2 to 4 upper limit not included

}
}
