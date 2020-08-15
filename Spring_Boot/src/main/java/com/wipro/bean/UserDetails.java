package com.wipro.bean;

import javax.persistence.*;
 

@Entity
@Table(name="UserDetails")
public class UserDetails {
	
	
	@Id
	private String EmployeeID;
	
	private String Username;
	
	private String Password;
	
	private String Email;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String employeeID, String username, String password, String email) {
		super();
		EmployeeID = employeeID;
		Username = username;
		Password = password;
		Email = email;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [EmployeeID=" + EmployeeID + ", Username=" + Username + ", Password=" + Password
				+ ", Email=" + Email + "]";
	}
	
}
