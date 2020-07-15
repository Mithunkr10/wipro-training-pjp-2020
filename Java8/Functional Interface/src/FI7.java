import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@SuppressWarnings("hiding")
/*	
 Given an ArrayList containing 10 numbers, write a program using Consumer methods to display each number and whether is it odd or even.
Example: For number 2, it should print "2 even" For number 5, it should print "5 odd"*/

/*
 * interface Consumer<Integer> { void accept(int n); }
 */
public class FI7 {
	public static boolean evenodd(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
		int a=r.nextInt(10);
		al.add(a);}
		Consumer<Integer> c1=i->System.out.println(i+" even");
		Consumer<Integer> c2=i->System.out.println(i+" odd");
		Consumer<List<Integer>> c3=x->{
			for(int i=0;i<x.size();i++)
			{
				if(evenodd(x.get(i))==true)
					c1.accept(x.get(i));
				else
					c2.accept(x.get(i));
			}
		};
		c3.accept(al);
		
	}

}
