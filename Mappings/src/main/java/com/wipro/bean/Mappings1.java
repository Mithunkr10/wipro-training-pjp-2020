package com.wipro.bean;

/*Create a program to persist the following class object using Association Mapping where car would be on OneToOne mapping:
public class CarOwner{
private int OwnerId;  
private String OwnerName;  
private CarDetail car;
}*/
import javax.persistence.*;

@Entity
@Table(name="CarOwner")
public class Mappings1 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int OwnerId;  
	private String OwnerName;  
	@OneToOne(cascade=CascadeType.ALL)
	private CarDetail car;
	public Mappings1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mappings1(String ownerName, CarDetail car) {
		super();
		OwnerName = ownerName;
		this.car = car;
	}
	public int getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public CarDetail getCar() {
		return car;
	}
	public void setCar(CarDetail car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Mappings1 [OnnerId=" + OwnerId + ", OnerName=" + OwnerName + ", car=" + car + "]";
	}
	
	
}
