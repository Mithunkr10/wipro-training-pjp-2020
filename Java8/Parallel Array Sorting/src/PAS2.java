import java.util.Arrays;
import java.util.Scanner;

/*  Write a program as per the below instructions: 

a) Take any String as a input from the user. And convert this string into character array (you may use toCharArrayMethod()). 
b) Sort this character array using parallelSort() method. After sorting convert this character array into a String and
 display this String as a result.

Example: 
Input : valan
Output : aalnv  */
public class PAS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.println("Enter input:");
		String s=in.nextLine();
		int n=s.length();
		char a[]=s.toCharArray();
		s="";
		System.out.println("Before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		Arrays.parallelSort(a);
		System.out.println("\nAfter soring:");
		for(int i=0;i<n;i++)
			{ System.out.print(a[i]+" ");
				s+=String.valueOf(a[i]);}
		System.out.println("\nString value: "+s);
		in.close();

	}

}
