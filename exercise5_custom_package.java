package exercise;
import java.util.Scanner;
import shapes.cylinder;
public class exercise5_custom_package {
public static void main(String args[]) {
//	create a package com.harry.shape
//	this package should have individual classes rectangle ,square,circle,cylinder,sphere,
//	these classes should use inheritance to properly manage the code
//	include methods like volume surface area and gette setters for dimention
	Scanner sc = new Scanner(System.in);
//System.out.println("enter the radius of circle :");
//float rad = sc.nextFloat();
//	circle c = new circle(rad);
//
//	System.out.println("area :"+c.area());
//	System.out.println("perimeter :"+c.circumference());

	
//	System.out.println("enter the length of circle :");
//	float l=sc.nextFloat();
//	System.out.println("enter the breadth of circle :");
//	float b=sc.nextFloat();
//	System.out.println("enter the height of circle :");
//	float h=sc.nextFloat();
//	cuboid cub = new cuboid(l,b,h);
//	System.out.println("surfacea area"+ " : "+cub.surfacearea());
//	System.out.println("volue : "+cub.volume());
	System.out.println("enter the  radius :");
	float r=sc.nextFloat();
	System.out.println("enter the height  :");
	float h=sc.nextFloat();
cylinder cyl= new cylinder(r,h);

System.out.println("surface :"+cyl.totalsurfacearea());
System.out.println("volume:"+cyl.volume());

}
}
