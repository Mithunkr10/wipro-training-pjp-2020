package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.HQL5;

public class HQL5DAO {
	SessionFactory sf;
	public HQL5DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertValues(HQL5 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateValues(HQL5 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	
	public String DeleteValuesHQL1(HQL5 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	public HQL5 getValues(int FlowerID) {
		Session ses =sf.openSession();
		HQL5 o=new HQL5();
		o=ses.get(HQL5.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	public HQL5 loadValues(int FlowerID) {
		Session ses=sf.openSession();
		HQL5 o=new HQL5();
		o=ses.load(HQL5.class,new Integer( FlowerID));
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
	public List<?> getAllValues() {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
		CriteriaBuilder cb=ses.getCriteriaBuilder();
		CriteriaQuery<HQL5> cq=cb.createQuery(HQL5.class);
		Root<HQL5> r=cq.from(HQL5.class);
		cq.groupBy(r.get("Color"));
		Query q=ses.createQuery(cq);
		return q.getResultList();
	}
}