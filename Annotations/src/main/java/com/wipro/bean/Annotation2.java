package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Insert the following records into the Car-Detail table

RegNo| 	Model| 		Color| 	Manufacturer
KL-07| 	AB 123 Polo| 	White| 	Volkswagen
KL-07| 	AB 234 Vento| 	Black| 	Volkswagen
KL-07| 	AC 345 Corolla| 	Silver| 	Toyota*/

@Entity
@Table(name="Car_Details")
public class Annotation2 {
	@Id
	@Column(name="slno")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int slno;
	@Column(name="RegNo")
	private String RegNo;
	@Column(name="Model")
	private String Model;
	@Column(name="Color")
	private String Color;
	@Column(name="Manufacturer")
	private String Manufacturer;
	public Annotation2() {}
	
	public Annotation2(String regNo, String model, String color, String manufacturer) {
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
		return "Annotation1 [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer="
				+ Manufacturer + "]";
	}

}
