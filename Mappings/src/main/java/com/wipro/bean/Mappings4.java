package com.wipro.bean;

import javax.persistence.*;

/* Write an Employee class and Passport class such that, one employee object should hold only one passport object (one-to-one).
Implement a client code such that when we save or delete Employee object, automatically passport object should be stored or 
deleted in a related table.
Note: you can add any appropriate class members*/

@Entity
@Table(name="Employee")
public class Mappings4 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmployeeId;
	private String EmployeeName;
	@ElementCollection
	@OneToOne(cascade=CascadeType.ALL)
	private Passport passort;
	public Mappings4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mappings4(String employeeName, Passport passort) {
		super();
		EmployeeName = employeeName;
		this.passort = passort;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Passport getPassort() {
		return passort;
	}
	public void setPassort(Passport passort) {
		this.passort = passort;
	}
	@Override
	public String toString() {
		return "Mappings4 [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", passort=" + passort + "]";
	}

}
