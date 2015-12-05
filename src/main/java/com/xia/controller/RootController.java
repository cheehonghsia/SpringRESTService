package com.xia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xia.domain.Person;
import com.xia.exceptions.PersonNotFoundException;
import com.xia.service.PersonService;

@RestController
@RequestMapping(value = "/rest")
public class RootController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/insanitycheck", method = RequestMethod.GET)
	public String insanityCheck() {

		return "OK";
	}
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Person> getPersonById(@PathVariable("id") String id) {
		
		Person person = personService.getPersonById(id);
		
		if(person == null){
			throw new PersonNotFoundException("Unique001", "Person not found");
		}
		
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public ResponseEntity<Person> createUser(@RequestBody Person person) {

		personService.createPerson(person);
		return new ResponseEntity<Person>(person, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/person/count", method = RequestMethod.GET)
	public int getPersonCount() {
		
		return personService.getPersonCount();

	}

}
