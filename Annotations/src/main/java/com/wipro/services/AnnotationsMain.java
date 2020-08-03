package com.wipro.services;

import com.wipro.bean.*;
import com.wipro.dao.*;

@SuppressWarnings("unused")
public class AnnotationsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	//Annotation1 operation
		 * 		 * Annotation1DAO dao=new Annotation1DAO();
		 * 
		 * Annotation1 a=new Annotation1('a',"K10","blue","Maruthi");
		 * 
		 * System.out.println(dao.InsertAnnotation1(a));
		 *
		 */	
		Annotation2DAO dao=new Annotation2DAO();
		Annotation2 a1=new Annotation2("KL-07","AB 123 Polo","White","Volkswagen");
		System.out.println(dao.InsertAnnotation2(a1));
		System.out.println(dao.getAnnotation2(a1.getslno()));
		Annotation2 a2=new Annotation2("KL-07","AB 234 Vento","Black","Volkswagen");
		System.out.println(dao.InsertAnnotation2(a2));
		System.out.println(dao.getAnnotation2(a2.getslno()));
		Annotation2 a3=new Annotation2("KL-07","AC 345 Corolla","Silver","Toyota");
		System.out.println(dao.InsertAnnotation2(a3));
		System.out.println(dao.getAnnotation2(a3.getslno()));
		
	}

}
