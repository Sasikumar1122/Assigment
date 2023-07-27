package com.springboot.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.EmployeeEntity;
import com.springboot.Repository.EmployeeRepository;
import com.springboot.services.EmployeeService;
@Service
public class EmployeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public EmployeeEntity saveDepartment(EmployeeEntity employeeEntity) {
		
		return ((EmployeeService) employeeEntity).saveDepartment(employeeEntity);
	}
	@Override
	public List<EmployeeEntity> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
