package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class Flowermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		Flower f=new Flower("001","Rose","Red",10);
		ses.save(f);
		tr.commit();
		System.out.println("Record Inserted");
		System.out.println(f);
		ses.close();
	}

}
