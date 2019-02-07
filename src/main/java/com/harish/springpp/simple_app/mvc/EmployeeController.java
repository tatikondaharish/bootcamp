package com.harish.springpp.simple_app.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harish.springpp.simple_app.mvc.entity.EmployeeDetails;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> employeeDetails (@RequestBody EmployeeDetails employeeDetails) {
		return new ResponseEntity(employeeDetails,HttpStatus.OK);
	}
	
	
}
