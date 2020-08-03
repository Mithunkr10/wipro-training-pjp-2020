package com.wipro.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.wipro.bean.Address;
import com.wipro.bean.Mappings1;
import com.wipro.bean.Mappings2;
import com.wipro.bean.Mappings3;
import com.wipro.bean.Mappings4;
import com.wipro.bean.Mappings5;

import javassist.bytecode.Descriptor.Iterator;

@SuppressWarnings("unused")
public class MappingDAO {
	SessionFactory sf;
	public MappingDAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	public String Insert(Mappings5 m2)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.persist(m2);
		tr.commit();
		ses.close();
		return "Success";
		
	}
	public List<?> DisplayList(String hql)
	{
		Session ses=sf.openSession();
		Query q=ses.createQuery(hql);
		return q.getResultList();
	}
		
	public void DisplayMap(String hql)
	{
		Session ses=sf.openSession();
		List<?> q=ses.createQuery(hql).list();
		for(java.util.Iterator<?> i=q.iterator(); i.hasNext();)
		{
			Mappings3 m=(Mappings3) i.next();
			System.out.println("Continent:" +m.getCname());
			System.out.println("***************");
			System.out.print("Country");
			System.out.println(" and Capital:");
			System.out.println(m.getCountries());
		}
		
	}
	public String Delete(int empid)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		Mappings4 m=ses.get(Mappings4.class, empid);
		ses.delete(m);
		tr.commit();
		ses.close();
		return "Success";
	}
	 /* Method to add an address record in the database */
	   public Address addAddress(String street, String city, String state, String zipcode) {
	      Session session = sf.openSession();
	      Transaction tx = null;
	      Integer addressID = null;
	      Address address = null;
	      
	      try {
	         tx = session.beginTransaction();
	         address = new Address(street, city, state, zipcode);
	         addressID = (Integer) session.save(address); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return address;
	   }

	   /* Method to add an employee record in the database */
	   public Integer addEmployee(String fname, String lname, int salary, Address address){
	      Session session = sf.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Mappings5 employee = new Mappings5(fname, lname, salary, address);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employeeID;
	   }

	   /* Method to list all the employees detail */
	   public void listEmployees( ){
	      Session session = sf.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List<?> employees = session.createQuery("FROM Mappings5").list(); 
	         for (java.util.Iterator<?> iterator = employees.iterator(); iterator.hasNext();){
	            Mappings5 employee = (Mappings5)iterator.next(); 
	            System.out.print("First Name: " + employee.getFirstName()); 
	            System.out.print("  Last Name: " + employee.getLastName()); 
	            System.out.println("  Salary: " + employee.getSalary());
	            Address add = employee.getAddress();
	            System.out.println("Address ");
	            System.out.println("\tStreet: " +  add.getStreet());
	            System.out.println("\tCity: " + add.getCity());
	            System.out.println("\tState: " + add.getState());
	            System.out.println("\tZipcode: " + add.getZipcode());
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   /* Method to update salary for an employee */
	   public void updateEmployee(Integer EmployeeID, int salary ){
	      Session session = sf.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Mappings5 employee = (Mappings5)session.get(Mappings5.class, EmployeeID); 
	         employee.setSalary( salary );
	         session.update(employee);
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
}
