package java_extras;

public class date_time {
public static void main(String args[]) {
//	date amd time :
//	in java the date and time is calculated by measuring the time passed since 1 jan 1970 till now
//	and this is time is calculated in mili second and store in the long number
	
//	the java assumes that the time starts from 1900 means for java the calander is started in the year 1900:
		
//		System.currentTimeMillis() //this is used to get the current time which is spend till 1 jan 1970
//	 this is the amount of time passed since 1 jan  1970 	
	long  Millisecond=System.currentTimeMillis();
		System.out.println("Milisecond : " +Millisecond);
		double second = Millisecond/1000;
		System.out.println("seconds : "+second);
		double minutes = second /60.F;
		System.out.println("minutes : "+minutes);
		double hours = minutes/60.F;
		System.out.println("hours : "+hours);
		double days = hours/24.F;
		System.out.println("days : "+days);
		double weeks = days/7.F;
		System.out.println("weeks : "+weeks);
		double months = days/30.F;
		System.out.println("months : "+months);
		double years = days/365.0F;
		System.out.println("year : "+years);
		
		System.out.println(Long.MAX_VALUE);
	
}}