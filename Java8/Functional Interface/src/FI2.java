import java.util.ArrayList;
import java.util.Random;

/*
 Given an ArrayList containing 10 numbers, write a program to calculate the sum of all the elements,
with the help of Function.
*/

@FunctionalInterface
interface Calculate{
	abstract int add(int a);
}
public class FI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random r=new Random();
		int s=0;
		for(int i=0;i<10;i++) {
		int a=r.nextInt(10);
		al.add(a);}
		Calculate c=(a)->al.stream().filter(x->x>=0).mapToInt(i->i).sum();
		for(Integer n :al)
		{System.out.println(n);
		s=c.add(n);}
		System.out.println(s);

	}

}
