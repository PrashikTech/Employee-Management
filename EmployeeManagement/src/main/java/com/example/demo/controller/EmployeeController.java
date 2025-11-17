package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	EmployeeService es = new EmployeeService();

	@PostMapping("addEmployee")
	String addEmployee(Employee e) {

		return es.saveEmployee(e);

	}

	@GetMapping("getEmployee")
	Employee getEmployee() {
		return es.getEmployeefromDb();

	}

}
