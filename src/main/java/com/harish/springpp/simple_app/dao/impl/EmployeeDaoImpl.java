package com.harish.springpp.simple_app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.harish.springpp.simple_app.dao.EmployeeDao;
import com.harish.springpp.simple_app.dao.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
    private HibernateTemplate template;
	
    public List<Employee> getAllEmployees() {          
        List<Employee> employees = template.loadAll(Employee.class);
        return employees;
    }
    
    public void setEmployee(Employee employee) {  
    	    template.save(employee);
    }
 
    
}
