package com.xia.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xia.domain.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertPerson(Person person) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(person);
	}

	@Override
	public Person getPersonById(String id) {
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Person.class);
		return (Person) criteria.add(Restrictions.eq("id", id)).uniqueResult();
	}

	@Override
	public int getPersonCount() {

		return sessionFactory.getCurrentSession().createCriteria(Person.class).list().size();
	}

}
