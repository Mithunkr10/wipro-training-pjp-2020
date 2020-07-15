import java.util.ArrayList;
import java.util.StringJoiner;

/* Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by , (comma) and enclosed in { } brackets.*/

public class SJC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner s=new StringJoiner(",","{","}");
ArrayList <String> li=new ArrayList<String>();
li.add("Mithun");
li.add("Shadab");
li.add("Suhas");
li.add("Vijay");
li.add("Lochan");
li.forEach(a->s.add(a));
System.out.println(s);
	}

}
