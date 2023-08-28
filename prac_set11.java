package exercise;
import java.util.Scanner;
//	QUESTION 1 : CREATE A CLASS PEN WITH METHOD WRITE AND REFILL
abstract class pen{
	
	abstract void write(String str);
	abstract void refill();
	
}
//	QUESTION 2: CREATE A CLASS FOUNTAIN PEN WHICH EXTENDS PEN AND HAVE A METHOD  CAHNGE NIB:
class fountainpen  extends pen{

	void write(String str) {
		System.out.println("writting .....\n"+str);
	}

	void refill() {
		System.out.println("the pen is refilled");
		
	}
	void changenib() {
		System.out.println("the nib of the pen is changed");
	}
	
	
}
//	QUESTION 3: CREATE A CLASS MONKEY WITH (BITE() AND JUMP() METHOD) 
//	AND CLASS HUMAN INHERTEING MONKEY CLASS AND IMPLEMENTING INTERFACE BASIC ANIMALS WITH(EAT (),SLEEP())
class monkey {
	void bite(String str) {
	System.out.println("the monkey bitten :"+str);	
	}
	void jump(String str) {
		System.out.println("the monkey jump over the "+str);	
	}
}
interface animal{
//	void sound();
	default void sound() {
	System.out.println("animals sound");	
	}
}
interface basicanimal extends animal{
	void eat();
	void sleep (int n);
}
class human extends monkey implements basicanimal{
//	public void sound() {
//	System.out.println("animals sound");	
//	}
public void  eat () {
	System.out.println("feeling hungry eat some thing ");
}
public void sleep(int n) {
	System.out.println("you sleept for "+n+" hrs");
}
	
public void changeclothes() {
	System.out.println("changing clothes");
}
	
}
//	QUESTION 4: CREATE A CLASS TELEPHONE WHICH HAVE(RING () ,LIFT(),DISCONNECT()) AS ABSTRACT METHOD 
//AND CREATE CLASS SMARTTELEPHONE AND DEMONSTRATE POLYMORPHISM
abstract class telephone{
	abstract void ring ();
	abstract void lift ();
	abstract void disconnect ();
	
}
class smarttelephone extends telephone{
	public void ring() {
		System.out.println("telephone ringing ");
	}
	public void lift() {
		System.out.println("lifting the telephone");	
	}
	public void disconnect() {
		System.out.println("disconnected the call");
		}
	public void msg(String str) {
		System.out.println(str+ "sending the msg");
	}
}
// 	QUESTION 5: CREATE INTERFACE REMOTE AND INHERTED BY THE SMARTTVREMOTE
interface tvremote{
	void volumeup();
	void volumedown();
	void changechannel();
	
}
interface smarttvremote extends tvremote{
	
	void voicecommand();
	void playmusic();
	void startAC();
	
}
//	QUESTION 6: CREATEA A CLASS TV WHICH IMPLEMENTS TVREMOTE
class TV implements smarttvremote{
	void turnon() {
		System.out.println("turn on the TV");
	}
	void turnoff() {
		System.out.println("turn off the TV");
	}
	public void volumeup() {
		System.out.println("volume up....");
	}
	public void volumedown() {
		System.out.println("volume down....");
		
	}
	public void changechannel() {

		System.out.println("change channel....");
	}
	public void voicecommand() {
		System.out.println("hello tell me how can i help you");
	}
	public void playmusic() {
		System.out.println("playing music");
		
	}
	public void startAC() {
		System.out.println("Starting AC");
		
	}
	
	
	
}
public class prac_set11 {
public static void main(String args[]) {
//	QUESTION 2:
//	fountainpen fp = new fountainpen();
//	fp.write("saboor");
//	fp.refill();
//	fp.changenib();
	
//	QUESTION 3:
//	human h = new human();
//	h.jump("rock");
//	h.bite("person");
//	h.sleep(8);
//	h.eat();
//	h.changeclothes();
	
//	QUESTION 4:
	
//	telephone tp= new  smarttelephone();
//	
//	tp.ring();
//	tp.lift();
//	tp.disconnect();
//	tp.msg("hello "); cant use this method with tp object because reference is of telephone
//	smarttelephone stp= new  smarttelephone();
//	stp.ring();
//	stp.lift();
//	stp.disconnect();
//	stp.msg("hello "); 
//	here we can  use this method with stp object because reference is of smarttelephone
	
//	QUESTION 5: DEMONSTRATE POLY MORPHISM FROM MONEY AND HUMAN:
//	monkey m = new human();
//	m.bite("abdok");
//	m.jump("lake");
//	this does not work 
//	m.eat(); 
//	basicanimal b = new human();// here intrface reference can be taken but object should be of the concrete class
//	 to execute the interface methods and restrict others
//	b.eat();
//	b.sleep(3);
// here this can work as its a default method and extends by the interface
//	b.sound(); 
//	b.changeclothes(); this doees not work because the intrface does not have method and reference is of interface
	
//	basicanimal b = new monkey(); this does not work because the interface is not implemented here
	
		TV t = new TV();
		t.volumedown();
		t.volumeup();
		t.changechannel();
		t.voicecommand();
		t.startAC();
		t.playmusic();
	
		
	
}
}
