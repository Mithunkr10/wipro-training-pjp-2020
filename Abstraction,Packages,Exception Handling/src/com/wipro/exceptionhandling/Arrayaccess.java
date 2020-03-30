package com.wipro.exceptionhandling;
/* Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.

This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.

Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed

Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException*/

import java.util.Scanner;
public class Arrayaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{
	arr[i]=in.nextInt();
}

try {System.out.println("Enter the index of array element you want to access");
int m=in.nextInt();
	System.out.println("Array element at index "+m+"="+arr[m]);
			System.out.println("Array element successfully accessed");
	}

	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println(ArrayIndexOutOfBoundsException.class);
	}
in.close();
}	
}


