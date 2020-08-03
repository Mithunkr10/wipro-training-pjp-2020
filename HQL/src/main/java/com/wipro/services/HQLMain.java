package com.wipro.services;

import java.util.List;
import java.util.Scanner;

import com.wipro.DAO.*;
import com.wipro.bean.*;

@SuppressWarnings("unused")
public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		/*
		 * HQL2 c=new HQL2("KL-07 AB 123","Polo","White","Volkswagen");
		 * System.out.println(dao.InsertValues(c)); c=new
		 * HQL2("KL-07 AB234","Vento","Black","Volkswagen");
		 * System.out.println(dao.InsertValues(c)); c=new
		 * HQL2("KL-07 AC 345","Corolla","Silver","Toyota");
		 * System.out.println(dao.InsertValues(c));
		 */
			/*HQL1DAO dao=new HQL1DAO();
			 * HQL1 Operations 
			 * System.out.println(dao.DisplayAll("FROM HQL1"));
		 */
		/*HQL2DAO dao=new HQL2DAO();
		 * HQL2 Operation
		 * List<?> l=dao.DisplayAll("SELECT RegNo,Manufacturer FROM HQL2"); for(Object
		 * a:l) System.out.println(String.valueOf(a));
		 */
		
		/* HQL3 Operation
		 * HQL3DAO dao=new HQL3DAO(); Scanner in=new Scanner(System.in);
		 * System.out.println("Enter the CAR RegNo:"); String r=in.next();
		 * System.out.println(dao.FROMclause(r)); in.close();
		 */
		
		/*HQL4 Qperation
		 * HQL4DAO dao=new HQL4DAO(); String
		 * hql="from HQL4 where Manufacturer LIKE 'V%'";
		 * System.out.println(dao.DisplayAll(hql));
		 */
		
		/*HQL5 Operation
		 * HQL5DAO dao=new HQL5DAO(); System.out.println(dao.getAllValues());
		 */
		
		HQL6DAO dao=new HQL6DAO();
		System.out.println(dao.DisplayByRegNo());
	}

}
