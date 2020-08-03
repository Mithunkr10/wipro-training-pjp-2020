package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name="CarDetail")
public class CarDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int slno;
	private String RegNo;
	private String CarName;
	private String Color;
	private String Manufacturer;
	public CarDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarDetail(String regNo, String carName, String color, String manufacturer) {
		super();
		RegNo = regNo;
		CarName = carName;
		Color = color;
		Manufacturer = manufacturer;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
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
		return "CarDetail [RegNo=" + RegNo + ", CarName=" + CarName + ", Color=" + Color + ", Manufacturer="
				+ Manufacturer + "]";
	}
	

}
