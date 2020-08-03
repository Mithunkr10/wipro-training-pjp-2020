package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.*;

public class EmployeeAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		/*
		 * //delete record
		 *  Employee e=ses.get(Employee.class, 102); ses.delete(e);
		 */
		
		/*
		 * //insert record 
		 * Employee e=new Employee("emp2",102,"PE",10050.00);
		 * ses.save(e);
		 */
		
		  //create table 
		  Employee1 e=new Employee1("emp1","PE",100000.07); 
		  ses.save(e);
		 
		tr.commit();
		//System.out.println("Record Deleted!!");
		System.out.println("Record Inserted!!");
		System.out.println(e);
		ses.close();
	}

}
