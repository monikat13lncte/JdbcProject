package com.coforge.SpringEx.SpringJDBC.SpringJdbcProj;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.coforge.SpringEx.SpringJDBC.config.ApplicationConfig;
import com.coforge.SpringEx.SpringJDBC.entity.Laptop;
import com.coforge.SpringEx.SpringJDBC.entity.Person;
import com.coforge.SpringEx.SpringJDBC.service.LaptopService;
import com.coforge.SpringEx.SpringJDBC.service.PersonService;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		LaptopService laptopService = (LaptopService) context.getBean("laptopService"); 
    	Laptop Hp = new Laptop(1,"abc","def","ghi","klm","60000"); 
    	Laptop Asus = new Laptop(2,"abc","def","ghi","klm","60000"); 
    	Laptop dell = new Laptop(3,"abc","def","ghi","klm","60000"); 
    	laptopService.addLaptop(Hp);
    	laptopService.addLaptop(dell);
    	laptopService.addLaptop(Asus);
    	int ser = 3; 
    	laptopService.editLaptop(Hp, ser);
    	System.out.println("Find All Again");
    	List < Laptop > laptop = laptopService.findAll();
    	laptop = laptopService.findAll(); 
    	for (Laptop l: laptop) { 
    		System.out.println(l); 
    	} 
    	
	}

}
