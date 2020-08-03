package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Write a Hibernate program to display only the Manufacturer's names which are starting with ‘V’ from above table
*/

@Entity
@Table(name="car_details")
public class HQL4 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ID;
	private String RegNo;
	private String Model;
	private String Color;
	private String Manufacturer;
	public HQL4() {}
	public HQL4(String regNo, String model, String color, String manufacturer) {
		super();
		RegNo = regNo;
		Model = model;
		Color = color;
		Manufacturer = manufacturer;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		System.out.println("\n");
		return "HQL4 [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer
				+ "]";
	}
	

}
