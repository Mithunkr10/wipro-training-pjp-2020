/*Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters.
 *  Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/

package com.wipro.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Mathoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the elements of array:");
		
		  for(int i=0;i<5;i++) { 
			  args[i]=in.next();
		
			  }
		 
		double sum=0;
		double avg=0;
		try {
			for(int i=0;i<5;i++)
			{//arr[i]=in.nextInt();
		arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
			}
			avg=sum/5;
			System.out.println("sum="+sum+"\nAVG="+avg);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getClass());
		}
		catch(NumberFormatException ne) {
			System.out.println(ne.getClass());
		}
		catch(ArithmeticException are) {
			System.out.println(are.getClass());
		}
		catch(InputMismatchException ie) {
			System.out.println(InputMismatchException.class);
		}
	
in.close();
	}

}
