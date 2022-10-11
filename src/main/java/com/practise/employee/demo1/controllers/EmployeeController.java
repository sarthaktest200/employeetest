package com.practise.employee.demo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.employee.demo1.entity.EmployeeEntity;
import com.practise.employee.demo1.service.EmployeeService;

@RequestMapping("/emp")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	
	@GetMapping("/allEmployees")
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
		List<EmployeeEntity> empList = empService.getAllEmployees();
		return new ResponseEntity<>(empList, HttpStatus.ACCEPTED);
	}
}
