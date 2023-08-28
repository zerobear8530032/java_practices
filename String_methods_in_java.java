package dumy;
import java.util.Scanner;
public class String_methods_in_java {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str= "abdul SABOOR";
//		int value = str.length();// to get string length : here length count every letter including blank spaces
//		System.out.println("original strings: "+str);
//		System.out.println("the length of string :"+value);
//		String upstr=str.toUpperCase();// it will convert each char to upper case
//		System.out.println("the upper case of string :"+upstr);
//		String lowstr=str.toLowerCase();// it will convert each char to lower case
//		System.out.println("the lower case of string :"+lowstr);
//		
//		String nontrimstring = "   abdul saboor ";
//		System.out.println("the string before trim  :"+nontrimstring);
//		
//		String trimstring = nontrimstring.trim();
//		System.out.println("the string after trim  :"+trimstring);
		String substr=str.substring(3);// it will give a string which is given by the index but here staring index included
		System.out.println(substr);
		
		
		 substr=str.substring(3,10);// it will give a string which is given by the index but here staring index included but ending index does not included
		 System.out.println(substr);
		
		 System.out.println(substr.substring(0,1));
		 
		 String originalstring =" google google";
		 System.out.println("the original string :"+originalstring);
		 String newstr= originalstring.replace('g','b');
		 System.out.println("the formated string :"+newstr);// here all the g replaced with b
		 
		 System.out.println("the original string :"+originalstring);
		 String newstr2= originalstring.replace("goo","wig");
		 System.out.println("the formated string :"+newstr2);// here all the goo replaced with wig
		 
		 System.out.println("the formated string :"+newstr2.startsWith("goo"));
		 System.out.println("the formated string :"+newstr2.endsWith("le"));
		 
		 System.out.println("str index :"+newstr2.charAt(2));
		 
		 
		 System.out.println("indexof:"+newstr2.indexOf("ig"));// it gives index of first occurence
		 System.out.println("indexof:"+newstr2.indexOf("za"));//  -1 means does not exist
		 
		 System.out.println("indexof:"+newstr2.indexOf("ig"));// it gives index of first occurence
		 System.out.println("indexof:"+newstr2.indexOf("za"));//  -1 means does not exist
		 
		 System.out.println("indexof:"+newstr2.lastIndexOf("ig"));// it gives index of last occurence
		 System.out.println("indexof:"+newstr2.lastIndexOf("za"));//  -1 means does not exist
		
		 System.out.println(str.equals("abdul SABOOR")); 
		 System.out.println(str.equalsIgnoreCase("abdul saboor")); 
				
		 
		 
		 
		 
			


		
	}
}
