/* Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
� returns the current speed of the vehicle.
public void radio() 
� provides facility to control the radio device 

Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
� Returns the current speed of the vehicle.
public void cdplayer() 
� provides facility to control the cd player device which is available in the car.

Create a test class to test the methods available in all these child class.*/

package com.automobile;

public abstract class Vehicle {
	String Modename,Regnum,owner;
	public Vehicle(String m,String r,String o)
	{
		Modename=m;
		Regnum=r;
		owner=o;
	}
	public String getModeName()
	{
		System.out.println(Modename);
		return Modename;
	}
	public String getRegistrationNumber() {
		System.out.println(Regnum);
		return Regnum;
	}
	public String getOwnerName() {
		System.out.println(owner);
		return owner;
	}
	

}
