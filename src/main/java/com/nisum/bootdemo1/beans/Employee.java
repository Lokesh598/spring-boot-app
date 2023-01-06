package com.nisum.bootdemo1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//@Component
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int empid;
	@Column(name="emp_name")
	private String ename;
	@Column(name="emp_sal")
	private double salary;
	@Column(name="emp_dept")
	private int deptno;
//	@Autowired	
//	private Address address;
	
	public Employee() {}
	public Employee(int empid, String ename, double salary, int deptno) {
		this.empid = empid;  this.ename = ename;
		this.salary = salary; this.deptno = deptno;
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
	
}
