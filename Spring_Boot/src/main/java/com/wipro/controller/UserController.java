package com.wipro.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.Application;
import com.wipro.bean.Employee;
import com.wipro.bean.Employee1;
import com.wipro.bean.Laptop;
import com.wipro.bean.UserDetails;
import com.wipro.dao.EmployeeDAO;
import com.wipro.dao.EmployeeDAO1;


/*
Spring Boot Introduction

1 Create a Spring Boot application to display a message "Hello ".


SpringBoot Dependency Injection & AutoWired

1 Define three bean class called Laptop, Hard disk and Battery. 
And achieve dependency injection and auto wired by using Spring Boot.


SpringBoot WebApp MVC

1 Create a login page web application by using Spring Boot MVC. 
And if the user name is and the password is "Wipro@123" then redirect to success page else redirect to failure page.


SpringBoot MVC JPA H2

1 Create a web application by using Spring Boot MVC for "Employee1 Management System". 
And perform all the CRUD operations by using JPA and H2.


SpringBoot MVC JPA H2 REST

1 Create a web application by using Spring Boot MVC for "Employee1 Management System". 
And perform all the CRUD operations by using JPA, H2 and REST web service.

*/



@SuppressWarnings({ "unused" })
@Controller
public class UserController {

	/*
	 * //Exercise 1
	 * @RequestMapping("/hello")
	 * 
	 * @ResponseBody public String Hello() { System.out.println("Hello\n\n\n");
	 * return "Hello World!!!"; }
	 * 
	 *  //Exercise 2 -> Application.java file
	 */
	
	/*  //Exercise 3
	 * @RequestMapping("/home") public String Home() { return "Home"; }
	 * 
	 * @RequestMapping("/Login") public ModelAndView Login(@RequestParam("name")
	 * String n, @RequestParam("pswd") String p) { ModelAndView mv=new
	 * ModelAndView(); if(n.equalsIgnoreCase(" ") &&
	 * p.equalsIgnoreCase("Wipro@123")) { mv.addObject("msg", "Login Successful");
	 * mv.setViewName("Success1"); } else { mv.addObject("msg", "Login Failed");
	 * mv.setViewName("Success1"); }
	 * 
	 * return mv; }
	 */
	
	/*//Exercise 4
	 * @Autowired EmployeeDAO1 dao;
	 * 
	 * @RequestMapping("/emphome") public String Home() { return "empHome"; }
	 * 
	 * @RequestMapping("/AddEmp") public ModelAndView ADDEMP(Employee1 e) {
	 * ModelAndView mv=new ModelAndView(); dao.save(e); mv.addObject("msg",
	 * "Record Added"); mv.setViewName("empHome"); return mv; }
	 */
	
	
	//Exercise 5
	@Autowired 
	EmployeeDAO dao;
	
	@RequestMapping("/")
	public ModelAndView Menu()
	{
		ModelAndView mv=new ModelAndView("Menu");
		return mv;
	}
	
	@RequestMapping("AddEmp")
	public ModelAndView AddEmp()
	{
		
		ModelAndView mv=new ModelAndView("ADDEMP");
		return mv;
	}
	
	@RequestMapping("Modify")
	public ModelAndView Modify(Model m)
	{
		ModelAndView mv=new ModelAndView("MODIFYEMP");
		return mv;
	}
	
	@RequestMapping("DeleteEmp")
	public String Delete(Model m)
	{
		Employee ed=new Employee();
		m.addAttribute("ed", ed);
		return "DeleteEmployee";
	}
	@RequestMapping("DispById")
	public ModelAndView DispById(Model m)
	{
		ModelAndView mv=new ModelAndView("DisplayEmpById");
		return mv;
	}
	@RequestMapping("DisplayAll")
	public ModelAndView getEmp()
	{
		List<Employee> l=dao.findAll();
		ModelAndView mv=new ModelAndView();
		mv.addObject("l1", l);
		mv.setViewName("DisplayEMP");
		return mv;
	}
	@RequestMapping("/updatemp")
	public ModelAndView UpdateEmp(Employee e) {
		dao.save(e);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Records Updated");
		mv.setViewName("Success");
		return mv;
	}
	
	@RequestMapping("/AddEmployee")
	public ModelAndView AddEmp(Employee e)
	{
		dao.save(e);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Records Added");
		mv.setViewName("Success");
		return mv;
	}
	@RequestMapping("/DeleteEmpById")
	public ModelAndView DeleteEmp(@RequestParam("id") int id)
	{
		dao.deleteById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Record Deleted");
		mv.setViewName("Success");
		return mv;
	}
	
	@RequestMapping("DisplayEmp")
	public ModelAndView getEmp(@RequestParam("id") int id)
	{
		Optional<Employee> l=dao.findById(id);
		ModelAndView mv=new ModelAndView();
		//mv.addObject("l1", l);
		mv.setViewName("DisplayEMP");
		return mv;
	}
}
