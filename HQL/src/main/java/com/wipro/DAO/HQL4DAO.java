package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.wipro.bean.HQL4;

public class HQL4DAO {
		SessionFactory sf;
		public HQL4DAO() {
			Configuration cfg=new Configuration().configure();
			sf=cfg.buildSessionFactory();
		}
		
		public String InsertValues(HQL4 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.save(o);
			tr.commit();
			ses.close();
			return "Success";

		}
		public String UpdateValues(HQL4 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.update(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		
		public String DeleteValuesHQL1(HQL4 o)
		{
			Session ses = sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.delete(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		public HQL4 getValues(int FlowerID) {
			Session ses =sf.openSession();
			HQL4 o=new HQL4();
			o=ses.get(HQL4.class, new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public HQL4 loadValues(int FlowerID) {
			Session ses=sf.openSession();
			HQL4 o=new HQL4();
			o=ses.load(HQL4.class,new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public List<?> DisplayAll(String hql)
		{	Session ses=sf.openSession();
			Query q=ses.createQuery(hql);
			return q.getResultList();
		}
		public List<?> FROMclause(String r)
		{
			Session ses=sf.openSession();
			Query q=ses.createQuery("FROM HQL3 WHERE RegNo=?0");
			q.setParameter(0, r);
			return q.getResultList();
		}
	}