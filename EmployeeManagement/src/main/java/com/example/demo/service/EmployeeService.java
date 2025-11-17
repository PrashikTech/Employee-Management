package com.example.demo.service;

import com.example.demo.entity.Employee;

public class EmployeeService {

	public String saveEmployee(Employee e) {
		if (e.getAge() < 21) {
			return "You are not applicable";
		}
		return "you are added";
	}

	public Employee getEmployeefromDb() {

		Employee e = new Employee();
		e.setName("Smith");
		e.setAge(22);
		e.setAddress("Delhi");
		e.setEmail("s@gmail.com");
		return e;

	}

}
