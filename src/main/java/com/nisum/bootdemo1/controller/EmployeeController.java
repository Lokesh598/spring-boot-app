package com.nisum.bootdemo1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.bootdemo1.beans.Employee;
import com.nisum.bootdemo1.dao.EmployeeDAO;
import com.nisum.bootdemo1.dao.EmployeeRepository;
import com.nisum.bootdemo1.service.EmployeeService;

@CrossOrigin(origins = {"http://localhost:4200"}) //cross origin resource sharing
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
//	EmployeeRepository employeeRepository;
	EmployeeService employeeService;
	public void setEmployeeRepository(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
//	EmployeeDAO edao;
//	public void setEdao(EmployeeDAO edao) {
//		this.edao = edao;
//	}
	
	@GetMapping(value = "/{employeeId}", produces = "application/json")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId) {
//		Optional<Employee> emp =  employeeRepository.findById(employeeId);
//		if(emp.isPresent())
//			return emp.get();
//		return null;
		Employee emp = employeeService.findEmployeeById(employeeId);
		if(emp!=null)
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getEmployee() {
		return new ResponseEntity<List<Employee>>(employeeService.findAllEmployee(),HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json")
	public HttpStatus addEmployee(@RequestBody Employee employee) {
		Employee e = employeeService.insertOrModifyEmployee(employee);
		if(e!=null) return HttpStatus.OK;
		
		return HttpStatus.NOT_MODIFIED;
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public HttpStatus modifyEmployee(@RequestBody Employee employee) {
		Employee e = employeeService.insertOrModifyEmployee(employee);
		if(e!=null) return HttpStatus.OK;
		
		return HttpStatus.NOT_MODIFIED;
	}
	
	@DeleteMapping(value = "/{employeeId}")
	public HttpStatus deleteEmployee(@PathVariable int employeeId) {
		if(employeeService.deleteEmployeeById(employeeId))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
} 
