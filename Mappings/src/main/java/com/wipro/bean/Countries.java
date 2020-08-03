package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name="Country")
public class Countries {
	@Id
	private int cID;
	
	private String countryname;
	private String capital;
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Countries(String countryname, String capital) {
		super();
		this.countryname = countryname;
		this.capital = capital;
	}
	
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Countries [countryname=" + countryname + ", capital=" + capital + "]";
	}
	

}
