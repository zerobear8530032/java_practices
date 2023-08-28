package dumy;

public class array_methods {
public static void main (String args[]) {
	int [] marks= {1,4,6,4,7,4,3,6,3};// int array
//	float [] floatarr= new float[10];// flaot array
	float [] farr= {2.4F,35.5F,35.5F};
	String []strarr= {"safe","aman","sahu"};// string array
	System.out.println("length of array :"+marks.length);
	System.out.println("length of array :"+farr[1]);
	System.out.println("length of array :"+strarr[1]);
	
	for(int i=0;i<farr.length;i++) {
		System.out.println(farr[i]);
	}
	
//	 printing array elements in reverse order:
	System.out.println("in sequence :");
	for(int i=0;i<=(strarr.length)-1;i++) {
	System.out.println(strarr[i]);	
	}
	System.out.println("in reverse sequence :");
	
	for(int i=(strarr.length)-1;i>=0;i--) {
	System.out.println(strarr[i]);	
	}
//  for each loop: its a special type of loop used to travese whole array:
	for(int element:marks) {
		System.out.println(element);
	}
	
}
}
