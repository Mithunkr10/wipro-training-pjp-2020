/*Write a Program with a division method which receives two integer numbers and performs the division operation. 

The method should declare that it throws ArithmeticException. This exception should be handled in the main method.*/
package com.wipro.exceptionhandling;
import java.util.Scanner;
public class Mathdivision {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
int a,b;

Scanner in=new Scanner(System.in);
System.out.println("Enter two values:");
a=in.nextInt();
b=in.nextInt();
try {
	
	System.out.println(a/b);
}
catch(ArithmeticException ae){
	System.out.println(ae.getClass());
	
}
	in.close();
	}

}
