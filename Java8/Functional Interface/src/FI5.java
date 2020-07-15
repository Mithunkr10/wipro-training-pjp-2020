import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


 /* Given an ArrayList containing 10 numbers, write a program to filter the perfect square numbers.
Example for perfect square numbers: 0, 1, 4, 9, 16, 25, 36, 49, 64 etc..*/

/*class Findsqrt implements <Object>
{
	

	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		return false;
	}
}*/
public class FI5 implements Predicate<Integer>  {
	private double n;
	public FI5(double n)
	{
		this.setN(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FI5> al=new ArrayList<FI5>();
		
		//Random r=new Random();
		/*
		 * for(int i=0;i<10;i++) { int a=r.nextInt(10); al.add(a); }
		 */
		al.add(new FI5((double) 64));
		al.add(new FI5((double) 45));
		al.add(new FI5((double) 4));
		al.add(new FI5((double) 12));
		al.add(new FI5((double) 70));
		al.add(new FI5((double) 56));
		al.add(new FI5((double) 40));
		
		List<FI5> li=al.stream().filter(n->{
			 
					for(int i=0;i*i<=n.getN();i++)
					{
						if(n.getN()%i==0 && n.getN()/i==i)
							return true;
					}
					return false;
				
		}).collect(Collectors.toList()) ;
		for(FI5 a:li)
			System.out.println(a.getN());
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return false;
	}


}
