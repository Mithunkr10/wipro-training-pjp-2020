package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MultiCarOwner")
public class MultiCarOwner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int OwnerID;
	
	private String RegNo;
	private String CarName;
	private String Color;
	private String Manufacturer;
	
	public MultiCarOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MultiCarOwner(String regNo, String carName, String color, String manufacturer) {
		super();
		RegNo = regNo;
		CarName = carName;
		Color = color;
		Manufacturer = manufacturer;
	}
	
	public int getOwnerId() {
		return OwnerID;
	}
	public void setOwnerId(int ownerId) {
		OwnerID = ownerId;
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
		return "MultiCarDetail [RegNo=" + RegNo + ", CarName=" + CarName + ", Color=" + Color + ", Manufacturer="
				+ Manufacturer + "]";
	}
	

}
