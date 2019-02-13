package com.harish.springpp.simple_app.dao;

import java.util.List;

import com.harish.springpp.simple_app.dao.entity.Employee;

public interface EmployeeDao {
	public void setEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
