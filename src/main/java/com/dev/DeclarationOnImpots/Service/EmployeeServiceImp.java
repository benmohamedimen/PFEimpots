package com.dev.DeclarationOnImpots.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired 
	private EmployeeRepository employeeRepository;
	@Override
	public void add(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee update(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return (List<Employee>) this.employeeRepository.findAll();
	}

	@Override
	public Employee findOne(Long NumEmployee) {
		
		return this.employeeRepository.findOne(NumEmployee);
	}

	@Override
	public boolean supprimer(Long NumEmployee) {
	employeeRepository.deleteById(NumEmployee);
		return true;
	}

}
