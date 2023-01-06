package com.nisum.bootdemo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.bootdemo1.beans.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
