package map;
import java.util.*;
/*Write a program that will have a Properties class object which is capable of storing some States of India and
 *  their Capital. Use an Iterator to list all the elements stored in the Properties.*/


public class HashTablecountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties p = new Properties();
		
		p.setProperty("West Bengal", "Kolkata");
		p.setProperty("Rajasthan", "Jodhpur");
		p.setProperty("Bihar", "Patna");

		Set set = p.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me);
	}
	}
	}

