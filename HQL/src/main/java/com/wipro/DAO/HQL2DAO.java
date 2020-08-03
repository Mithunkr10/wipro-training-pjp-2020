package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.HQL2;

public class HQL2DAO {
		SessionFactory sf;
		public HQL2DAO() {
			Configuration cfg=new Configuration().configure();
			sf=cfg.buildSessionFactory();
		}
		
		public String InsertValues(HQL2 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.save(o);
			tr.commit();
			ses.close();
			return "Success";

		}
		public String UpdateValues(HQL2 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.update(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		
		public String DeleteValuesHQL1(HQL2 o)
		{
			Session ses = sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.delete(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		public HQL2 getValues(int FlowerID) {
			Session ses =sf.openSession();
			HQL2 o=new HQL2();
			o=ses.get(HQL2.class, new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public HQL2 loadValues(int FlowerID) {
			Session ses=sf.openSession();
			HQL2 o=new HQL2();
			o=ses.load(HQL2.class,new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public List<?> DisplayAll(String hql)
		{	Session ses=sf.openSession();
			Query q=ses.createQuery(hql);
			List<?> l=q.getResultList();
			return l;
		}
	}
