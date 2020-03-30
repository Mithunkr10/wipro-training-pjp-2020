package map;

import java.util.*;

/*Create a Collection called HashMap which is capable of storing String objects. 
 * The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

public class CreateMap {
	static HashMap<String,String> hm=new HashMap<String,String>();
	
	boolean checkkey(String k) {
		if(hm.containsKey(k))
			return true;
		else
			return false;
	}
	
	boolean checkvalue(String v) {
		if(hm.containsValue(v))
			return true;
		else
			return false;
	}
	
	void Iterate() {
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+": "+me.getValue());	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateMap cm=new CreateMap();
		hm.put("A","a");
		hm.put("B","b");
		hm.put("C", "c");
		if(cm.checkkey("A"))
			System.out.println("Key found");
		else
			System.out.println("Key not Found");
		System.out.println();
		if(cm.checkvalue("a"))
			System.out.println("Value found");
		else
			System.out.println("Value not found");
		System.out.println();
		cm.Iterate();
		
		
		
		
	}

}
