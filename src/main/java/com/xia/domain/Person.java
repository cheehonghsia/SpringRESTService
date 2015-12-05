package com.xia.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	@Id
	private String id;
	private String givenName;
	private String familyName;
	private int age;
	
	@SuppressWarnings("unused")
	private Person(){};

	public Person(String id, String givenName, String familyName, int age){
		this.id = id;
		this.givenName = givenName;
		this.familyName = familyName;
		this.age = age;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
