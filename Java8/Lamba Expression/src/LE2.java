import java.util.ArrayList;

/*	
 Create an ArrayList al and add 10 different words. 
Write a code to print all the Strings in reverse order, using lambda expression. */

public class LE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("abc");al.add("def");al.add("ghi");
al.add("jlk");al.add("mno");al.add("pqr");
al.add("stu");al.add("vwx");al.add("yz");
al.forEach(
		n->{
			String r="";
				for(int i=n.length()-1;i>=0;i--)
					r=r+n.charAt(i);
				System.out.println(r);
			
		}
		);
	}

}
