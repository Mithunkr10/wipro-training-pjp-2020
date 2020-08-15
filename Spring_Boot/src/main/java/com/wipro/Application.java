package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.wipro.bean.Laptop;

@SuppressWarnings("unused")
@SpringBootApplication
@ComponentScan({ "com.wipro.controller" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*
		 *  //Exercise 2
		 * ConfigurableApplicationContext cxt=SpringApplication.run(Application.class,
		 * args); Laptop lp=cxt.getBean(Laptop.class); lp.Display();
		 */
	}

}
