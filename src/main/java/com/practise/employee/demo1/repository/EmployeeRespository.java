package com.practise.employee.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.employee.demo1.entity.EmployeeEntity;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity, Integer> {

}
