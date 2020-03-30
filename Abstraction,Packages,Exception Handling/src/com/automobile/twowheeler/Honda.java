package com.automobile.twowheeler;

public class Honda extends com.automobile.Vehicle {
	int speed;
	boolean player=true;
	public Honda(String m,String r,String o,int speed,boolean player)
	{
		super(m,r,o);
		this.speed=speed;
		this.player=player;
		
	}
	public int getSpeed()
	{
		return speed;
	}
	public void cdplayer() 
	{
		if(player==true)
		System.out.println("CD player is ON");
		else
			System.out.println("CD player is OFF");
	}

}
