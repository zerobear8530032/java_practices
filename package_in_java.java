package object_oreinted;
import object_oreinted.access_Modifier_in_java;
// 2 ways to include package
// 1:
//import java.util.Scanner;
// 2: this will import all the packages present in java.util. libary
import java.util.*;
public class package_in_java {
	public static void main(String args[]) {
		
		
	Scanner sc = new Scanner(System.in);
//or we can do this also
		java.util.Scanner scanner= new java.util.Scanner(System.in); 
		int n=sc.hashCode();
System.out.println(n);
 n=scanner.hashCode();
System.out.println(n);
//  heree we can use that import to implort all files so we dont need to individually import random
Random ran= new Random();
System.out.println(ran.nextInt(0,100));
c1 ac= new c1();
// here we can also use them in another file in same package
System.out.println(ac.x1);
System.out.println(ac.x2);
System.out.println(ac.x3);

}
}
