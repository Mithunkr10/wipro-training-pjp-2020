package com.wipro.bean;
import com.wipro.bean.*;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/* Make another class called MultiCarOwner program to persist the following class object using Collection Mapping of one owner to many cars mapping:
public class CarOwner {  
private int OnnerId;  
private String OnerName;  
private List cars;
} */
@SuppressWarnings("unused")
@Entity
@Table(name="Owner")
public class Mappings2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int OwnerId;  
	
	private String OwnerName;  
	@OneToMany(cascade=CascadeType.ALL)
	@ElementCollection
	private List<MultiCarOwner> cars;
	public Mappings2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mappings2(String onerName, List<MultiCarOwner> cars) {
		super();
		OwnerName = onerName;
		this.cars = cars;
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
	public List<?> getCars() {
		return cars;
	}
	public void setCars(List<MultiCarOwner> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Mappings2 [OwnerId=" + OwnerId + ", OwnerName=" + OwnerName + ", cars=" + cars + "]";
	}

}
