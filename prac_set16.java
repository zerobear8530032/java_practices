package exercise;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

// QUESTION 4: CREATE AN INTERFACE AND GENERATE ITS INSTANCE:
interface sample1{
	
	void method1();
	
}


//	QUESTION 1: CREATE A JAVA DOC:
/**
 * this is a practice doc file sample doc
 * @author Saboor-Box
 *@version 18 jdk
 *@see <a href =doc.html>new page</a> 
 *
 */
//	QUESTION 2: CREATE  A METHOD WHICH HAVE A DECPRICATED ANOTATION:
class deprecated{
	
	@Deprecated
		int sum(int a,int b) {
		return a+b;
	}
}
public class prac_set16 {
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * 
	 */
void add(int a,int b) {
	System.out.println("add.."+(a+b));
}





//	QUESTION 3: SUPRESS THE WARNING:
//@SuppressWarnings("Deprecation")
	public static void main(String args[]) {
		/*
	deprecated d = new deprecated();
//	this does mot effect program just a warmimg apppear:
System.out.println(d.sum(3,6));
//	QUESTION 4:
		sample1 sam = new sample1(){
			public void method1() {
				System.out.println("this is meth 1");
			}
		};
		sam.method1();
*/		
//		QUESTION 5:WRITE A TABLE OF A GIVEN NUMBER AND WRITE IT ON A FILE :
	/*
		// creating
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		File create = new File("table.txt");
		try {
		create.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
//		writting :
		try {
		FileWriter write = new FileWriter ("table.txt");
		String line=null;
		for(int i =1;i<=10;i++) {
			line = line.format("%d X %d = %d \n",num,i,num*i );
		write.write(line);
		}
		write.close();
		System.out.println("file created success ");
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
//		reading
		System.out.println("reading the file :");
		try {
		Scanner read = new Scanner(create);
		while(read.hasNextLine()) {
			String line =read.nextLine();
			System.out.println(line);
		}
		read.close();
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
// deletion :
		System.out.println("enter yes to delete file :");
		String str=sc.nextLine();
		if(str.equalsIgnoreCase("yes")) {
			if(create.delete()) {
				
				System.out.println(create.getName()+" deleted succesfully");
			}else {
				System.out.println(create.getName()+" cannot be deleted succesfully");
					
			}
		}
		System.out.println("ok thanks for writing");
*/
// QUESTION 5: REPEATE THE QUESTION 4 FOR 2 -9 AND SAVE THE FILES IN A FOLDER :
//		creating files:
		int i=2;
		File file = new File("tables");
		File file2 = null;
		try {
			file.mkdir();
			while(i<=9) {
				file2 = new File("tables/table"+i+".txt");
				i=i+1;
			file2.createNewFile();
			System.out.println("file : "+file2.getName()+" created");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
//		writting :
		 i=2;
		try {
			String line=null;
			while(i<=9) {
				
				FileWriter write = new FileWriter("tables/table"+i+".txt");
				for(int j=1;j<=10;j++) {
					 line =line.format("%d X %d = %d\n",i,j,i*j);
					 write.write(line);
					 
				}
				write.close();
				System.out.println("file : table"+i+" writen");
				i=i+1;
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
//		read:
		 i=2;

		try {
			while(i<=9) {				
				file2 = new File("tables/table"+i+".txt");
				Scanner read = new Scanner(file2);
				
				System.out.format("file :"+file2.getName()+"\nprinting ... \n");
				while(read.hasNextLine()) {
					String line =read.nextLine();
					System.out.println(line);
				}
				
				
				i=i+1;
				
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	
}




