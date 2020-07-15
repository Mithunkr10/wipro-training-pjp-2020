/* Define your own class and a parameterized constructor with one integer argument. 
 * It should check the argument and display "Prime" or "Not Prime". 
Define your own functional interface to refer this constructor and 
invoke it to check whether the given number is Prime or Not.
*/
interface myprime{
	void prime(int n);
}
public class MR3 {
	private int flag=0;
	MR3(int n)
	{
		for(int i=2;i<n;i++)
			if(n%i==0)
				{ flag=1; break;}
		if(flag==0)
			System.out.println(n+" is Prime number");
		else
			System.out.println(n+" is not prime number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myprime obj1=MR3::new;
		obj1.prime(11);

	}

}
