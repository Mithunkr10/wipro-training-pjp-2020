package map;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. 
 * The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

public class ContactListCollection {
	static HashMap<String,Integer> ContactList=new HashMap<String,Integer>();
	
	boolean checkkey(String k) {
		if(ContactList.containsKey(k))
			return true;
		else
			return false;
	}
	
	boolean checkvalue(int v) {
		if(ContactList.containsValue(v))
			return true;
		else
			return false;
	}
	
	void Iterate() {
		Set s=ContactList.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+": "+me.getValue());	
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ContactListCollection cl=new ContactListCollection();
			ContactList.put("A",1234567890);
			ContactList.put("B",234567890);
			ContactList.put("C",34567890);
			ContactList.put("D",4567890);
			
			if(cl.checkkey("A"))
				System.out.println("Key found");
			else
				System.out.println("Key not Found");
			System.out.println();
			if(cl.checkvalue(78922605))
				System.out.println("Value found");
			else
				System.out.println("Value not found");
			System.out.println();
			cl.Iterate();
	}

}
