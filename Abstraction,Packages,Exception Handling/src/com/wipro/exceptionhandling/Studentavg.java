/*
Write a Program to take care of Number Format Exception if user enters values other than integer for
 calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken 
 from the user while executing the program.
In the same Program write your own Exception classes to take care of 
Negative values and values out of range (i.e. other than in the range of 0-100)*/

package com.wipro.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class NegvalException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int n;
	NegvalException(int n)
	{
		if(n<0||n>100)
		{
			this.n=n;
		}
	}
	int ele()
	{
		return n;
	}
}
public class Studentavg {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NegvalException {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		int b[]=new int[3];
		int sum1=0;
		int sum2=0;
		Scanner in=new Scanner(System.in);
		try{
			System.out.println("Enter the marks for student 1:");
		
		for(int i=0;i<3;i++)
			{
			
			a[i]=in.nextInt();
			if(a[i]<0||a[i]>100)
			{
				throw new NegvalException(a[i]);
			}
			else {
			sum1+=a[i];
			}}
		System.out.println("Enter the marks for student 2:");
		for(int i=0;i<3;i++)
			{
			b[i]=in.nextInt();
			if(b[i]<0||b[i]>100)
			{
				throw new NegvalException(b[i]);
			}
			else {
			sum2+=b[i];
			}}
		System.out.println("Avg of student 1:"+sum1/3+"\nAvg of student 2:"+sum2/3);
		}
		catch(NegvalException n)
		{
			System.out.println("Invalid input to array:"+n.ele());
			n.printStackTrace();
		}
		catch(InputMismatchException mi)
		{
			System.out.println(mi.getClass());
		}
		in.close();
	}

}
