package advance_java;
import java.io.File;// library to do file management
import java.io.FileNotFoundException;
import java.io.FileWriter;// library to write on file
import java.io.IOException;// lobrary to manage io exception
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class java_file_handling {
public static void main(String args[]) {
	File f = new File("file2.txt");// file class constructor it take the address of file as a parameter 
//	try {// the function createNewFile throws an exception which need to be handle
//		f.createNewFile();// to create a file
//	} catch (IOException e) {
//		System.out.println("file cant created");
//		e.printStackTrace();
//	}
//	how to write on a file
//	try {
//		
//	FileWriter myfile = new FileWriter("file2.txt");
//	
//	for(int i =0;i<=10;i++)
//	{
////		obj.write : overrides the file means the old data will remove and new data will be added to the file
//	myfile.write("hello this is my first file created with a java program \n");// function to write in a file
//	}
//	myfile.close();// after writing in the file its necessary to close it 
//	}catch(Exception e) {
//		System.out.println("the task failed");
//		e.printStackTrace();
//	}
	
//	reading a file:
//	File myfile = new File("file2.txt");// create a new file object
//	Scanner sc;
//	try {
//		sc = new Scanner(myfile);
//		while(sc.hasNextLine()) {
//			String str=sc.nextLine();
//			System.out.println(str);	
//		}
//		sc.close();
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		System.out.println(e);
//	}
	// reading the file
	
	
	
//	File myfile1 = new File("file.txt");// create a new file object
//	Scanner sc1;
//	try {
//		sc1 = new Scanner(myfile1);
//		while(sc1.hasNextLine()) {
//			String str=sc1.nextLine();
//			System.out.println(str);	
//		}
//		sc1.close();
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		System.out.println(e);
//	}
	
//	deleting a file
//	creationg
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the file name :");
	String filename =scan.nextLine();
	/*
	File cf= new File(filename);
	try {		
	cf.createNewFile();

	
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
//	write:
	try {
		
	FileWriter write = new FileWriter(filename);
	write.write("hello this is a file");
	write.close();
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
	
//	read:
	System.out.println("reading the file:");
	Scanner read = null; 
	try {
	File file = new File(filename);
	read=new Scanner(file); 
	}catch(Exception e) {
		
	}
	
	while(read.hasNextLine()) {
		String line=read.nextLine();
		System.out.println(line);
	}
		
*/	
//	Deletion:
//	File delete = new File(filename);
//	if(delete.delete()) {
//		System.out.println("file "+delete.getName()+"is successfully deleted");
//	}else {
//		System.out.println("file "+delete.getName()+"is not deleted");
//		
//	}
	
	
}
}
