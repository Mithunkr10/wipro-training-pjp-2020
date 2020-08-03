package com.wipro.bean;

import javax.persistence.*;

/*Convert the  Employee class with address class such that, one employee object should have only one address object (one-to-one). 
*As a Component Mapping Such that there is only one employee table and the address details are added as columns to the Employee table*/

@Entity
@Table(name="EMPLOYEE")
public class Mappings5{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;
	   
	   @OneToOne(cascade=CascadeType.ALL)
	   @ElementCollection
	   private Address address;

	   public Mappings5() {}
	   
	   public Mappings5(String fname, String lname, int salary, Address address ) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	      this.address = address;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }

	   public Address getAddress() {
	      return address;
	   }
	   
	   public void setAddress( Address address ) {
	      this.address = address;
	   }

	@Override
	public String toString() {
		return "Mappings5 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	}