package exercise;
import java.util.Scanner;
import java.util.Random;

public class exercise2_RockPaperScissorGame {
public static void main(String args[]) {
	Scanner sc =new Scanner (System.in);
	Random ran= new Random();
	System.out.println("hello welcome to the rock paper scissor game :");
	System.out.println("here are the rules and how to play :");
	System.out.println("enter the number from 1 to 3 where each number means a particular object :");
	System.out.println("enter the number 1 for rock");
	System.out.println("enter the number 2 for paper");
	System.out.println("enter the number 3 for scissor");
	System.out.println("enter yes to play the game else no :");
	String choice=sc.nextLine();
	int comscore=0,playerscore=0;
	if(choice.equalsIgnoreCase("yes")) {	
		int round =0;
		System.out.println("enter the number of rounds you want to play :");
		round=sc.nextInt();
		for(int i =1;i<=round;i++) {
			
		System.out.println("round :"+i);
		
		int computernum=ran.nextInt(1,4);
		System.out.println("enter the number between 1 to 3");
		byte playernum=sc.nextByte();
		System.out.println(computernum);
		
		
		
		
		if(playernum>3 || playernum<1 ) {
			System.out.println("invalid input please give valid input");	
			 playernum=sc.nextByte();
			 computernum=ran.nextInt(1,4);
		}
		if(playernum<=3 && playernum>=1 ) {
		if(playernum == computernum) {
			System.out.println("both choose same thing ");
		}
		else if(playernum==1 && computernum==2) {
			System.out.println("you choose rock computer choose paper  computer won 1 point ");
			comscore++;
		}
		else if(playernum==1 && computernum==3) {
			System.out.println("you choose rock computer choose scissor  you won 1 point ");	
			playerscore++;
		}
		else if(playernum==2 && computernum==1) {
			System.out.println("you choose paper computer choose rock  you won 1 point ");
			playerscore++;
		}
		else if(playernum==2 && computernum==3) {
			System.out.println("you choose paper computer choose scissor  computer won 1 point ");	
			comscore++;
		}
		else if(playernum==3 && computernum==1) {
			System.out.println("you choose scissor computer choose rock  player won 1 point ");
			comscore++;
		}
		else if(playernum==3 && computernum==2) {
			System.out.println("you choose scissor computer choose paper  you won 1 point ");	
			playerscore++;
		}
		
		}	}
	}
	else if(choice.equalsIgnoreCase("no")|| choice!="yes"){
		System.out.println("exit the game ");
		
	}

	
	if(playerscore!=0||comscore!=0 ) {
		if(comscore>playerscore) {
			System.out.println("computer win ");
		}
		else if(comscore<playerscore){
			System.out.println("player win");
		}
		else if(comscore==playerscore){
			System.out.println("its a draw wana play again ?");
		}
	}

}
}
