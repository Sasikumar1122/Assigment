package com.springboot.services;

import java.util.List;

import com.springboot.Entity.EmployeeEntity;

public interface EmployeeService {
	
	 EmployeeEntity saveDepartment(EmployeeEntity employeeEntity);
	 
	 List<EmployeeEntity> fetchDepartmentList();

}
