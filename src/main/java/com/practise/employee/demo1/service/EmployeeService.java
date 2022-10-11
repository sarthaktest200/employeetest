package com.practise.employee.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practise.employee.demo1.entity.EmployeeEntity;

//@Service
public interface EmployeeService {
	
	public List<EmployeeEntity> getAllEmployees();
	
	public EmployeeEntity getEmployeById(int id);
	
	public EmployeeEntity addEmployee(EmployeeEntity newEmployee);

}
