import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Given an ArrayList containing 10 words, 
 * write a program to filter the words which are palindrome, 
 * with the help of Predicate.*/
class pal implements Predicate<String>{
	@Override
	public boolean test(String arg0) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(arg0);
		String s=sb.reverse().toString();
		if(s.equals(arg0))
			return true;
		else
			return false;
	}

}
public class FI3  {
	
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
		pal b=new pal();
		List <String> li=al.stream().filter(b).collect(Collectors.toList());
		for(String a:li)
			System.out.println(a.toString());
	}

	
}
