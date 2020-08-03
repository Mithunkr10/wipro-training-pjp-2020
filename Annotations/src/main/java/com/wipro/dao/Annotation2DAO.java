package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Annotation2;

public class Annotation2DAO {
	SessionFactory sf;
	public Annotation2DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertAnnotation2(Annotation2 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateAnnotation2(Annotation2 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	
	public String DeleteAnnotation2(Annotation2 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	public Annotation2 getAnnotation2(int FlowerID) {
		Session ses =sf.openSession();
		Annotation2 o=new Annotation2();
		o=ses.get(Annotation2.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	public Annotation2 loadAnnotation2(int FlowerID) {
		Session ses=sf.openSession();
		Annotation2 o=new Annotation2();
		o=ses.load(Annotation2.class,new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}

}
