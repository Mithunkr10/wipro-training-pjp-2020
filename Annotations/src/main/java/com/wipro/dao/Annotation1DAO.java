package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Annotation1;

public class Annotation1DAO {
	SessionFactory sf;
	public Annotation1DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertAnnotation1(Annotation1 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateAnnotation1(Annotation1 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	
	public String DeleteAnnotation1(Annotation1 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	public Annotation1 getObjects1(int FlowerID) {
		Session ses =sf.openSession();
		Annotation1 o=new Annotation1();
		o=ses.get(Annotation1.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	public Annotation1 loadObjects1(int FlowerID) {
		Session ses=sf.openSession();
		Annotation1 o=new Annotation1();
		o=ses.load(Annotation1.class,new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}

}
