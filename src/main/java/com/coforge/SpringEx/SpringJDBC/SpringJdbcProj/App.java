package com.coforge.SpringEx.SpringJDBC.SpringJdbcProj;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.coforge.SpringEx.SpringJDBC.config.ApplicationConfig;
import com.coforge.SpringEx.SpringJDBC.entity.Person;
import com.coforge.SpringEx.SpringJDBC.service.PersonService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
    	PersonService personService = (PersonService) context.getBean("personService"); 
    	Person Kapil = new Person(7, "Kapil", "Dev", 64); 
    	Person Sachin = new Person(8, "Sachin", "Tendulkar", 44); 
    	Person Virat = new Person(9, "Virat", "Kohli", 31); 
    	
    	personService.addPerson(Kapil); 
    	personService.addPerson(Sachin); 
    	personService.addPerson(Virat); 
    	
    	System.out.println("Find All"); 
    	List < Person > persons = personService.findAll(); 
    	for (Person person: persons) { 
    		System.out.println(person); 
    		} 
    	System.out.println("Delete person Id = 3");
    	int deleteMe = 3; personService.deletePerson(deleteMe); 
    	Kapil.setFirstName("Kapil - Updated"); 
    	Kapil.setLastName("Paaji - Updated"); 
    	Kapil.setAge(62); 
    	System.out.println("Update person Id = 1");
    	
    	int updateMe = 4; 
    	personService.editPerson(Kapil, updateMe); 
    	System.out.println("Find person Id = 2"); 
    	Person person = personService.find(2); 
    	System. out. println(person); 
    	System.out.println("Find All Again"); 
    	persons = personService.findAll(); 
    	for (Person p: persons) { 
    		System.out.println(p); 
    	} 
    	context.close(); 

	}

}
