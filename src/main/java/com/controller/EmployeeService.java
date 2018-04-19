package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Address;
import com.model.Employee;

@Controller
@RequestMapping("/")
public class EmployeeService {
	
	@ResponseBody
	@RequestMapping(value="/listEmp",method=RequestMethod.GET)
	private List<Employee> listPersons() 
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100,"Munwar",new Address("Hyderabad")));
		employees.add(new Employee(101,"Ramesh",new Address("Chennai")));
		
 		return employees;
	}

}
