package com.wipro.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;

import com.wipro.bean.HQL6;

@SuppressWarnings("unused")
public class HQL6DAO {
	SessionFactory sf;
	public HQL6DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	@SuppressWarnings("deprecation")
	public List<?> DisplayByRegNo(){
		Session ses=sf.openSession();
		CriteriaBuilder cb=ses.getCriteriaBuilder();
		CriteriaQuery<Long> cq=cb.createQuery(Long.class);
		Root<HQL6> r=cq.from(HQL6.class);
		cq.select(cb.count(r));
		//List<?> result=;
		Criteria q=ses.createCriteria(HQL6.class).setProjection(Projections.projectionList()
                .add(Projections.groupProperty("RegNo"))
                .add(Projections.count("RegNo")));
		return q.list();
		
	}
}
