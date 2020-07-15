
import java.util.*;


/* Given an ArrayList containing 10 words, write a program to reverse each word and 
update the same ArrayList , with the help of Consumer.*/

@SuppressWarnings("hiding")
@FunctionalInterface
interface Consumer<String>{
	void accept(String s);

}
public class FI6 implements Consumer<String> {
	public static String test(String arg0) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(arg0);
		String s=sb.reverse().toString();
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("abba");
		al.add("abtiba");
		al.add("abmba");
		al.add("abasbhga");
		al.add("abnnba");
		al.add("abgnba");
		al.add("gnabbang");
		al.add("abbkja");
		al.add("adfba");
		al.add("ababa");
		
		Consumer<String> c1=i->System.out.println(i);
		Consumer<List<String>> c2=x->{
			for(int j=0;j<x.size();j++)
				x.set(j,test(x.get(j)));
		};
		c2.accept(al);
		System.out.println(al.size());
		al.forEach(a->c1.accept(a));
	}


	@Override
	public void accept(java.lang.String t) {
		// TODO Auto-generated method stub
		
	}

}
