package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entity.EmployeeEntity;
import com.springboot.services.EmployeeService;



@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	 
    public EmployeeEntity saveDepartment(
         @RequestBody EmployeeEntity employeeEntity)
    {
        return employeeService.saveDepartment(employeeEntity);
    
    }
	
	
}
