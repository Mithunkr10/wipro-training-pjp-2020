package com.wipro.services;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
	//	Product p=new Product("Milk",28.90);
		ses.save(new Product("Milk",28.90));
		ses.save(new Product("Pen",25));
		ses.save(new Product("5-Star",10.90));
		tr.commit();
		System.out.println("Record inserted!!");
		System.out.println();
		ses.close();

	}

}
