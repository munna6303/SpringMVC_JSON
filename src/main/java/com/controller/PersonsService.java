package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Person;

@RestController
@RequestMapping("/")
public class PersonsService {
	
	@RequestMapping(value="/listPersons",method=RequestMethod.GET)
	private List<Person> listPersons() 
	{
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(100,"AAA","29"));
		persons.add(new Person(200,"BBB","10"));
		persons.add(new Person(300,"CCC","13"));
		persons.add(new Person(400,null,"29"));
		
 		return persons;
	}

}
