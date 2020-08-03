package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.HQL1;

public class HQL1DAO {
		SessionFactory sf;
		public HQL1DAO() {
			Configuration cfg=new Configuration().configure();
			sf=cfg.buildSessionFactory();
		}
		
		public String InsertHQL1(HQL1 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.save(o);
			tr.commit();
			ses.close();
			return "Success";

		}
		public String UpdateHQL1(HQL1 o)
		{
			Session ses=sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.update(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		
		public String DeleteHQL1(HQL1 o)
		{
			Session ses = sf.openSession();
			Transaction tr=ses.beginTransaction();
			ses.delete(o);
			tr.commit();
			ses.close();
			return "Sucess";
		}
		public HQL1 getObjects1(int FlowerID) {
			Session ses =sf.openSession();
			HQL1 o=new HQL1();
			o=ses.get(HQL1.class, new Integer( FlowerID));
			ses.close();
			//System.out.println("Records::"+o);
			return o;
		}
		public HQL1 loadHQL1(int FlowerID) {
			Session ses=sf.openSession();
			HQL1 o=new HQL1();
			o=ses.load(HQL1.class,new Integer( FlowerID));
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
