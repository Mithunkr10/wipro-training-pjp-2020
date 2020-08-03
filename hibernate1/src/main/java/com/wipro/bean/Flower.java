package com.wipro.bean;
/* 
Create a table with the following structure.
Column Name Datatypes
FlowerID Varchar2
FlowerName Varchar2
Color Varchar2
Price Number

Create proper bean class and insert a record into this table.
*/
public class Flower {
	private String FlowerID;
	private String FlowerName;
	private String Color;
	private float Price;
	
	public Flower() {
		// TODO Auto-generated constructor stub
	}
	public Flower(String flowerID, String flowerName, String color, float price) {
		super();
		FlowerID = flowerID;
		FlowerName = flowerName;
		Color = color;
		Price = price;
	}

	public String getFlowerID() {
		return FlowerID;
	}

	public void setFlowerID(String flowerID) {
		FlowerID = flowerID;
	}

	public String getFlowerName() {
		return FlowerName;
	}

	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Flower [FlowerID=" + FlowerID + ", FlowerName=" + FlowerName + ", Color=" + Color + ", Price=" + Price
				+ "]";
	}

}
