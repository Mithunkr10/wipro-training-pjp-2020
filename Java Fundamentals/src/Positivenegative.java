import java.util.Scanner;
public class Positivenegative {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=in.nextInt();
	if(n==0)
		System.out.println("Zero");
	else if(n>0)
	System.out.println("Positive");
	else
		System.out.println("Negative");
}
}
