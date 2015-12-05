package com.xia.service;

import com.xia.domain.Person;

public interface PersonService {
	
	public Person getPersonById(String id);

	public void createPerson(Person person);

	public int getPersonCount();

}
