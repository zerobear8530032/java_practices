package exercise;
import java.util.Scanner;
// QUESTION 1: CREATE A CLASS EMPLOYEE WITH THE ATTRIBUTES :

class employee{
	int salary ;
	String name ;
	
	
	void setname( String n ) {
		name=n;
	}
	void setsalary( int s ) {
		salary=s;
	}
	String getname() {
	return name;
	}
	int getsalary() {
	return salary;
	}
	
	
}
//QUESTION 2: CREATE A CLASS CELLPHONE WITH THE ATTRIBUTES :

class cellphone {
	void ringing () {
	System.out.println("ringing");
	}
	void vibrating () {
	System.out.println("vibrating ");
	}
	void calling (long ph) {
	System.out.println("calling "+ph);
	}
	void disconnecting () {
	System.out.println("call dis connected");
	}
	
}

//  QUESTION 3: CREATE A CLASS SQUARE WHICH HAVE A SIDE AND MEHODS TO FIND PERIMETER AND AREA:

class square{
	int side;
	
	void setside(int s) {
		side=s;
	}
	int getside() {
		return side;
	}
	
	void area() {
		System.out.println("the area of square is :"+side*side);
	}
	void perimeter() {
		System.out.println("the perimeter of square is :"+side*4);
	}
	
	
}
//  QUESTION 4: CREATE A RECTANGLE CLASS AND MADE FUNCTION TO GET AREA AND PERIMETER:
class rectangle{
float length;
float breadth;
	
void setLengthAndBreadth(float l,float b) {
		length =l;
		breadth =b;
	}
	void getLengthAndBreadth() {
		System.out.println("length :"+length+"\nbreadth :"+breadth);
		
	}
	
	void area() {
		System.out.println("the area of rectangle is :"+length*breadth);
	}
	void perimeter() {
		System.out.println("the perimeter of square is :"+(2*(length+breadth)));
	}
	
}
//	QUESTION 5: CREATE A CLASS GAME WITH SEVERAL METHODS:

class game {
	
	String player;
	void firing () {
		System.out.println(player+" firing ....");
	}
	void walking () {
		System.out.println(player+" walking....");
	}
	void fighting () {
		System.out.println(player+" fighting ....");
	}
	void setName (String n) {
		player = n;
		System.out.println("player name set as :"+player);
	}
}

// QUESTION 6 : CREATE A CLASS CIRCLE AND CALCULATE ITS AREA AND PERIMETER:

class circle1{
	float radius;
	double pie= Math.PI;
	
	void setRadius(float r) {
		System.out.println("radius set to :"+r);
		radius=r;
	}
	void area() {
		System.out.println("the area of the circle :"+(pie*(radius*radius)));
	}
	void perimeter() {
		System.out.println("the perimeter of the circle :"+(2*pie*radius));
	}
	
	
	
	
}
public class prac_set8 {
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
//	QUESTION 1:
//	System.out.println("enter the name :");
//	String n = sc.nextLine();
//	System.out.println("enter the salary :");
//	int sal=sc.nextInt();
//	employee emp = new employee();
//	emp.setname(n);
//	emp.setsalary(sal);
//	System.out.println("the name is :"+emp.getname());
//	System.out.println("the salary is :"+emp.getsalary());
	
//	QUESTION 2:
//	cellphone cell = new cellphone();
//	cell.calling(693785435);
//	cell.ringing();
//	cell.vibrating();
//	cell.disconnecting();

//  QUESTION 3:
//	square sqr= new square();
//	System.out.println("enter the length of the side:");
//	int side= sc.nextInt();
//	sqr.setside(side);
//	System.out.println(sqr.getside());
//	sqr.area();
//	sqr.perimeter();

//	QUESTION 4:
//	rectangle rec= new rectangle();
//	System.out.println("enter the length of rectangle");
//	float l=sc.nextFloat();
//	System.out.println("enter the breadth of rectangle");
//	float b=sc.nextFloat();
//	
//	rec.setLengthAndBreadth(l, b);
//	rec.getLengthAndBreadth();
//	rec.area();
//	rec.perimeter();

//	QUESTION 5:
//	game tommy= new game();
//	tommy.setName("tommy");
//	tommy.walking();
//	tommy.fighting();
//	tommy.firing();

//	QUESTION 6:
	circle1 c= new circle1 ();
	System.out.println("enter the radius of circle :");
	float rad= sc.nextFloat();
	c.setRadius(rad);
	c.area();
	c.perimeter();
}
}
