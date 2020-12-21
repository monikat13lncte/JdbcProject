package com.coforge.SpringEx.SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.SpringEx.SpringJDBC.entity.Laptop;
import com.coforge.SpringEx.SpringJDBC.entity.Person;
@Repository
@Qualifier("laptopDao")
public class LaptopDaoImpl implements Laptopdao {
	@Autowired 
	JdbcTemplate jdbcTemplate; 
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO laptop (serial_no ,  processor," 
				+ " graphic_Card, ram,company,price) VALUES (?, ?, ?, ?,?,?)", 
				laptop.getSerialNo(), laptop.getProcessor(), laptop.getGraphicCard(), laptop.getRam(),laptop.getCompany(),laptop.getPrice()); 
					System.out.println("laptop Added!!");
					
	}

	public void editLaptop(Laptop laptop, int serialNo) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("UPDATE laptop SET serial_no = ? , " 
				+ "processor = ? , graphic_Card = ?,ram=?,company = ?,price = ? WHERE serial_no = ? ", 
				laptop.getSerialNo(), laptop.getProcessor(), laptop.getGraphicCard(), laptop.getRam(),laptop.getCompany(),laptop.getPrice(), serialNo); 
					System.out.println("Laptop Updated!!"); 
	}
	@SuppressWarnings("rawtypes") 
	public List<Laptop> findAll() {
		@SuppressWarnings("unchecked") 
		List <Laptop> laptop = jdbcTemplate.query("SELECT * FROM laptop", new BeanPropertyRowMapper(Laptop.class)); 
		return laptop; 
	}

}
