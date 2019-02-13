package com.harish.springpp.simple_app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.springpp.simple_app.dao.EmployeeDao;
import com.harish.springpp.simple_app.dao.entity.Employee;
import com.harish.springpp.simple_app.mvc.entity.EmployeeDetails;
import com.harish.springpp.simple_app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public boolean saveEmployee(EmployeeDetails employeeDetails) {
		Employee employee = new Employee();
		employee.setDepartment(employeeDetails.getDepartment());
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		employeeDao.setEmployee(employee);
		return true;
	}
	
	
	
}
