/* Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.

This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. 

In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.

Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block

Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block*/

package com.wipro.exceptionhandling;
import java.util.Scanner;
class DivideByZeroException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DivideByZeroException(){
			
	}
	void disp() {
		System.out.println("DivideByZeroException caught");
	}
}
public class DivideException {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws DivideByZeroException {
		// TODO Auto-generated method stub
int a,b;
Scanner in=new Scanner(System.in);

try {a=in.nextInt();
b=in.nextInt();
if(b==0) {
	throw new DivideByZeroException();
} else {
	System.out.println("The quotient of "+a+"/"+b+" = "+a/b);
}
	
}
catch(DivideByZeroException de) {
	de.disp();
}
catch(ArithmeticException ae) {
	System.out.println(ae.getClass());
}
finally {
	System.out.println("Inside finally block");
}
in.close();
}



}
