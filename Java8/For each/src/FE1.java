import java.util.ArrayList;

/*
Write a program to create an ArrayList and add the weekdays. 
Iterate and print all the elements using forEach method.
*/
public class FE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Mon");al.add("Tue");al.add("Wed");al.add("Thur");
al.add("Fri");al.add("Sat");al.add("Sun");
al.forEach(
		l->System.out.println(l));
	}

}
