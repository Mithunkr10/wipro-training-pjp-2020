package com.wipro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private String name;
	@Autowired
	private HardDisk hd;
	@Autowired
	private Battery bt;
	public Laptop() {
		super();
		System.out.println("Laptop bean called");
	}

	public Laptop(String name, HardDisk hd, Battery bt) {
		super();
		this.name = name;
		this.hd = hd;
		this.bt = bt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HardDisk getHd() {
		return hd;
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	public Battery getBt() {
		return bt;
	}
	public void setBt(Battery bt) {
		this.bt = bt;
	}
	public void Display()
	{
		System.out.println("LAPTOP");
		hd.Display();
		bt.Display();
	}
	
}
