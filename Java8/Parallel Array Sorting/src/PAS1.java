import java.util.Arrays;
import java.util.Random;

/* Write a program as per the below instructions:

a) Initialize an integer Array with 10 elements. 
b) Sort this array using parallelSort() method. 
c) And display the sum of min and max value of this array as result.*/

public class PAS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int[] a=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(n);
		System.out.println("Array before sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		Arrays.parallelSort(a);
		System.out.println();
		System.out.println("Array after sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\nSum of min and max value is:"+(a[0]+a[n-1]));
	}

}
