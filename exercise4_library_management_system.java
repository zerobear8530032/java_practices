package exercise;
import java.util.Scanner;
//	create a class library
class library_Management_System{
	private String  [] availableBookArray = new String[100]; 	
	private String  [] issuedBookArray= new String[100]; 	
	
	library_Management_System(){
		availableBookArray [0]="english";
		availableBookArray [1]="hindi";
		availableBookArray [2]="science";
		availableBookArray [3]="history";
		availableBookArray [4]="geo-graphy";
		availableBookArray [5]="biology";
		
		
	}
	void showavailable() {
		int c=0;
		boolean isempty =true;
		for(String book :availableBookArray) {
			if(book==null) {
				continue;
			}
			c++;
			System.out.println(c+". : "+book);
			isempty=false;
		}
		if(isempty) {
			System.out.println("the list is empty right now the library have no available books");
		}
	}
	void showissued() {
		int c=0;
		boolean isempty=true;
		for(String book :issuedBookArray) {
			if(book==null) {
				continue;
			}
			c++;
			System.out.println(c+". : "+book);
		}
		if(isempty) {
			System.out.println("the list is empty right now you does not issued any book right now");
		}
	}
//	addbook()
void addbook(String bookname) {
boolean check =true;
	for(int i =0;i<availableBookArray.length;i++) {
		if(availableBookArray[i]==null) {
			continue;
		}
	else if(availableBookArray[i].equalsIgnoreCase(bookname)) {
			System.out.println("the book : \""+bookname+"\" is already in the library ");
			check=false;
		}
	}
	if(check) {
		for(int i=0;i<availableBookArray.length;i++) {
			if(availableBookArray[i]==null) {
				availableBookArray[i]=bookname;
				System.out.println("the book : \""+bookname+"\" is added to the library ");
				break;
			}
		}
	}
	}
		

//issue book() 
void issuebook(String bookname) {
	boolean isavailable=false;
	for(int i =0;i<availableBookArray.length;i++) {
		
		if(availableBookArray[i]==null) {
			continue;
		}
		else if(availableBookArray[i].equalsIgnoreCase(bookname)) {
			for(int j=0;j<issuedBookArray.length;j++) {
				if(issuedBookArray[j]==null) {
					issuedBookArray[j]=availableBookArray[i];
					availableBookArray[i]=null;
					System.out.println("the book: \""+bookname+"\" is issued");
					isavailable=true;

					break;
				}
				
				}
			
			}
		
	
		
	}
	if(isavailable==false) {
		System.out.println("the book  \""+bookname+"\" is not available in library right now");

	}
	
   }

//return book();

	
void returnbook(String bookname) {
	boolean isavailable=false;
for(int i =0;i<issuedBookArray.length;i++) {
		
		if(issuedBookArray[i]==null) {
			continue;
		}
		else if(issuedBookArray[i].equalsIgnoreCase(bookname)) {
			for(int j=0;j<availableBookArray.length;j++) {
				if(availableBookArray[j]==null) {
					availableBookArray[j]=issuedBookArray[i];
					issuedBookArray[i]=null;
					System.out.println("the book: \""+bookname+"\" is returned thanks");
					isavailable=true;

					break;
				}
				
				}
		
			}
		

		}
if(isavailable==false) {
	System.out.println("the book  \""+bookname+"\"is not issued by you");
}
}


	}


	
	

public class exercise4_library_management_system {
public static void main(String args[]) {
	
//	properties : array to store avialble book , arary to store show issued book
	
	library_Management_System library = new library_Management_System();
	System.out.println("HERE IS THE GUIDE FOR HOW TO USE THIS LIBRARY MANAGEMENT SYSTEM :");
	System.out.println("TO INTERACT WITH THE SYSTEM HERE YOU CAN ENTER THE NUMBER IN ORDER USE THIS SYSTEM");
	System.out.println("ENTER 1 TO SEE AVAILABLE BOOKS IN THE LIBRARY ");
	System.out.println("ENTER 2 TO SEE ISSUED BOOKS IN THE LIBRARY ");
	System.out.println("ENTER 3 TO ADD OR DONATE BOOK TO LIBRARY ");
	System.out.println("ENTER 4 TO ISSUE ANY BOOK FROM LIBRARY ");
	System.out.println("ENTER 5 TO RETURN ANY BOOK TO LIBRARY ");
	System.out.println("ENTER 6 TO EXIT FROM LIBRARY ");
		
	Scanner sc = new Scanner(System.in);
	int choice =0;
	while(choice!=6) {
		System.out.println("enter your choice :");
		choice =sc.nextInt();
		if(choice==1) {
			System.out.println("here are the list of available books : ");	
			library.showavailable();
		}
		else if(choice==2) {
			System.out.println("here are the list of issued books : ");		
			library.showissued();
		}
		else if(choice==3) {
			System.out.println("enter the book name you want to donate :");
			String book = sc.next();
			library.addbook(book);
		}
		else if(choice==4) {
			System.out.println("enter the book name you want to issue :");
			String book = sc.next();
			library.issuebook(book);
			
		}
		else if(choice==5) {
			System.out.println("enter the book name you want to return :");
			String book = sc.next();
			library.returnbook(book);
			
		}
		else if(choice==6){
			break;
		}
	}
	System.out.println("thanks for using the library ");
	
}
}
