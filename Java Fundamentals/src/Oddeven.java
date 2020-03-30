import java.util.Scanner;

public class Oddeven {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		if(n%2==0)
			System.out.println("Even");
		
		else
			System.out.println("Odd");
	}
}
