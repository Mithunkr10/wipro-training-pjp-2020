package com.automobile.twowheeler;

public class Hero extends com.automobile.Vehicle {
	int speed;
	boolean radio=true;
	public Hero(String m,String r,String o,int speed,boolean radio)
	{
		super(m,r,o);
		this.speed=speed;
		this.radio=radio;
		
	}
	
	public int getSpeed() 
	{
		return speed;
	}
	
	public void radio() 
	{
		 if(radio==true)
			 System.out.println("Radio is ON");
		 else
			 System.out.println("Radio is OFF");
	}

}
