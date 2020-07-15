import java.util.Arrays;
import java.util.Random;

/* Write a program as per the below instructions:

Initialize an integer Array with 10 elements. 
Sort only first 5 elements in this array using parallelSort() method and display the sorted array.*/

public class PAS3 {

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
		Arrays.parallelSort(a,0,5);
		System.out.println();
		System.out.println("Array after sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
