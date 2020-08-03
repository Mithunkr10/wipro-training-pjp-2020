package com.wipro.services;

import java.util.*;

import com.wipro.DAO.MappingDAO;
import com.wipro.bean.*;

@SuppressWarnings("unused")
public class MappingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MappingDAO dao=new MappingDAO();
		
		/*Mappings1 Operation
		 * CarDetail cd=new CarDetail("KA 04 MP 1234","Alto","Grey","Maruti"); Mappings1
		 * m1=new Mappings1("Mithun",cd); System.out.println(dao.Insert(m1));
		System.out.println(dao.Display("FROM Mappings1"));
		*/
		
		//Mappings2 Operation
		
		/*
		 * ArrayList<MultiCarOwner> mclist1=new ArrayList<MultiCarOwner>();
		 * mclist1.add(new MultiCarOwner("KA 04 MP 1234","Alto","Grey","Maruti"));
		 * mclist1.add(new MultiCarOwner("KA 07 ML 5612","A4","Black","Audi"));
		 * mclist1.add(new MultiCarOwner("KA 05 AP 9874","City","Red","Honda"));
		 * 
		 * Mappings2 m2=new Mappings2("Mithun",mclist1);
		 * System.out.println(dao.Insert(m2));
		 * 
		 * List<?> l1=dao.DisplayList("FROM Mappings2"); for(Object a:l1)
		 * System.out.println(a);
		 */
		 
		
		// Mappings3 Operation
		/*
		 * Map<String,String> mc=new HashMap<String,String>();
		 * mc.put("Afghanistan","Kabul"); mc.put("Bhutan","Thimphu");
		 * mc.put("Cambodia","Phnom Penh"); mc.put("Georgia","Tbilisi"); mc.put("India",
		 * "Delhi"); mc.put("JAPAN","TOKYO"); mc.put("Kuwait","Kuwait City");
		 * mc.put("Laos","Vientiane"); mc.put("Maldives","Male");
		 * mc.put("Nepal","Kathmandu"); mc.put("Oman","Muscat");
		 * 
		 * Mappings3 m3=new Mappings3("Asia",mc); System.out.println(dao.Insert(m3));
		 * 
		 * dao.DisplayMap("FROM Mappings3");
		 */
		
		/*  Mappings4 Operation
		 * Passport p=new Passport("ABC-123-PP","Jul-2022"); Mappings4 m4=new
		 * Mappings4("Mithun",p); System.out.println(dao.Insert(m4));
		 * 
		 * p=new Passport("XYZ-176-PQ","Jun-2022"); m4=new Mappings4("Vijay",p);
		 * System.out.println(dao.Insert(m4));
		 * 
		 * System.out.println(dao.Delete(1));
		 */
		

	      /* Let us have one address object */
	      Address address1 = new Address("Kondapur","Hyderabad","AP","532");

	      /* Add employee records in the database */
	      Mappings5 empID1 = new Mappings5("Manoj", "Kumar", 4000, address1);
	      System.out.println(dao.Insert(empID1));

	      /* Let us have another address object */
	      Address address2 = new Address("Saharanpur","Ambehta","UP","111");
	  
	      /* Add another employee record in the database */
	      Mappings5 empID2 = new Mappings5("Dilip", "Kumar", 3000, address2);
	      System.out.println(dao.Insert(empID2));
	      /* List down all the employees */
	      dao.listEmployees();

	      /* Update employee's salary records */
	      dao.updateEmployee(1, 5000);

	      /* List down all the employees */
	      dao.listEmployees();
		}

}

