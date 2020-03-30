package map;

/*Implement the assignment 1 using TreeMap*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCollection {

	static TreeMap<String,String> M1=new TreeMap<String,String>();
	static TreeMap<String,String> M2=new TreeMap<String,String>();
	static ArrayList<String> al=new ArrayList<String>();
	
	TreeMap<String,String> saveCountryCapital(String countryname,String capital) {
		M1.put(countryname, capital);
		System.out.println();
	return M1;
	}
	
	String getCapital(String countryname) {
		String cap=(String)M1.get(countryname).toString();
		System.out.println();
		return cap;
		
	}
	
	String getCountry(String Capitalname) {
		String con = null; 
		for (String key : M1.keySet()) {
	            if (Capitalname.equals(M1.get(key))) {
	                con= key;
	            }
	        }
		System.out.println();
		
		return con;
	}
	
	TreeMap<String,String> IterateMap() {
		Set s=M1.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			M2.put((String) me.getValue() ,(String) me.getKey());
		}System.out.println();
		return M2;
	}
	
	ArrayList<String> createlist(){
		Set s1=M1.entrySet();
		Iterator it1=s1.iterator();
		while(it1.hasNext()) {
			Map.Entry me1=(Map.Entry)it1.next();
			al.add((String)me1.getKey());
			}System.out.println();
		
		return al;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMapCollection sc=new TreeMapCollection();
		System.out.println(sc.saveCountryCapital("India","Delhi"));
		System.out.println(sc.saveCountryCapital("Japan","Tokyo"));
		System.out.println(sc.saveCountryCapital("Nepal","Katmandu"));
		System.out.println(sc.getCapital("India"));
		System.out.println(sc.getCountry("Delhi"));
		System.out.println(sc.IterateMap());
		System.out.println();
	}
}
