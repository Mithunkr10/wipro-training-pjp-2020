package sets;

import java.util.*;

/*Write a program to store a group of employee names into a HashSet, 
 * retrieve the elements one by one using an Iterator.*/

public class RetrieveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names=new HashSet<String>();
		names.add("Mithun");
		names.add("Viji");
		names.add("Lochan");
		names.add("Shadab");
		
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
		}

	}

}
