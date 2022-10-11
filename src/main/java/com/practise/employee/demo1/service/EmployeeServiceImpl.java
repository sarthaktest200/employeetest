package com.practise.employee.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employee.demo1.entity.EmployeeEntity;
import com.practise.employee.demo1.repository.EmployeeRespository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRespository empRepo;
	
	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public EmployeeEntity addEmployee(EmployeeEntity newEmployee) {
		return null;
	}

	@Override
	public EmployeeEntity getEmployeById(int id) {
		Optional<EmployeeEntity> dbObject = empRepo.findById(id);
		return dbObject.get();
	}

}
