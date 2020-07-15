/*	
 Define your own class with a static method "int digitCount(int n)"
  which should return the number of digits in a given input "n". 
Define your own functional interface to refer this static method and 
invoke it to get the number of digits.
*/
interface myfunc{
	abstract int count(int n);
}
public class MR2 {
	
	public static int digitcount(int n) {
		int l=String.valueOf(n).length();
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myfunc obj=MR2::digitcount;
		System.out.println(obj.count(1234));
		
	}

}
