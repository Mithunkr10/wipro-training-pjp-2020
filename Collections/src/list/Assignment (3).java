package list;
import java.util.*;
/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/

public class StringArrayList {
	static ArrayList<String> al=new ArrayList<String>();
	
	void printAll() {
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			Object e=it.next();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringArrayList sa=new StringArrayList();
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
sa.printAll();
	}

}
