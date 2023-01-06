package com.nisum.bootdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class FirstController {
	@GetMapping("/hello") //request mapping method
//	@ResponseBody
	public String sayHello() {
		return "Hey How Are You...hope doing good";
	}
//	@PostMapping("/bye")
//	@ResponseBody
//	public String xyz
} 
