package com.dev.DeclarationOnImpots.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.DeclarationOnImpots.Entity.Employee;

import com.dev.DeclarationOnImpots.Service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
 @Autowired
 private EmployeeService employeeService;
 
 @RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Employee> getAllEmployees() {
		return this.employeeService.findAll();
	}
	@RequestMapping(value = "/employees/{NumEmployee}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee findOne(@PathVariable Long NumEmployee,@RequestBody Employee l) {
		return this.employeeService.findOne(NumEmployee);
	}
	@RequestMapping(value = "/employees/addEmployee", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Employee> addEmployee(@RequestBody Employee l ) {
		this.employeeService.add(l);
		return this.employeeService.findAll();
	}
	
	@RequestMapping (value="/employees/{NumEmployee}",method=RequestMethod.PUT, headers = "Accept=application/json")
	public Employee update(@PathVariable Long NumEmployee,@RequestBody Employee l) {
		l.setNumEmployee(NumEmployee);
		return this.employeeService.update(l);
	}
	@RequestMapping (value="/employees/{NumEmployee}",method=RequestMethod.DELETE)
	public boolean supmrimer(@PathVariable Long NumEmployee) {
		employeeService.supprimer(NumEmployee);
		return true;
	}

}
