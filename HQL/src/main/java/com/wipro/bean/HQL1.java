package com.wipro.bean;

import javax.persistence.*;

/* Display the details of all cars from the following table using HQL.

RegNo 			Model 		Color 		Manufacturer
KL-07 AB 123 	Polo 		White		 Volkswagen
KL-07 AB234 	Vento 		Black 		 Volkswagen
KL-07 AC 345 	Corolla 	Silver		 Toyota*/

@Entity
@Table(name="car_details")
public class HQL1 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ID;
	private String RegNo;
	private String Model;
	private String Color;
	private String Manufacturer;
	public HQL1() {}
	public HQL1(String regNo, String model, String color, String manufacturer) {
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
		return "HQL1 [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer
				+ "]";
	}
	

}
