/*Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under automobile package
Logan class extends com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 

Ford class extends  com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
Create objects of the relevant classes and test the various functionalities of the class.*/

package com.automobile.fourwheeler;

public class Logan extends com.automobile.Vehicle{
int speed;
int g=1;
	public Logan(String m, String r, String o,int s,int g) {
		super(m, r, o);
		// TODO Auto-generated constructor stub
	speed=s;
	this.g=g;
	}
	public int speed()
	{
		
	return speed;
	}
	public int gps()
	{	if(g==1)
		System.out.println("GPS is ON");
	else
		System.out.println("GPS is OFF");
	return 0;
	}

}
