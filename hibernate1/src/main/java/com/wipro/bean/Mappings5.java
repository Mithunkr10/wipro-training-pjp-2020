package com.wipro.bean;

/* Connect to Oracle using Scott login

view the table structure of EMP table (desc Emp)
Create proper bean class for EMP table and insert a record into this table
Use Hibernate mapping file (.hbm.xml)*/

public class Mappings5 {
	private String name;
	private int id;
	private String desg;
	private double sal;
	
	public Mappings5() {}

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

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Mappings5(String name, int id, String desg, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.desg = desg;
		this.sal = sal;
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
