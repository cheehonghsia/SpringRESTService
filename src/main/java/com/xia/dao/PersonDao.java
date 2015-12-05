package com.xia.dao;

import com.xia.domain.Person;

public interface PersonDao {
	
	public void insertPerson(Person person);
	
	public Person getPersonById(String id);

	public int getPersonCount();

}
