package map;

import java.util.*;

/*1. Develop a java class with a instance variable M1 (HashMap)  create a method saveCountryCapital(String CountryName, 
 * String capital) , the method should add the passed country and capital as key/value in the map M1 and
 *  return the Map (M1).
Key- Country                          Value - Capital
India                                          Delhi
Japan                                          Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, 
from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, 
passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and 
value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                           India
Tokyo                                        Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. 
This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/

public class SaveCountry {

	static HashMap<String,String> M1=new HashMap<String,String>();
	static HashMap<String,String> M2=new HashMap<String,String>();
	static ArrayList<String> al=new ArrayList<String>();
	
	HashMap<String,String> saveCountryCapital(String countryname,String capital) {
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
	
	HashMap<String,String> IterateMap() {
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

		SaveCountry sc=new SaveCountry();
		System.out.println(sc.saveCountryCapital("India","Delhi"));
		System.out.println(sc.saveCountryCapital("Japan","Tokyo"));
		System.out.println(sc.saveCountryCapital("Nepal","Katmandu"));
		System.out.println(sc.getCapital("India"));
		System.out.println(sc.getCountry("Delhi"));
		System.out.println(sc.IterateMap());
		System.out.println();
	}

}
