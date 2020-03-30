package sets;

import java.util.*;

/*Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , 
 * the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet
 and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.*/

public class Country {
	Set<String> H1= new HashSet<String>();

	Set<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	String getCountry(String CountryName){
		int flag=0;
		Iterator<String> it=H1.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			if(ob.equals(CountryName)) {
				flag=1;
			}
		}
		if(flag==1)
			return CountryName;
		else
			return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country c=new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("Chile");
		c.saveCountryNames("America");
		c.saveCountryNames("Spain");
		
		System.out.println(c.getCountry("Spain"));
		System.out.println(c.getCountry("Nepal"));
	}

}
