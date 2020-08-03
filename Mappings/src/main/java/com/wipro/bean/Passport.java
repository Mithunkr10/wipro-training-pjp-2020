package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name="Passport")
public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmployeeId;
	private String PassportNumber;
	private String Validity;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(String passportNumber, String validity) {
		super();
		PassportNumber = passportNumber;
		Validity = validity;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getPassportNumber() {
		return PassportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		PassportNumber = passportNumber;
	}
	public String getValidity() {
		return Validity;
	}
	public void setValidity(String validity) {
		Validity = validity;
	}
	@Override
	public String toString() {
		return "Passport [PassportNumber=" + PassportNumber + ", Validity=" + Validity
				+ "]";
	}
	

}
