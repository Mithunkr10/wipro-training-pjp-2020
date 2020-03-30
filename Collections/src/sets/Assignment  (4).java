package sets;


import java.util.*;

public class CountryTreeSet {
	TreeSet<String> H1= new TreeSet<String>();

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
