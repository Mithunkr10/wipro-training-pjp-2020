package com.wipro.bean;

import java.util.Map;
import javax.persistence.*;

/*Create a program to persist the following class 10 objects using Collection Mapping:
Public class Continent{
Private String cname;
Private Map countries;
}
Note : Countries property should be of type Map object with Country String class object as key and Capital String class object as value*/
@Entity
@Table(name="Continent")
public class Mappings3 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int cID;
	
	private String cname;
	@ElementCollection
	private Map<String,String> countries;
	public Mappings3(String cname, Map<String, String> countries) {
		super();
		this.cname = cname;
		this.countries = countries;
	}
	public Mappings3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<String,String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	@Override
	public String toString() {
		return "Mappings3 [cname=" + cname + ", countries=" + countries + "]";
	}
}
