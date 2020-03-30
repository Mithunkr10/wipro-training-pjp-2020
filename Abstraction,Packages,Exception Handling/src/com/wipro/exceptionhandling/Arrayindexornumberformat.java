/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero. 

This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .  Use exception handling mechanisms to handle this exception. 

Sample Input and Output 1:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed


 Sample Input and Output 2:
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException


 Sample Input and Output 3:
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException*/

package com.wipro.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrayindexornumberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=in.nextInt();
		int arr[]=new int[n];


		try {
			System.out.println("Enter array elements:");
			for(int i=0;i<n;i++)
			{
				arr[i]=in.nextInt();
			}
			System.out.println("Enter the index of array element you want to access");
			int m=in.nextInt();
			System.out.println("Array element at index "+m+"="+arr[m]);
					System.out.println("Array element successfully accessed");
			}

			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ArrayIndexOutOfBoundsException.class);
			}
		catch(NumberFormatException ne)
		{
			System.err.println(ne);
		}
		catch(InputMismatchException ie)
		{
			System.out.println(ie.getClass());
		}
		in.close();
	}

}
