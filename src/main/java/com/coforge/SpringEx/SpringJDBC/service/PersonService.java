package com.coforge.SpringEx.SpringJDBC.service;

import java.util.List;

import com.coforge.SpringEx.SpringJDBC.entity.Person;

public interface PersonService {
	 public void addPerson(Person person);
	   public void editPerson(Person person, int personID);
		public void deletePerson(int personId);
		public Person find(int personId);
		public List<Person> findAll();
}
