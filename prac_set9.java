package exercise;
import java.util.Scanner;
//  QUESTION 1 : CREATE A CLASS CYLINDER AND INITIALIZE RADIUS AND HEIGHT WITH GETTER AND SETTER
class cylinder{
	
	
	private float radius ;
	private float height;
	private double pie=Math.PI;
	
  void	setheight(float h){
		height=h;
	}

 float	getheight(){
		return height;
	}
  
 void	setradius(float r){
		radius=r;
	}

 float	getradius(){
		return radius;
	}
 
 
//  QUESTION 2: CALCULATE SURFACE AREA AND VOLUME OF CYLINDER:
 
 
//  QUESTION 3 : GENERATE THE CONSTRUCTOR TO INTIALIZE RADUS AND HEIGHT
 
 void volume() {
	 System.out.format("the volume of the cylinder is : %.2f\n",(pie*radius*radius*height));
 }
 void surfaceare() {
	 double a=2*pie*radius*height;
	 double b=2*pie*radius*radius;
	 System.out.format("the totasl surface area of the cylinder : %.2f",a+b);
 }
 public cylinder (float a, float b){
	 this.radius=a;
	 this.height = b;
	 
 }
}
//  QUESTION 4: CREATE A CLASS RECTANGLE AND OVERLOAD ITS CONSTRUCTOR: 
class rectangle2{
	
	private float length;
	private float breadth;
	
public 	rectangle2(){
		length=4.0f;
		breadth=5.0f;
	}

public 	rectangle2(float l,float b){
	length=l;
	breadth=b;
}
	void show() {
		System.out.println("length : "+length);
		System.out.println("breadth : "+breadth);
	}
}

// QUESTION 5: CREATE A CLASS SPHERE AND CALCULATE ITS AREA AND VOLUME:


class sphere{
	private float radius ;
	
	private double pie=Math.PI;
	
public 	sphere(float r) {
	this.radius=r;
}
	
	 void volume() {
		 double rad=Math.pow(radius, 3);
		 
		 System.out.format("the volume of the sphere is : %.2f\n",((4.F/3.F)*pie*rad));
	 }
	 void surfaceare() {

		 System.out.format("the totasl surface area of the sphere : %.2f",4*pie*radius*radius);
	 }


}

public class prac_set9 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
//	QUESTION 1:
//	cylinder cyl = new cylinder();
//	System.out.println("enter the radius:");
//	float r=sc.nextFloat();
//	System.out.println("enter the height:");
//	float h=sc.nextFloat();

//	qUESTION 2:
//	cyl.setradius(r);
//	cyl.setheight(h);
//	System.out.println("the radius of cylinder : "+cyl.getradius());
//	System.out.println("the height of cylinder : "+cyl.getheight());
//	cyl.volume();
//	cyl.surfaceare();
	
//	QUESTION 3:
	
//	cylinder cyl1 = new cylinder(r,h);
//	cyl1.volume();
//	cyl1.surfaceare();

//	QUESTION 4: 
//	rectangle2 rec1= new rectangle2();
//	rec1.show();
//	
//	rectangle2 rec2= new rectangle2(2,7);
//	rec2.show();
	
//	QUESTION 5:
	System.out.println("enter the radius of sphere");
	sphere sp= new sphere(sc.nextFloat());
	sp.volume();
	sp.surfaceare();
}
}
