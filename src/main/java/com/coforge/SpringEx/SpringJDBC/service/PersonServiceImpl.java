package com.coforge.SpringEx.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coforge.SpringEx.SpringJDBC.dao.PersonDao;
import com.coforge.SpringEx.SpringJDBC.entity.Person;
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.addPerson(person);
	}

	public void editPerson(Person person, int personID) {
		// TODO Auto-generated method stub
		personDao.editPerson(person, personID);
	}

	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		personDao.deletePerson(personId);
	}

	public Person find(int personId) {
		// TODO Auto-generated method stub
		
		return personDao.find(personId);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		
		return personDao.findAll();
	}

}
