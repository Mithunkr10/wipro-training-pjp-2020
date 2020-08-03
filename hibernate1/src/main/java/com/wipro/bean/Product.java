package com.wipro.bean;
import javax.persistence.*;

/* 
Using Hibernate create a Product table in the backend and insert 5 Product objects into the database.
The following are the details of theProduct table. 
ProductName varchar2
ProductId Number
Price Number
The value of the ProductId should be taken from a sequnce which is created at the back end
[ Hint : generator class=sequence ]
*/

@Entity
@Table(name="Product")

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ProductId;
	
	private String ProductName;
	
	private double Price;

	public Product() {}
	public Product(String productName, double price) {
		super();
		ProductName = productName;
		Price = price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int id) {
		this.ProductId = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + "]";
	}
	

}
