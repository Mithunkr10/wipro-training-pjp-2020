package com.wipro.bean;
import javax.persistence.*;
/*
 Using Hibernate create an employee table in the backend and insert 5 employee objects into the database.
The following are the details of the employee table. 
Name varchar2
Id Number
Designation varchar2
Salary Number
The Employee Id should be auto incremented
[ Hint : generator class="increment"]
*/
@Entity
@Table(name = "emp")
public class Employee1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	   @Column(name = "name")
	   private String name;

	   @Column(name = "desg")
	   private String desg;

	   @Column(name = "sal")
	   private double sal;
	public Employee1() {}
	public Employee1(String name, String desg, double sal) {
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
