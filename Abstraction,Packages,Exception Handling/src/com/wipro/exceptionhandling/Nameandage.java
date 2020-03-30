/*Write a program to accept name and age of a person from the command prompt
 * (passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)*/
 
package com.wipro.exceptionhandling;
//import java.util.Scanner;

class Errorexception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
	Errorexception(int a){
		this.age=a;
	}
	void disp() {
		if(age<18||age>60)
		System.out.println("Enter valid age between 18 & 60\nNow Exiting code.....");
	}
}
public class Nameandage {

	public static void main(String[] args) throws Errorexception {
		// TODO Auto-generated method stub

int age;
//Scanner in=new Scanner(System.in);
try{
	String n=args[0];
age=Integer.parseInt(args[1]);
//	n=in.next();
//age=in.nextInt();
System.out.println(n+"\n"+age);
throw new Errorexception(age);

}
catch(Errorexception e) {
	e.disp();
	System.exit(0);
}
//in.close();
	}

}
