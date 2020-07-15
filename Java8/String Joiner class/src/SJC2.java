import java.util.StringJoiner;

/*Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases:

i) s1 merged to s2.
ii) s2 merged to s1.*/

public class SJC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner s1=new StringJoiner("-");
StringJoiner s2=new StringJoiner("-");
	s1.add("Bangalore");
	s1.add("Chennai");
	s1.add("pune");
	s1.add("Mumbai");

	s2.add("Mumbai");
	s2.add("pune");
	s2.add("Chennai");
	s2.add("Bangalore");
	s1.merge(s2);
	System.out.println(s1);
	s2.merge(s1);
	System.out.println(s2);
	}

}
