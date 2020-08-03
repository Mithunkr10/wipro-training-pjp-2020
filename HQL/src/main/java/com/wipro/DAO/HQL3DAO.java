package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.wipro.bean.HQL3;

public class HQL3DAO {
		SessionFactory sf;
		public HQL3DAO() {
			Configuration cfg=new Configuration().configure();
			sf=cfg.buildSessionFactory();
		}
		
		public String InsertValues(HQL3 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.save(o);
			tr.commit();
			ses.close();
			return "Success";

		}
		public String UpdateValues(HQL3 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.update(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		
		public String DeleteValuesHQL1(HQL3 o)
		{
			Session ses = sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.delete(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		public HQL3 getValues(int FlowerID) {
			Session ses =sf.openSession();
			HQL3 o=new HQL3();
			o=ses.get(HQL3.class, new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public HQL3 loadValues(int FlowerID) {
			Session ses=sf.openSession();
			HQL3 o=new HQL3();
			o=ses.load(HQL3.class,new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public List<?> DisplayAll(String hql,String r)
		{	Session ses=sf.openSession();
			Query q=ses.createQuery(hql);
			List<?> l=q.getResultList();
			return l;
		}
		public List<?> FROMclause(String r)
		{
			Session ses=sf.openSession();
			Query q=ses.createQuery("FROM HQL3 WHERE RegNo=:reg");
			q.setParameter("reg", r);
			List<?> l=q.getResultList();
			return l;
		}
	}