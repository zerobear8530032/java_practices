package exercise;
import java.util.Scanner ;
public class prac_set6 {
public static void main(String args[]) {
	
	Scanner sc = new Scanner (System.in);
//	 question 1: create float array and sum of its all elemnts:
//	float [] farr= new float[5];
//	float sum=0;
//	for(int i=0;i<farr.length;i++) {
//		System.out.println("enter the value of array element ["+i+"] :");
//	farr[i]=sc.nextFloat();
//	sum=sum+farr[i];
//	}
//	System.out.println("sum :"+sum);
	
//	question 2: wap to find wheater the given integer present in array or not:
//	int [] arr= {34,65,54,34,56};
//	System.out.println("enter the element you want to find :");
//	int num= sc.nextInt();
//	boolean b=false;
//	for(int e:arr) {
//		if(e==num) {
//			b=true;
//			break;
//		}
//		else {
//			b=false;
//
//		}
//		}
//		if(b) {
//			System.out.println("the integer is present in the array :");
//			
//		}
//		else {
//			System.out.println("no its not present");
//			
//		}

//	question 3: wap to calculate average using for each loop:
//	float []arr= {12,4,13,20,14,12,6,12,19,20};
//	float sum=0;
//	for (float e:arr) {
//		sum=sum+e;	
//	}
//	float avg=sum/arr.length;
//	System.out.println("avg:" +avg);
//	
//	 wap to add 2 matrices of size 2X3;
//	
//	int [][] mat1= {
//			        {23,45,3},
//			        {3,5,6}
//	               };
//	int [][] mat2= {
//	        {2,4,3},
//	        {5,56,5}
//           };
//	int [][] summat= new int[2][3];
//	
//	for(int i =0;i<2;i++) {
//		for(int j=0;j<3;j++) {
//			summat[i][j]=mat1[i][j]+mat2[i][j];
//		}
//	}
//
//	for(int i =0;i<2;i++) {
//		for(int j=0;j<3;j++) {
//			System.out.print(summat[i][j]+"\t");
//		}
//		System.out.println();
//	}
//	

// question 5: wap to reverse an array :
	
//	int[] arr= {1,2,3,4,5,6,7};
//	System.out.println("original array :");
//	for(int e: arr) {
//		System.out.print(e+"\t");
//	}
//	
//	int temp=0;
//	int l=arr.length-1;
//	for(int i=0;i<arr.length/2;i++) {
//		temp=arr[i];
////		System.out.println(l-i);
//		arr[i]=arr[arr.length-1-i];
//		
//		arr[arr.length-1-i]=temp;		
//	}
//	
//	System.out.println("\nreversed  array :");
//	for(int e: arr) {
//		System.out.print(e+"\t");
//	}

// question 6: wap to find max element:
//	int [] arr1= {1,42,5,23,66,4,24};
//	int max=Integer.MIN_VALUE;
//	for(int e:arr1) {
//		if(e>max) {
//			max=e;
//		}
//	}
//	System.out.println("the max elemnt is :"+max);
	
// question 7: wap to find min element:
//	int [] arr2= {1,42,5,23,66,4,24};
//	int min=Integer.MAX_VALUE;
//	for(int e:arr2) {
//		if(e<min) {
//		min=e;
//		}
//		}
//		System.out.println("the min elemnt is :"+min);

//	question 8	: find is the array is sorted or not;
	
	int[] sorted = {1, 2, 3, 4, 6, 6, 7};
	boolean b = true;

	for (int i = 0; i < sorted.length - 1; i++) {
	    if (sorted[i] <= sorted[i + 1]) {
	        // Elements are in the correct order
	        b = true;
	    } else {
	        System.out.println("h");
	        b = false;
	        break;
	    }
	}

	if (b) {
	    System.out.println("the array is sorted");
	} else {
	    System.out.println("the array is not sorted");
	}

	

}
	
}

