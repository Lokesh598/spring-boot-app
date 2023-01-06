package com.nisum.bootdemo1.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.nisum.bootdemo1.beans.Employee;

@Repository
public class EmployeeDAO {
	ArrayList<Employee> elist = new ArrayList<>();
	
	public EmployeeDAO() {
		elist.add(new Employee(101,"Lokesh", 10000, 10));
		elist.add(new Employee(102, "balaa", 30000, 20));
		elist.add(new Employee(103, "charan", 2000, 30));
		elist.add(new Employee(104, "Dinesh", 4000, 40));
	}
	
	public Employee findEmployeeById(int empid) {
		for(Employee e:elist)
			if(e.getEmpid() == empid)
				return e;
		return null;
	}
	public ArrayList<Employee> findAllEmployees() {
		return elist;
	}
}
