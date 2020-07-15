/* Define your own class with an instance method "int factorial(int n)"
 which should return the factorial of the given input "n". 
Define your own functional interface to refer this instance method and 
invoke it to get the factorial result. */

interface factofn{
	abstract int fact(int n);
}
public class MR1 {

		public int factn(int n) {
			if(n==1||n==0)
				return 1;
			else
				return n*factn(n-1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MR1 obj=new MR1();
		factofn fn=obj::factn;
		System.out.println(fn.fact(5));
	}

}
