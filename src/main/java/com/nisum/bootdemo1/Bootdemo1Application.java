package com.nisum.bootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nisum.bootdemo1.beans.Address;
import com.nisum.bootdemo1.beans.Employee;
@Configuration
@SpringBootApplication
//@ComponentScan(basePackages="xyz.abc")
public class Bootdemo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Bootdemo1Application.class, args);
		
		ConfigurableApplicationContext container = SpringApplication.run(Bootdemo1Application.class, args);
	//	Employee e = container.getBean(Employee.class);
//		Address add = container.getBean(Address.class);
	//	System.out.println(e.getEmpid()+ " " +e.getEname()+ " " + e.getSalary());
//		System.out.println(e.getAddress().getHno()+ " "+ e.getAddress().getStreetName()+" "+e.getAddress().getCity()+" "+ e.getAddress().getState());
		
	}

}

