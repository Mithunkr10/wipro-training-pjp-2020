package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Write a Hibernate program which will ask the user  to enter a registration number and 
 * display the details of that Vehicle. Assign the value to the query using a label.*/

@Entity
@Table(name="car_details")
public class HQL3 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ID;
	private String RegNo;
	private String Model;
	private String Color;
	private String Manufacturer;
	public HQL3() {}
	public HQL3(String regNo, String model, String color, String manufacturer) {
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
		return "HQL3 [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer
				+ "]";
	}
	

}
