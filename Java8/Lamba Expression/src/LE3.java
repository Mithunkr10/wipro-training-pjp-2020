import java.util.ArrayList;

/* Create an ArrayList al and add 10 different words.
Write a code to print all the Strings whose length is odd, using lambda expression.*/

public class LE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("ab");al.add("cdef");al.add("ghi");
		al.add("jlkm");al.add("nop");al.add("qr");
		al.add("stu");al.add("vwx");al.add("yz");
		al.forEach(
				n->{
					if(n.length()%2!=0)
						System.out.println(n);
					
				}
				);
	}

}
