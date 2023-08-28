package java_extras;

import java.util.Date;

public class Date_Class_In_Java {

public static void main(String args[])
{
//	QUIZ: IS IT SAFE TO HAVE LONG MILLISECOND VALUE OF THE TIME TO CALCULATE THE TIME 
//	System.out.println("MAX LONG VALUE : "+Long.MAX_VALUE);
//	System.out.println("THE CURRENT TIME IN MILISECOND : "+System.currentTimeMillis());
//	System.out.println("so here we can see even after removing  the \ntime passed till now thier is a very large portion of number is still left to be used in future \n"+(Long.MAX_VALUE-System.currentTimeMillis()));
//	System.out.println("MAX LONG VALUE : "+(Long.MAX_VALUE/1000/3600/24/365));
	
//	date class:
	Date d1= new Date();// default constructor show curent date and time
	Date d2= new Date(2020,2,23);// param cunstructor which add the date from year 1 jan 1900 + the parameters 

	Date d3= new Date(2020,2,23,2,4,4);// param cunstructor which add the date from year 1 jan 1900 + the parameters 

	Date d4= new Date(2020,2,23,2,4);	// param cunstructor which add the date from year 1 jan 1900 + the parameters 
	Date d5 = new Date(1000);// heree when we insert time in milisecond it will convert them into date time
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	
	System.out.println(d5);
	System.out.println(d1.getTime());// this will return the time in milisecond from 1 jan 1970
	System.out.println(d1.getSeconds());// this will return the current second
	System.out.println(d1.getMinutes());// this will return the current minutes
	System.out.println(d1.getHours());// this will return the current hour
	System.out.println(d1.getDate());// this return the current day of month
	System.out.println(d1.getDay());// it return a number equivalent to day where 0 represent sunday and 1 for monday and so on
	System.out.println(d1.getMonth());// this return the current month of year 
	
	System.out.println(d1.getYear());// this deduct the current year from the 1900 to get how many year passed since 1900

//	System.out.println(d1.getSeconds());
	
	

}
}
