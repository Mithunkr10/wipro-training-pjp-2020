package com.automobile;
import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
public class Testclass extends Vehicle {
	public Testclass(String m, String r, String o) {
		super(m, r, o);
		
		// TODO Auto-generated constructor stub
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Testclass t=new Testclass("hero","ab12nm3487","ME");
		Vehicle v=new Testclass("hero","ab12nm3487","ME");
		Hero h=new Hero("hero","ab12nm3487","ME",100,true);
		Honda ho=new Honda("honda","ab33tt5667","YOU",150,true);
		v.getModeName();
		v.getOwnerName();
		v.getRegistrationNumber();
		h.getModeName();
		h.getOwnerName();
		h.getRegistrationNumber();
		System.out.println(h.getSpeed());
		h.radio();
		ho.getModeName();
		ho.getOwnerName();
		ho.getRegistrationNumber();
		System.out.println(ho.getSpeed());
		ho.cdplayer();
		Logan l=new Logan("Logan","ab12nm3487","ME",100,1);
		Ford f=new Ford("Ford","ab33tt5667","YOU",100,1);
		l.getModeName();
		l.getOwnerName();
		l.getRegistrationNumber();
	System.out.println(l.speed());
	l.gps();
		f.getModeName();
		f.getOwnerName();
		f.getRegistrationNumber();
	System.out.println(f.speed());
	f.tempControl();
	}

}
