package com.wipro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bean.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	
}
