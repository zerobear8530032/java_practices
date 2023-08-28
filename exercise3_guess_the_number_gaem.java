package exercise;
import java.util.Scanner;
import java.util.Random;

class  game2{
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int number;
	int numberofguess;
	int num;
	game2(int n ){
		number=n;
		numberofguess =0;
	
	}
	
	void takeuserinput() {
	 num=sc.nextInt();
	}
	boolean iscorrect() {
		if(num<number) {
			System.out.println(" choose a bigger number ");
			return false;
		}
		else if(num>number){
			System.out.println("choose a smaller number");
			return false;
		}
		else if(num==number) {
			System.out.println("GG you choose the correct number :");
			System.out.println("it took you "+numberofguess+" guessed");
			return true;
			}
		return false;

		
	}
	void setguess(int n) {
		this.numberofguess=n;
	}
	int getguess() {
		return numberofguess;
	}
	
	
}
public class exercise3_guess_the_number_gaem {
public static void main(String args[]) {
	System.out.println("here are the rules enter a number :");
	System.out.println("if the number you enter is greater then you will shown you need larger number");
	System.out.println("if the number you enter is smaller then you will shown you need smaller number");
	System.out.println("the lesser tris you take to reach the number the better player you are");
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int random = ran.nextInt(1,200);
	int guess=0;
	game2 g= new game2(random);
	
	
	while(true) {
		System.out.println("enter the number between (1 to 200)");
		g.takeuserinput();
		guess++;
		g.setguess(guess);
		
		if(g.iscorrect()==true) {
			break;
		}
		
	}
}
}
