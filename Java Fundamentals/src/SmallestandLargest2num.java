import java.util.Scanner;
public class SmallestandLargest2num {
	public static void main (String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}
 
		int largest1, largest2, temp;
 
		largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
 
		System.out.println ("The First largest is " + largest1);
		System.out.println ("The Second largest is " + largest2);
		
		int small1, small2, temp1;
		 
		small1 = array[0];
		small2 = array[1];
 
		if (small1 > small2)
		{
			temp1 = small2;
			small2 = small1;
			small1 = temp1;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] < small2)
			{
				small1 = small2;
				small2 = array[i];
			}
			else if (array[i] > small1 && array[i] != small2)
			{
				small1 = array[i];
			}
		}
		System.out.println ("The First smallest is " + small2);
		System.out.println ("The Second smallest is " + small1);
	}
}
