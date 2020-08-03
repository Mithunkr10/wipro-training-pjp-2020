package com.wipro.bean;

import javax.persistence.*;

/*	
 Write a Hibernate Program which makes using of all the annotations @Entity, @Table, @Id, @Column to create the mapping 
 for the following table Car_Details
RegNo char(5)
Model varchar2(20)
Color varchar2(10)
Manufacturer varchar2(20)
*/
@Entity
@Table(name="Car_Details")
public class Annotation1 {
	@Id
	@Column(name="slno")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int slno;
	@Column(name="RegNo")
	private char RegNo;
	@Column(name="Model")
	private String Model;
	@Column(name="Color")
	private String Color;
	@Column(name="Manufacturer")
	private String Manufacturer;
	public Annotation1() {}
	
	public Annotation1(char regNo, String model, String color, String manufacturer) {
		super();
		RegNo = regNo;
		Model = model;
		Color = color;
		Manufacturer = manufacturer;
	}
	public int getslno() {
		return slno;
	}
	public void setslno(int Slno) {
		slno=Slno;
	}
	
	public char getRegNo() {
		return RegNo;
	}
	public void setRegNo(char regNo) {
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
		return "Annotation1 [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer="
				+ Manufacturer + "]";
	}

}
