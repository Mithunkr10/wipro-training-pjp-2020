package sets;

import java.util.*;

/*Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.*/

public class CreateTreeSet {
	static TreeSet<String> names=new TreeSet<String>();
	void reversecollection() {
		NavigableSet<String> ns=names.descendingSet();
		Iterator<String> it1=ns.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());
		System.out.println();
	}

	void Iteratelement() {
		Iterator<String> it2=names.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		System.out.println();
	}
	
	void checkelement(String name) {
		int f=0;
		Iterator<String> it3=names.iterator();
		while(it3.hasNext())
		{
			Object ob=it3.next();
			if(ob==name)
				f=1;
		}
		if(f==1)
			System.out.println("Name found");
		else
			System.out.println("Not Found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			names.add("Mithun");
			names.add("Viji");
			names.add("Lochan");
			names.add("Shadab");
			names.add("Suhas");
			CreateTreeSet ct=new CreateTreeSet();
			ct.reversecollection();
			ct.Iteratelement();
			ct.checkelement("Mithun");
			System.out.println();
			ct.checkelement("Abhi");
			
	}

}
