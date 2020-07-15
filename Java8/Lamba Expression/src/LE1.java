import java.util.*;

/*  Create an ArrayList al and add 25 random numbers. 
Write a code to print all the prime numbers that are present in it, using lambda expression. */
public class LE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<Integer>();
Random r=new Random();
for(int i=1;i<=25;i++)
	al.add(r.nextInt(1000));

System.out.println("Prime numbers:");
al.forEach(
		n->
		{ if(isPrime(n))
			System.out.println(n);
		}
		);
	}
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
