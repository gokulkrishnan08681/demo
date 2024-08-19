package Java8_Intro;

import java.util.Scanner;

@FunctionalInterface
interface one{
	public void name();
	//public void name(int a);
//	public int name();
	
}
public class Task2 {
public static void main(String[] args) {
	//-------------------------------------------------String Functions 1st interface 
//	one obj1=()->{String first="Hello Java";System.out.println(first.contains("Java"));};
//	obj1.name();
	//-------------------------------------------------With Arguments 2nd interfcae
//	one obj1=(a)->{if(a%2==0) {System.out.println("Even Number");}else {System.out.println("Odd Number");}};
//	obj1.name(10);
	//-------------------------------------------------Vote Eligible without argument 1 interface
//	one obj1=()->{
//	int a=20;
//		if(a > 18) {
//			System.out.println("Eligible");
//			}else {
//			System.out.println("Not Eligible");}
//	};
//	obj1.name();
	//-----------------------------------------------------return type 3 interface
//	one obj1=()->{
//		int sub1=100;
//		int sub2=100;
//		int sub3=80;
//		int sub4=100;
//		int sub5=76;
//		int total=sub1+sub2+sub3+sub4+sub5;
//		int avg=total / 5;
//		return avg;
//	};
//System.out.println("Your Percentage : "+obj1.name());
	//-----------------------------------------------------------------------------
		
}
}
