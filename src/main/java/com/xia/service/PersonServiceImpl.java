package com.xia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xia.dao.PersonDao;
import com.xia.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired PersonDao personDao;

	@Override
	public Person getPersonById(String id) {
		return personDao.getPersonById(id);
	}

	@Override
	public void createPerson(Person person) {
		personDao.insertPerson(person);
		
	}

	@Override
	public int getPersonCount() {
		return personDao.getPersonCount();
	}

}
