package com.harish.springpp.simple_app.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harish.springpp.simple_app.mvc.entity.EmployeeDetails;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<EmployeeDetails> employeeDetails (@RequestBody(required = false) EmployeeDetails employeeDetails) {
		return new ResponseEntity(employeeDetails,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody EmployeeDetails getEmployeeDetails () {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setFirstName("Chandra");
		employeeDetails.setLastName("Nallam");
		employeeDetails.setEmailId("csnallam1@gmail.com");
		employeeDetails.setDepartment("department");
		return employeeDetails;
	}
	
}
