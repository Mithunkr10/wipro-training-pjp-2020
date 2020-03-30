package com.wipro.exceptionhandling;
/*Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 

Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully

Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.*/

import java.util.Scanner;
public class ExceptionSquare {
	static String s;
	static int n;
//	   static boolean numberOrNot(String input)
//	    {
//	        try
//	        {
//	            Integer.parseInt(input);
//	        }
//	        catch(NumberFormatException ex)
//	        {
//	            return false;
//	        }
//	        return true;
//	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter an integer");
s=in.next();

try {
		n=Integer.parseInt(s);
		System.out.println("The Square value is:"+n*n+"\nThe work has been done successfully");
	}
	catch (NumberFormatException nfe)
{
		nfe.printStackTrace();
		System.out.println("\nEntered input is not a valid format for an integer ");
}
	
	in.close();
	}

}
