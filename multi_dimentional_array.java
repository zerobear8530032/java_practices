package dumy;

public class multi_dimentional_array {
public static void main(String args[]) {
//	multi dimentional array is also called array of array its like an array where each index have an array 
//1 d array
	int [] arr1D= {1,2,3,4};
	
	
//2d array
	int [][] arrary2D= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
			};
	int [][] arr = new int[2][3];

//	accessing 2D array :
	
	arr[0][0]=101;
	arr[0][1]=102;
	arr[0][2]=103;
	arr[1][0]=201;
	arr[1][1]=202;
	arr[1][2]=203;
	System.out.println(arr.length);
	
	
	for (int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(" "+arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
