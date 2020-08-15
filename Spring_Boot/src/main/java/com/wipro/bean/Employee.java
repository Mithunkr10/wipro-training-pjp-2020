package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String Name;
	@Column(name = "Gender", nullable = false)
	private String Gender;
	private String City;
	private String Designation;
	private String Email;
	private double Salary;
	private long Phone;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, String gender, String city, String designation, String email,double sal, long phone) {
		super();
		Name = name;
		Gender = gender;
		City = city;
		Designation = designation;
		Email = email;
		Salary=sal;
		Phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", City=" + City + ", Designation="
				+ Designation + ", Email=" + Email +", Salary="+ Salary + ", Phone=" + Phone + "]";
	}
	

}
