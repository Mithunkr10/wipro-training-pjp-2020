package list;

/*Write a Java program to create an ArrayList, add all the months of a year and print the same.*/
import java.util.*;

public class Arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Jan" );
al.add("Feb");
al.add("Mar");
al.add("April");
al.add("May");
al.add("Jun");
al.add("July");
al.add("Aug");
al.add("Sept");
al.add("Oct");
al.add("Nov");
al.add("Dec");
for(String s:al)
	System.out.println(s);
	}

}
