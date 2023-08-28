package exercise;
import java.util.Scanner;
//	QUESTION 1: CREATE A CLASS OF CIRCLE AND CYLINDER WHERE CYLINDER IS INHERITED BY CIRCLE
//	QUESTION 3: CREATE VOLUME AND AREA IN CIRCLE AND CYLINDER

class circle{
	public float radius;
	double pie = Math.PI;
	circle (float r ){
		radius =r;
	}
	public double area () {
		return pie*radius*radius;	
}
	public double circumference () {
		return 2.F*pie*radius;	
}
		
}

class cylinder2 extends circle{
	float height ;
cylinder2(float r,float h) {
		super(r);
		height =h;
		// TODO Auto-generated constructor stub
	}

double volume () {
	return pie*radius*radius*height;
}
double surfacearea() {
	double a=2.F*pie*radius*height;
	double b=2.F*pie*radius*radius;
	
	return a+b;
}

	
}

//	QUESTION 2: CREATE A CLASS OF RECTANGLE AND CUBOID WHERE CUBEOID IS INHERITED BY RECTABGLE
//	QUESTION 4: CREATE VOLUME AND AREA IN RECTANGLE AND CUBOID

class rectangle3{
	float length;
	float width;
	rectangle3(float l,float b){
		length =l;
		width =b;
		
	}
	float area () {
		return length*width;
		
	}
	float perimeter () {
		return 2.F*(length+width);
		
	}
}
class cuboid extends rectangle3{
	float height;
	cuboid(float l, float b,float h) {
		super(l, b);
		height =h;
	}
	float surfacearea () {
		return ((2.F*length*width)+(2.F*length*height)+(2.F*height*width));
		
	}
	float volume () {
		return length*width*height;
		
	}
	
}

public class prac_set10 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

//	QUESTION 1:
	
//	System.out.println("enter the radius of circle : ");
//	float rad= sc.nextFloat();
//	circle c1= new circle(rad);
//	System.out.println("enter the height of circle : ");
//	float height= sc.nextFloat();
//	cylinder2 cyl = new cylinder2(rad,height);
//	
//	System.out.println("the area of circle :"+cyl.area());
//	System.out.println("the circumference of circle :"+cyl.circumference());
//	
//	System.out.println("the volume  of cylinder : "+cyl.volume());
//	System.out.println("the surface area of cylinder : "+cyl.surfacearea());

//	QUESTION 2:
	System.out.println("enter the length : ");
	float l=sc.nextFloat();
	System.out.println("enter the width : ");
	float w=sc.nextFloat();
	System.out.println("enter the height: ");
	float h=sc.nextFloat();
	
		cuboid cub=  new cuboid(l,w,h);
		System.out.println("the area of rectangle : "+cub.area());
		System.out.println("the perimeter of rectangle : "+cub.perimeter());
		System.out.println("the surface area of cuboid : "+cub.surfacearea());
		System.out.println("the volume of cuboid : "+cub.volume());
		
		
}
}
