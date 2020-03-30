package com.automobile.fourwheeler;

public class Ford extends com.automobile.Vehicle {
	int speed;
	int ac=1;
	public Ford(String m, String r, String o,int s,int g) {
		super(m, r, o);
		// TODO Auto-generated constructor stub
		speed=s;
		ac=g;
	}
	
	public int speed()
	{
		return speed;
	}
	public int tempControl() 
	{
		if(ac==1)
			System.out.println("AC is ON");
		else
			System.out.println("AC is OFF");
		return 0;
	}
}
