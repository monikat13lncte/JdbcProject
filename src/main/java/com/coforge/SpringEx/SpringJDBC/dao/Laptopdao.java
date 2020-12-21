package com.coforge.SpringEx.SpringJDBC.dao;

import java.util.List;

import com.coforge.SpringEx.SpringJDBC.entity.Laptop;
import com.coforge.SpringEx.SpringJDBC.entity.Person;

public interface Laptopdao {
	public void addLaptop(Laptop laptop);
	   public void editLaptop(Laptop laptop, int serialNo);
	   public List<Laptop> findAll();
}
